// Generated from Escn.g4 by ANTLR 4.7.1

package edu.asu.ser502.antlrService;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EscnParser}.
 */
public interface EscnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EscnParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EscnParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EscnParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EscnParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EscnParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EscnParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EscnParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStmt(EscnParser.DeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStmt(EscnParser.DeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(EscnParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(EscnParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void enterControlStmt(EscnParser.ControlStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void exitControlStmt(EscnParser.ControlStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(EscnParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(EscnParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(EscnParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(EscnParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#ifSection}.
	 * @param ctx the parse tree
	 */
	void enterIfSection(EscnParser.IfSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#ifSection}.
	 * @param ctx the parse tree
	 */
	void exitIfSection(EscnParser.IfSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#elseSection}.
	 * @param ctx the parse tree
	 */
	void enterElseSection(EscnParser.ElseSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#elseSection}.
	 * @param ctx the parse tree
	 */
	void exitElseSection(EscnParser.ElseSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(EscnParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(EscnParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#logicalStmt}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStmt(EscnParser.LogicalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#logicalStmt}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStmt(EscnParser.LogicalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(EscnParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(EscnParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EscnParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EscnParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(EscnParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(EscnParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(EscnParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(EscnParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(EscnParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(EscnParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(EscnParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(EscnParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(EscnParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(EscnParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EscnParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(EscnParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link EscnParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(EscnParser.BoolContext ctx);
}