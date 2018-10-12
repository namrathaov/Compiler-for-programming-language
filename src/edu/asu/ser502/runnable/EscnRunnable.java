package edu.asu.ser502.runnable;

import java.util.ArrayList;

/**
 * This is the entry point for ESCN runtime. Intermediate code file will be read from 
 * command line args and result is printed to console. 
 *
 * @author Namratha Olety Venkatesh
 * @version 1.0
 */

public class EscnRunnable {

	public static void main(String[] args) {
		String filename=args[0];
		EscnRuntime.getInstance();
		startExec(filename);
	}
	/*
    * Execution starts here, passes icf to parser
    * */
    public static void startExec(String filename) {
        ArrayList<String> icfContents = EscnRuntime.parseICF(filename);
        if(!icfContents.isEmpty()) {
        	EscnRuntime.parseTokens(icfContents);
        }
    }
}
