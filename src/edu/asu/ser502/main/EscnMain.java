package edu.asu.ser502.main;


/**
 * This is the entry point for ESCN compiler. Input file will be read from 
 * command line args. Intermediate code file will get created and passed to
 * the runtime.
 *
 * @author Rhythm Sharma
 * @version 1.0
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import edu.asu.ser502.antlrService.*;
import edu.asu.ser502.utils.EscnErrorListener;

public class EscnMain {

	public static void main(String[] args) throws ParseCancellationException {
		EscnLexer escnLexer = null;
		EscnParser escnParser = null;
		ParseTree parseTree = null;
		ParseTreeWalker walker = null;
		String inputFile = args[0];
		if (inputFile == null || inputFile.trim().length() == 0) {
			System.out.println("Input file name is missing.");
		} else if (!inputFile.substring(inputFile.lastIndexOf(".") + 1).equalsIgnoreCase("escn")) {
			System.out.println("File format not supported.");
		}

		try {
			escnLexer = new EscnLexer(new ANTLRFileStream(inputFile));
			escnLexer.addErrorListener(EscnErrorListener.INSTANCE);
			escnParser = new EscnParser(new CommonTokenStream(escnLexer));
			escnParser.addErrorListener(EscnErrorListener.INSTANCE);
			parseTree = escnParser.program();
			walker = new ParseTreeWalker();
			walker.walk(new EscnCustomListener(), parseTree);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String icfName = inputFile.substring(0, inputFile.lastIndexOf("."));
		generateICFile(icfName + ".icf");
	}

	/**
     * writes the icfContent into intermediate code file
     *
     * @param icfName intermediate code file name
     */
	private static void generateICFile(String icfName) {
		try {
			ArrayList<String> icfContent = EscnCustomListener.getIcfContent();
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(icfName));
			for (String str : icfContent)
				bufferedWriter.write(str + "\n");
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


