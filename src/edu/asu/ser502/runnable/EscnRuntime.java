package edu.asu.ser502.runnable;

/**
 * EscnRuntime generates the result using the intermediate code file
 * by performing necessary operations.
 *
 * @author Namratha Olety Venkatesh
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.asu.ser502.utils.EscnUtils;

public class EscnRuntime {
	static EscnUtils escnUtils= EscnUtils.getEscnUtilsInstance();
	private static EscnRuntime runObject;
	private static BufferedReader bufferedReader;
	private static int operand1,operand2;
	private static String opStr1;
	String opcode,operand;
	public static EscnRuntime getInstance() {
		if(runObject == null) {
			runObject = new EscnRuntime();
		}
		return runObject;
	}
	/*
	 * Initial parsing to convert input file into ArrayList
	 * */
	public static ArrayList<String> parseICF(String filename) {
		String i=null;
		ArrayList<String> icfContents = new ArrayList<>();
		if(!filename.contains(".icf")) {
			System.out.println("Please input a file of format .icf");
			System.exit(0);
		}
		try{
			bufferedReader = new BufferedReader(new FileReader(filename));
			while((i=bufferedReader.readLine())!=null) {
				icfContents.add(i);
			}
			return icfContents;
		}catch (IOException e) {
			System.out.println("Could not access the input file");
		}
		finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new ArrayList<String>();
	}
	/*
	 * Split every line of ICF into opcodes and operands and call appropriate
	 * function to handle each operation
	 * */
	public static void parseTokens(ArrayList<String> icfContents) {
		int x=1;
		String opcode,operand,instr;
		List<String> constructArray = null;
		while(x<=icfContents.size()) {
			instr = icfContents.get(x-1);

			if(instr.indexOf(" ")>0)
				opcode=instr.substring(0,instr.indexOf(" "));
			else opcode = icfContents.get(x-1);
			operand=instr.substring(instr.indexOf(" ")+1);
			switch(opcode) {
			case "NUM":  escnUtils.updateIdentifierTable(operand,"NUM");
			escnUtils.updateSymbolTable(operand, "");
			break;
			case "BOOL": escnUtils.updateIdentifierTable(operand,"BOOL");
			escnUtils.updateSymbolTable(operand, "");
			break;
			case "SET":  doAssign(operand);
			break;
			case "OUT":  doPrint(opcode,operand);
			break;
			case "ADD":  doArithmetic(opcode,operand);
			break;
			case "SUB":  doArithmetic(opcode,operand);
			break;
			case "MUL":  doArithmetic(opcode,operand);
			break;
			case "DIV":  doArithmetic(opcode,operand);
			break;
			case "GT": doLogical(opcode,operand);
			break;
			case "LT": doLogical(opcode,operand);
			break;
			case "EQ": doLogical(opcode,operand);
			break;
			case "NEQ": doLogical(opcode,operand);
			break;
			case "GTE": doLogical(opcode,operand);
			break;
			case "LTE": doLogical(opcode,operand);
			break;
			case "IF":   constructArray = icfContents.subList(x,icfContents.indexOf("ENDIF"));
			doIf(operand,constructArray); 
			x=icfContents.indexOf("ENDIF");
			break;
			case "ALA":  constructArray = icfContents.subList(x,icfContents.indexOf("GOBACK"));
			doWhile(constructArray,operand);   
			x = icfContents.indexOf("GOBACK");
			break;
			}
			x++;
		}				
	}
	/*  Handling assignment operator */
	public static void doAssign(String operand) {
		try{
			String dataType = escnUtils.getIdentifierType(operand.split(",")[0]);
		}
		catch(Exception e){
			System.out.println("Error: Trying to assign value to undeclared variable");
		}
		if(escnUtils.getSymbolTableValue(operand.split(",")[1])!=null) {
			escnUtils.updateSymbolTable(operand.split(",")[0], escnUtils.getSymbolTableValue(operand.split(",")[1]));
		}
		else {
			escnUtils.updateSymbolTable(operand.split(",")[0], operand.split(",")[1]);
		}
	}

	public static void doPrint(String opcode, String operand) {
		if(operand.contains("LT")||operand.contains("LTE")||operand.contains("GT")||operand.contains("GTE")||operand.contains("EQ")||operand.contains("NEQ")) {
			opcode=operand.split(",")[0];
			opStr1=operand.split(",")[1]+","+operand.split(",")[2];
			doLogical(opcode,opStr1);
		}
		else if(operand.contains(",")){
			opcode=operand.split(" ")[0];
			operand=operand.split(" ")[1];
		}
		else {
			System.out.println(escnUtils.getSymbolTableValue(operand));
		}
	}


	/* Handling Arithmetic operations */
	public static void doArithmetic(String opcode, String operand) {
		try {
			if (escnUtils.getSymbolTableValue(operand.split(",")[0]) != null) {
				operand1 = Integer.parseInt(escnUtils.getSymbolTableValue(operand.split(",")[0]));
			} else
				operand1 = Integer.parseInt(operand.split(",")[0]);

			if (escnUtils.getSymbolTableValue(operand.split(",")[1]) != null) {
				operand2 = Integer.parseInt(escnUtils.getSymbolTableValue(operand.split(",")[1]));
			} else
				operand2 = Integer.parseInt(operand.split(",")[1]);
		}
		catch (NumberFormatException e){
			System.out.println("Cannot perform arithmetic operations on undeclared/non-integer operand");
		}
		if(opcode.equals("ADD")) {
			escnUtils.updateSymbolTable(operand.split(",")[0],String.valueOf(operand1+operand2));
		}
		if(opcode.equals("SUB")) {
			escnUtils.updateSymbolTable(operand.split(",")[0],String.valueOf(operand1-operand2));
		}
		if(opcode.equals("MUL")) {
			escnUtils.updateSymbolTable(operand.split(",")[0],String.valueOf(operand1*operand2));
		}
		if(opcode.equals("DIV")) {
			try {
				escnUtils.updateSymbolTable(operand.split(",")[0],String.valueOf((int)operand1/operand2));
			}
			catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero");
			}
		}
	}
	/* Handling Relational Operators */
	public static boolean doRelational(String opcode, String operand1,String operand2) {
		int op1=0,op2=0;
		int flag=-1;
		boolean oper1=false,oper2=false;
		try{
			if(operand1!=null && (operand1.equals("true")||operand1.equals("false"))
					&&(operand2.equals("true")||operand2.equals("false"))) {
				oper1=Boolean.parseBoolean(operand1);
				oper2=Boolean.parseBoolean(operand2);
				flag=1;
			}
			if(flag==-1&&escnUtils.getIdentifierType(operand1)!=null&&escnUtils.getIdentifierType(operand2)!=null) {
				if(escnUtils.getIdentifierType(operand1).equals("NUM")
						&& escnUtils.getIdentifierType(operand2).equals("NUM")){
					op1 = Integer.parseInt(escnUtils.getSymbolTableValue(operand1));
					op2 = Integer.parseInt(escnUtils.getSymbolTableValue(operand2));
					flag=0;
				}
				else if(escnUtils.getIdentifierType(operand1).equals("BOOL")
						&&escnUtils.getIdentifierType(operand2).equals("BOOL")){
					oper1 = Boolean.parseBoolean(escnUtils.getSymbolTableValue(operand1));
					oper2 = Boolean.parseBoolean(escnUtils.getSymbolTableValue(operand2));
					flag=1;
				}}

			if(flag==-1) {
				if(operand1!=null && Integer.parseInt(operand1)>0) {

					op1=Integer.parseInt(operand1);
					flag=0;
				}
				if(operand2!=null && Integer.parseInt(operand2)>0) {
					op2=Integer.parseInt(operand2);
					flag=0;
				}
			}
			if(flag==-1) {
				System.out.println("Incorrect data types");
				return false;
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Incorrect data types");
		}
		switch(opcode) {
		case "LTE":if(op1<=op2)return true;
		return false;
		case "LT": if(op1<op2) return true;
		return false;
		case "GTE": if(op1>=op2) return true;
		return false;
		case "GT": if(op1>op2) return true;
		return false;
		case "EQ": 
			if(flag==0) {
				if(op1==op2) return true;
				return false;
			}
			else if(flag==1) {
				return oper1&&oper2;
			}
		case "NEQ": 
			if(flag==0) {
				if(op1!=op2) return true;
				return false;
			}
			else if(flag==1){
				return (!(oper1&&oper2));
			}
		}
		return false;
	}
	/* Handling Logical Operators */
	public static void doLogical(String opcode, String operand) {
		int op1=0,op2=0;
		int flag=-1;
		boolean oper1=false,oper2=false;
		String operand1 = operand.split(",")[0];
		String operand2 = operand.split(",")[1];
		try{
			if(operand1!=null && (operand1.equals("true")||operand1.equals("false"))
					&&(operand2.equals("true")||operand2.equals("false"))) {
				oper1=Boolean.parseBoolean(operand1);
				oper2=Boolean.parseBoolean(operand2);
				flag=1;
			}
			if(flag==-1&&escnUtils.getIdentifierType(operand1)!=null&&escnUtils.getIdentifierType(operand2)!=null) {
				if(escnUtils.getIdentifierType(operand1).equals("NUM")
						&& escnUtils.getIdentifierType(operand2).equals("NUM")){
					op1 = Integer.parseInt(escnUtils.getSymbolTableValue(operand1));
					op2 = Integer.parseInt(escnUtils.getSymbolTableValue(operand2));
					flag=0;
				}
				else if(escnUtils.getIdentifierType(operand1).equals("BOOL")
						&&escnUtils.getIdentifierType(operand2).equals("BOOL")){
					oper1 = Boolean.parseBoolean(escnUtils.getSymbolTableValue(operand1));
					oper2 = Boolean.parseBoolean(escnUtils.getSymbolTableValue(operand2));
					flag=1;
				}
				}
			if(flag==-1) {
				if(operand1!=null && (Boolean.parseBoolean(operand1)==true||Boolean.parseBoolean(operand1)==false)) {

					oper1=Boolean.parseBoolean(operand1);
					flag=1;
				}
				if(operand2!=null && (Boolean.parseBoolean(operand2)==true||Boolean.parseBoolean(operand2)==false)) {

					oper2=Boolean.parseBoolean(operand2);
					flag=1;
				}
				if(flag!=1&&operand1!=null && Integer.parseInt(operand1)>0) {
					op1=Integer.parseInt(operand1);
					flag=0;
				}
				if(flag!=1&&operand2!=null && Integer.parseInt(operand2)>0) {
					op2=Integer.parseInt(operand2);
					flag=0;
				}
			}
			if(flag==-1) {
				System.out.println("Incorrect data types");
			}
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Incorrect data types");
		}
		switch(opcode) {
		case "LTE":if(op1<=op2) {
			escnUtils.updateSymbolTable(operand1, "true");
		}
		else {
			escnUtils.updateSymbolTable(operand1, "false");
		}
		return;
		case "LT": if(op1<op2) {
			escnUtils.updateSymbolTable(operand1, "true");
		}
		else {
			escnUtils.updateSymbolTable(operand1, "false");
		}
		return;
		case "GTE": if(op1>=op2){
			escnUtils.updateSymbolTable(operand1, "true");
		}
		else {
			escnUtils.updateSymbolTable(operand1, "false");
		}
		return;
		case "GT": if(op1>op2) {
			escnUtils.updateSymbolTable(operand1, "true");
		}
		else {
			escnUtils.updateSymbolTable(operand1, "false");
		}
		return;
		case "EQ": 
			if(flag==0) {
				if(op1==op2) {
					escnUtils.updateSymbolTable(operand1, "true");
				}
				else {
					escnUtils.updateSymbolTable(operand1, "false");
				}
				return;
			}
			else if(flag==1) {
				escnUtils.updateSymbolTable(operand1, "true");
			}
			else {
				escnUtils.updateSymbolTable(operand1, "false");
			}
			return;
		case "NEQ": 
			if(flag==0) {
				if(op1!=op2) {
					escnUtils.updateSymbolTable(operand1, "true");
				}
				else {
					escnUtils.updateSymbolTable(operand1, "false");
				}
				return;
			}
			else if(flag==1){
				boolean valid=(!(oper1&&oper2));
				if(valid)
				{
					escnUtils.updateSymbolTable(operand1, "true");
				}
				else {
					escnUtils.updateSymbolTable(operand1, "false");
				}
				return;
			}
		}
		return;
	}

	/* Handling IF/ELSE statements */
	public static void doIf(String operand,List<String> ifElseContents) {
		List<String> ifContents = null;
		List<String> elseContents = null;
		
		if (ifElseContents.contains("ELSE")) {
			ifContents = ifElseContents.subList(0,ifElseContents.indexOf("ELSE"));
			elseContents = ifElseContents.subList(ifElseContents.indexOf("ELSE")+1,ifElseContents.size());
			if(escnUtils.getSymbolTableValue(operand).equals("true")) {
				runLoop(ifContents);
			}
			else {
				runLoop(elseContents);
			}
		}
		else{
			ifContents = ifElseContents.subList(0,ifElseContents.size());
			if(escnUtils.getSymbolTableValue(operand).equals("true")) {
				runLoop(ifContents);
			}
		}
	}
	/*
	 * call this function each time there is an if loop or while loop
	 * */
	public static void runLoop(List<String> conditionalContents){
		int x=0;
		String conditionalOpcode,conditionalOperand,instr;
		while(x<conditionalContents.size()) {
			instr = conditionalContents.get(x);
			//System.out.println(instr);
			conditionalOpcode=instr.substring(0,instr.indexOf(" "));
			conditionalOperand=instr.substring(instr.indexOf(" ")+1);

			switch(conditionalOpcode) {
			case "NUM":  escnUtils.updateIdentifierTable(conditionalOperand,"NUM");
			escnUtils.updateSymbolTable(conditionalOperand, "");
			break;
			case "BOOL": escnUtils.updateIdentifierTable(conditionalOperand,"BOOL");
			escnUtils.updateSymbolTable(conditionalOperand, "");
			break;
			case "SET":  doAssign(conditionalOperand);
			break;
			case "OUT":  doPrint(conditionalOpcode,conditionalOperand);
			break;
			case "ADD":  doArithmetic(conditionalOpcode,conditionalOperand);
			break;
			case "SUB":  doArithmetic(conditionalOpcode,conditionalOperand);
			break;
			case "MUL":  doArithmetic(conditionalOpcode,conditionalOperand);
			break;
			case "DIV":  doArithmetic(conditionalOpcode,conditionalOperand);
			break;
			case "GT": doLogical(conditionalOpcode,conditionalOperand);
			break;
			case "LT": doLogical(conditionalOpcode,conditionalOperand);
			break;
			case "EQ": doLogical(conditionalOpcode,conditionalOperand);
			break;
			case "NEQ": doLogical(conditionalOpcode,conditionalOperand);
			break;
			case "GTE": doLogical(conditionalOpcode,conditionalOperand);
			break;
			case "LTE": doLogical(conditionalOpcode,conditionalOperand);
			break;
			}
			x++;
		}
	}
	/*Handling while construct*/
	public static void doWhile(List<String> icfContents, String operand) {
		String opcode=operand.split(" ")[0];
		String operand1=operand.split(" ")[1].split(",")[0];
		String operand2=operand.split(" ")[1].split(",")[1];
		while(doRelational(opcode,operand1,operand2)) {
			runLoop(icfContents);
		}
	}
}