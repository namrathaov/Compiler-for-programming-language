package edu.asu.ser502.utils;

/**
 * This class contains exceptions for ESCN language 
 *
 * @author Rhythm Sharma
 * @version 1.0
 */

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class EscnErrorListener extends BaseErrorListener {

	public static final EscnErrorListener INSTANCE = new EscnErrorListener();

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) throws ParseCancellationException {
		throw new ParseCancellationException("Syntax error at line " + line + ":" + charPositionInLine + "\n" + msg);
	}
	
	public void escnException(String message) {
		System.out.println(message);
		System.exit(0);
	}
	
	
}
