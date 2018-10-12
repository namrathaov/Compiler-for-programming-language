package edu.asu.ser502.utils;

/**
 * This class conatins all the helper function required across escn interpreter and runtime.
 *
 * @author Rhythm Sharma
 * @version 1.0
 */
import java.util.HashMap;
import java.util.Map.Entry;

public class EscnUtils {
	
	private static EscnUtils _instance;
	private static HashMap<String, String> _identifierTable = new HashMap<>();
	public static HashMap<String, String> symbolTable = new HashMap<>();
	
	public static EscnUtils getEscnUtilsInstance(){
		if(_instance == null)
		{
			_instance = new EscnUtils();
		}
		return _instance;
	}
	
	public HashMap<String, String> getIdentifierTable() {
		return _identifierTable;
	}
	
	public boolean updateIdentifierTable(String identifier, String dataType) {
		
		String result = _identifierTable.putIfAbsent(identifier, dataType);
		if(result == null)
			return true;
		else
			return false;
	}
	
	public void updateSymbolTable(String var, String val) {
		symbolTable.put(var, val);
	}
	
	public String getSymbolTableKey(String value) {
		if(symbolTable.containsValue(value)) {
			for(Entry<String, String> pair:symbolTable.entrySet()) {
				if(pair.getValue().equals(value))
					return pair.getKey();
			}
		}
		return null;
	}
	
	public String getIdentifierType(String key) {
		if(_identifierTable.containsKey(key)) {
			for(Entry<String, String> pair:_identifierTable.entrySet()) {
				if(pair.getKey().equals(key))
					return pair.getValue();
			}
		}
		return null;
	}

	public String getSymbolTableValue(String key) {
		if(symbolTable.containsKey(key)) {
			for(Entry<String, String> pair:symbolTable.entrySet()) {
				if(pair.getKey().equals(key))
					return pair.getValue();
			}
		}
		return null;
	}
	
	/**
     * Returns the arithmetic operator if Present,
     * null otherwise
     *
     * @param expr
     */
	public String getArithmeticOperator(String expr) {
		if (expr.contains("+")) {
			return "ADD";
		} else if (expr.contains("-")) {
			return "SUB";
		} else if (expr.contains("*")) {
			return "MUL";
		} else if (expr.contains("/")) {
			return "DIV";
		} else {
			return null;
		}
	}

	public String getLogicalOperator(String stmt) {
		if (stmt.contains(">")) {
			return "GT";
		} else if (stmt.contains("<")) {
			return "LT";
		} else if (stmt.contains(">=")) {
			return "GTE";
		} else if (stmt.contains("<=")) {
			return "LTE";
		} else if (stmt.contains("==")) {
			return "EQ";
		} else if (stmt.contains("!=")) {
			return "NEQ";
		} else {
			return null;
		}
	}
	
}
