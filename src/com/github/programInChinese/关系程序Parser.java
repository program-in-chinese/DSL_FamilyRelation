package com.github.programInChinese;
// Generated from 关系程序.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class 关系程序Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T汉字=28, T换行=29;
	public static final int
		RULE_程序 = 0, RULE_声明 = 1, RULE_问题 = 2, RULE_人物 = 3;
	public static final String[] ruleNames = {
		"程序", "声明", "问题", "人物"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' \u662F '", "' \u7684 '", "'\u7238\u7238'", "'\u5988\u5988'", 
		"'\u513F\u5B50'", "'\u5973\u513F'", "'\u59D0\u59D0'", "'\u59B9\u59B9'", 
		"'\u54E5\u54E5'", "'\u5F1F\u5F1F'", "'\u7237\u7237'", "'\u5976\u5976'", 
		"'\u5B59\u5B50'", "'\u5B59\u5973'", "'\u5916\u516C'", "'\u5916\u5A46'", 
		"'\u5916\u5B59'", "'\u5916\u5B59\u5973'", "'\u5802\u59D0'", "'\u5802\u59B9'", 
		"'\u5802\u5144'", "'\u5802\u5F1F'", "'\u8868\u59D0'", "'\u8868\u59B9'", 
		"'\u8868\u5144'", "'\u8868\u5F1F'", "' \u7684\u4EC0\u4E48\u4EBA'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "T\u0001\u0002", "T\u0001\u0002"
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
	public String getGrammarFileName() { return "关系程序.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public 关系程序Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class 程序Context extends ParserRuleContext {
		public 问题Context 问题() {
			return getRuleContext(问题Context.class,0);
		}
		public List<声明Context> 声明() {
			return getRuleContexts(声明Context.class);
		}
		public 声明Context 声明(int i) {
			return getRuleContext(声明Context.class,i);
		}
		public List<TerminalNode> T换行() { return getTokens(关系程序Parser.T换行); }
		public TerminalNode T换行(int i) {
			return getToken(关系程序Parser.T换行, i);
		}
		public 程序Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_程序; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 关系程序Listener ) ((关系程序Listener)listener).enter程序(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 关系程序Listener ) ((关系程序Listener)listener).exit程序(this);
		}
	}

	public final 程序Context 程序() throws RecognitionException {
		程序Context _localctx = new 程序Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_程序);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(8);
					声明();
					setState(9);
					match(T换行);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(13); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(15);
			问题();
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

	public static class 声明Context extends ParserRuleContext {
		public List<人物Context> 人物() {
			return getRuleContexts(人物Context.class);
		}
		public 人物Context 人物(int i) {
			return getRuleContext(人物Context.class,i);
		}
		public 声明Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_声明; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 关系程序Listener ) ((关系程序Listener)listener).enter声明(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 关系程序Listener ) ((关系程序Listener)listener).exit声明(this);
		}
	}

	public final 声明Context 声明() throws RecognitionException {
		声明Context _localctx = new 声明Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_声明);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			人物();
			setState(18);
			match(T__0);
			setState(19);
			人物();
			setState(20);
			match(T__1);
			setState(21);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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

	public static class 问题Context extends ParserRuleContext {
		public List<人物Context> 人物() {
			return getRuleContexts(人物Context.class);
		}
		public 人物Context 人物(int i) {
			return getRuleContext(人物Context.class,i);
		}
		public 问题Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_问题; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 关系程序Listener ) ((关系程序Listener)listener).enter问题(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 关系程序Listener ) ((关系程序Listener)listener).exit问题(this);
		}
	}

	public final 问题Context 问题() throws RecognitionException {
		问题Context _localctx = new 问题Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_问题);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			人物();
			setState(24);
			match(T__0);
			setState(25);
			人物();
			setState(26);
			match(T__26);
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

	public static class 人物Context extends ParserRuleContext {
		public List<TerminalNode> T汉字() { return getTokens(关系程序Parser.T汉字); }
		public TerminalNode T汉字(int i) {
			return getToken(关系程序Parser.T汉字, i);
		}
		public 人物Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_人物; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 关系程序Listener ) ((关系程序Listener)listener).enter人物(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 关系程序Listener ) ((关系程序Listener)listener).exit人物(this);
		}
	}

	public final 人物Context 人物() throws RecognitionException {
		人物Context _localctx = new 人物Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_人物);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				match(T汉字);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T汉字 );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\6\5 \n\5\r\5\16\5!\3\5\2\2\6"+
		"\2\4\6\b\2\3\3\2\5\34\2!\2\r\3\2\2\2\4\23\3\2\2\2\6\31\3\2\2\2\b\37\3"+
		"\2\2\2\n\13\5\4\3\2\13\f\7\37\2\2\f\16\3\2\2\2\r\n\3\2\2\2\16\17\3\2\2"+
		"\2\17\r\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22\5\6\4\2\22\3\3\2\2\2"+
		"\23\24\5\b\5\2\24\25\7\3\2\2\25\26\5\b\5\2\26\27\7\4\2\2\27\30\t\2\2\2"+
		"\30\5\3\2\2\2\31\32\5\b\5\2\32\33\7\3\2\2\33\34\5\b\5\2\34\35\7\35\2\2"+
		"\35\7\3\2\2\2\36 \7\36\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2"+
		"\2\2\"\t\3\2\2\2\4\17!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}