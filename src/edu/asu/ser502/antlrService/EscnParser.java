// Generated from Escn.g4 by ANTLR 4.7.1
package edu.asu.ser502.antlrService;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EscnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, Alphabet=29, NUMBER=30, WhiteSpace=31, 
		LineComment=32, BlockComment=33;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_declaration = 2, RULE_declarationStmt = 3, 
		RULE_control = 4, RULE_controlStmt = 5, RULE_assignStmt = 6, RULE_ifStmt = 7, 
		RULE_ifSection = 8, RULE_elseSection = 9, RULE_whileStmt = 10, RULE_logicalStmt = 11, 
		RULE_printStmt = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_identifier = 16, RULE_num = 17, RULE_dataType = 18, RULE_bool = 19;
	public static final String[] ruleNames = {
		"program", "block", "declaration", "declarationStmt", "control", "controlStmt", 
		"assignStmt", "ifStmt", "ifSection", "elseSection", "whileStmt", "logicalStmt", 
		"printStmt", "expr", "term", "factor", "identifier", "num", "dataType", 
		"bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "'stop'", "';'", "'='", "'endif'", "'if'", "'then'", 
		"'else'", "'while'", "'do'", "'endwhile'", "'<='", "'>='", "'<'", "'>'", 
		"'=='", "'!='", "'print'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'int'", 
		"'boolean'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Alphabet", "NUMBER", "WhiteSpace", "LineComment", 
		"BlockComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Escn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EscnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			block();
			setState(42);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			declaration();
			setState(45);
			control();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public List<DeclarationStmtContext> declarationStmt() {
			return getRuleContexts(DeclarationStmtContext.class);
		}
		public DeclarationStmtContext declarationStmt(int i) {
			return getRuleContext(DeclarationStmtContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				declarationStmt();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__24 || _la==T__25 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStmtContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterDeclarationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitDeclarationStmt(this);
		}
	}

	public final DeclarationStmtContext declarationStmt() throws RecognitionException {
		DeclarationStmtContext _localctx = new DeclarationStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			dataType();
			setState(53);
			identifier();
			setState(54);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlContext extends ParserRuleContext {
		public List<ControlStmtContext> controlStmt() {
			return getRuleContexts(ControlStmtContext.class);
		}
		public ControlStmtContext controlStmt(int i) {
			return getRuleContext(ControlStmtContext.class,i);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitControl(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				controlStmt();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__17) | (1L << Alphabet))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlStmtContext extends ParserRuleContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ControlStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterControlStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitControlStmt(this);
		}
	}

	public final ControlStmtContext controlStmt() throws RecognitionException {
		ControlStmtContext _localctx = new ControlStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_controlStmt);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alphabet:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				assignStmt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				ifStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				whileStmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				printStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStmtContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitAssignStmt(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			identifier();
			setState(68);
			match(T__3);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(69);
				identifier();
				}
				break;
			case 2:
				{
				setState(70);
				expr();
				}
				break;
			case 3:
				{
				setState(71);
				bool();
				}
				break;
			}
			setState(74);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public IfSectionContext ifSection() {
			return getRuleContext(IfSectionContext.class,0);
		}
		public ElseSectionContext elseSection() {
			return getRuleContext(ElseSectionContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			ifSection();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(77);
				elseSection();
				}
			}

			setState(80);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfSectionContext extends ParserRuleContext {
		public LogicalStmtContext logicalStmt() {
			return getRuleContext(LogicalStmtContext.class,0);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public IfSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterIfSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitIfSection(this);
		}
	}

	public final IfSectionContext ifSection() throws RecognitionException {
		IfSectionContext _localctx = new IfSectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(83);
			logicalStmt(0);
			setState(84);
			match(T__6);
			setState(85);
			control();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseSectionContext extends ParserRuleContext {
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public ElseSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterElseSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitElseSection(this);
		}
	}

	public final ElseSectionContext elseSection() throws RecognitionException {
		ElseSectionContext _localctx = new ElseSectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__7);
			setState(88);
			control();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public LogicalStmtContext logicalStmt() {
			return getRuleContext(LogicalStmtContext.class,0);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__8);
			setState(91);
			logicalStmt(0);
			setState(92);
			match(T__9);
			setState(93);
			control();
			setState(94);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalStmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<LogicalStmtContext> logicalStmt() {
			return getRuleContexts(LogicalStmtContext.class);
		}
		public LogicalStmtContext logicalStmt(int i) {
			return getRuleContext(LogicalStmtContext.class,i);
		}
		public LogicalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterLogicalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitLogicalStmt(this);
		}
	}

	public final LogicalStmtContext logicalStmt() throws RecognitionException {
		return logicalStmt(0);
	}

	private LogicalStmtContext logicalStmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalStmtContext _localctx = new LogicalStmtContext(_ctx, _parentState);
		LogicalStmtContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logicalStmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alphabet:
				{
				setState(97);
				identifier();
				}
				break;
			case T__26:
			case T__27:
				{
				setState(98);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalStmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalStmt);
						setState(101);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(102);
						match(T__11);
						setState(103);
						logicalStmt(9);
						}
						break;
					case 2:
						{
						_localctx = new LogicalStmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalStmt);
						setState(104);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(105);
						match(T__12);
						setState(106);
						logicalStmt(8);
						}
						break;
					case 3:
						{
						_localctx = new LogicalStmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalStmt);
						setState(107);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(108);
						match(T__13);
						setState(109);
						logicalStmt(7);
						}
						break;
					case 4:
						{
						_localctx = new LogicalStmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalStmt);
						setState(110);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(111);
						match(T__14);
						setState(112);
						logicalStmt(6);
						}
						break;
					case 5:
						{
						_localctx = new LogicalStmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalStmt);
						setState(113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(114);
						match(T__15);
						setState(115);
						logicalStmt(5);
						}
						break;
					case 6:
						{
						_localctx = new LogicalStmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalStmt);
						setState(116);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(117);
						match(T__16);
						setState(118);
						logicalStmt(4);
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicalStmtContext logicalStmt() {
			return getRuleContext(LogicalStmtContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__17);
			setState(125);
			match(T__18);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(126);
				expr();
				}
				break;
			case 2:
				{
				setState(127);
				logicalStmt(0);
				}
				break;
			}
			setState(130);
			match(T__19);
			setState(131);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				term();
				setState(134);
				match(T__20);
				setState(135);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				term();
				setState(138);
				match(T__21);
				setState(139);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				factor();
				setState(145);
				match(T__22);
				setState(146);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				factor();
				setState(149);
				match(T__23);
				setState(150);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alphabet:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				identifier();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Alphabet() { return getToken(EscnParser.Alphabet, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Alphabet);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					identifier();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(EscnParser.NUMBER, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EscnListener ) ((EscnListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return logicalStmt_sempred((LogicalStmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalStmt_sempred(LogicalStmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\6\4\63"+
		"\n\4\r\4\16\4\64\3\5\3\5\3\5\3\5\3\6\6\6<\n\6\r\6\16\6=\3\7\3\7\3\7\3"+
		"\7\5\7D\n\7\3\b\3\b\3\b\3\b\3\b\5\bK\n\b\3\b\3\b\3\t\3\t\5\tQ\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\5\rf\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r\3\16\3\16\3\16\3\16\5\16\u0083"+
		"\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0091\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009c\n"+
		"\20\3\21\3\21\5\21\u00a0\n\21\3\22\3\22\7\22\u00a4\n\22\f\22\16\22\u00a7"+
		"\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\3\30\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\4\3\2\33\34\3\2\35\36\2\u00b0\2*\3\2\2\2"+
		"\4.\3\2\2\2\6\62\3\2\2\2\b\66\3\2\2\2\n;\3\2\2\2\fC\3\2\2\2\16E\3\2\2"+
		"\2\20N\3\2\2\2\22T\3\2\2\2\24Y\3\2\2\2\26\\\3\2\2\2\30e\3\2\2\2\32~\3"+
		"\2\2\2\34\u0090\3\2\2\2\36\u009b\3\2\2\2 \u009f\3\2\2\2\"\u00a1\3\2\2"+
		"\2$\u00a8\3\2\2\2&\u00aa\3\2\2\2(\u00ac\3\2\2\2*+\7\3\2\2+,\5\4\3\2,-"+
		"\7\4\2\2-\3\3\2\2\2./\5\6\4\2/\60\5\n\6\2\60\5\3\2\2\2\61\63\5\b\5\2\62"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66"+
		"\67\5&\24\2\678\5\"\22\289\7\5\2\29\t\3\2\2\2:<\5\f\7\2;:\3\2\2\2<=\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?D\5\16\b\2@D\5\20\t\2AD\5\26\f"+
		"\2BD\5\32\16\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\r\3\2\2\2EF\5"+
		"\"\22\2FJ\7\6\2\2GK\5\"\22\2HK\5\34\17\2IK\5(\25\2JG\3\2\2\2JH\3\2\2\2"+
		"JI\3\2\2\2KL\3\2\2\2LM\7\5\2\2M\17\3\2\2\2NP\5\22\n\2OQ\5\24\13\2PO\3"+
		"\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\7\2\2S\21\3\2\2\2TU\7\b\2\2UV\5\30\r\2"+
		"VW\7\t\2\2WX\5\n\6\2X\23\3\2\2\2YZ\7\n\2\2Z[\5\n\6\2[\25\3\2\2\2\\]\7"+
		"\13\2\2]^\5\30\r\2^_\7\f\2\2_`\5\n\6\2`a\7\r\2\2a\27\3\2\2\2bc\b\r\1\2"+
		"cf\5\"\22\2df\5(\25\2eb\3\2\2\2ed\3\2\2\2f{\3\2\2\2gh\f\n\2\2hi\7\16\2"+
		"\2iz\5\30\r\13jk\f\t\2\2kl\7\17\2\2lz\5\30\r\nmn\f\b\2\2no\7\20\2\2oz"+
		"\5\30\r\tpq\f\7\2\2qr\7\21\2\2rz\5\30\r\bst\f\6\2\2tu\7\22\2\2uz\5\30"+
		"\r\7vw\f\5\2\2wx\7\23\2\2xz\5\30\r\6yg\3\2\2\2yj\3\2\2\2ym\3\2\2\2yp\3"+
		"\2\2\2ys\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\31\3\2\2\2}"+
		"{\3\2\2\2~\177\7\24\2\2\177\u0082\7\25\2\2\u0080\u0083\5\34\17\2\u0081"+
		"\u0083\5\30\r\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0085\7\26\2\2\u0085\u0086\7\5\2\2\u0086\33\3\2\2\2\u0087"+
		"\u0088\5\36\20\2\u0088\u0089\7\27\2\2\u0089\u008a\5\34\17\2\u008a\u0091"+
		"\3\2\2\2\u008b\u008c\5\36\20\2\u008c\u008d\7\30\2\2\u008d\u008e\5\34\17"+
		"\2\u008e\u0091\3\2\2\2\u008f\u0091\5\36\20\2\u0090\u0087\3\2\2\2\u0090"+
		"\u008b\3\2\2\2\u0090\u008f\3\2\2\2\u0091\35\3\2\2\2\u0092\u0093\5 \21"+
		"\2\u0093\u0094\7\31\2\2\u0094\u0095\5\36\20\2\u0095\u009c\3\2\2\2\u0096"+
		"\u0097\5 \21\2\u0097\u0098\7\32\2\2\u0098\u0099\5\36\20\2\u0099\u009c"+
		"\3\2\2\2\u009a\u009c\5 \21\2\u009b\u0092\3\2\2\2\u009b\u0096\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\37\3\2\2\2\u009d\u00a0\5\"\22\2\u009e\u00a0\5$\23"+
		"\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00a5"+
		"\7\37\2\2\u00a2\u00a4\5\"\22\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6#\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a8\u00a9\7 \2\2\u00a9%\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab\'\3"+
		"\2\2\2\u00ac\u00ad\t\3\2\2\u00ad)\3\2\2\2\17\64=CJPey{\u0082\u0090\u009b"+
		"\u009f\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}