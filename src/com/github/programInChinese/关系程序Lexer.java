package com.github.programInChinese;
// Generated from 关系程序.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class 关系程序Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T汉字=28, T换行=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T汉字", "T换行"
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


	public 关系程序Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "关系程序.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\6\36\u0098\n\36"+
		"\r\36\16\36\u0099\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37\3\2\4\4\2\u4e02\u9fa7\uf902\ufa2f\4\2\f\f\17\17"+
		"\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7E\3\2\2\2\tH\3\2\2\2\13K\3\2\2"+
		"\2\rN\3\2\2\2\17Q\3\2\2\2\21T\3\2\2\2\23W\3\2\2\2\25Z\3\2\2\2\27]\3\2"+
		"\2\2\31`\3\2\2\2\33c\3\2\2\2\35f\3\2\2\2\37i\3\2\2\2!l\3\2\2\2#o\3\2\2"+
		"\2%r\3\2\2\2\'v\3\2\2\2)y\3\2\2\2+|\3\2\2\2-\177\3\2\2\2/\u0082\3\2\2"+
		"\2\61\u0085\3\2\2\2\63\u0088\3\2\2\2\65\u008b\3\2\2\2\67\u008e\3\2\2\2"+
		"9\u0094\3\2\2\2;\u0097\3\2\2\2=>\7\"\2\2>?\7\u6631\2\2?@\7\"\2\2@\4\3"+
		"\2\2\2AB\7\"\2\2BC\7\u7686\2\2CD\7\"\2\2D\6\3\2\2\2EF\7\u723a\2\2FG\7"+
		"\u723a\2\2G\b\3\2\2\2HI\7\u598a\2\2IJ\7\u598a\2\2J\n\3\2\2\2KL\7\u5141"+
		"\2\2LM\7\u5b52\2\2M\f\3\2\2\2NO\7\u5975\2\2OP\7\u5141\2\2P\16\3\2\2\2"+
		"QR\7\u59d2\2\2RS\7\u59d2\2\2S\20\3\2\2\2TU\7\u59bb\2\2UV\7\u59bb\2\2V"+
		"\22\3\2\2\2WX\7\u54e7\2\2XY\7\u54e7\2\2Y\24\3\2\2\2Z[\7\u5f21\2\2[\\\7"+
		"\u5f21\2\2\\\26\3\2\2\2]^\7\u7239\2\2^_\7\u7239\2\2_\30\3\2\2\2`a\7\u5978"+
		"\2\2ab\7\u5978\2\2b\32\3\2\2\2cd\7\u5b5b\2\2de\7\u5b52\2\2e\34\3\2\2\2"+
		"fg\7\u5b5b\2\2gh\7\u5975\2\2h\36\3\2\2\2ij\7\u5918\2\2jk\7\u516e\2\2k"+
		" \3\2\2\2lm\7\u5918\2\2mn\7\u5a48\2\2n\"\3\2\2\2op\7\u5918\2\2pq\7\u5b5b"+
		"\2\2q$\3\2\2\2rs\7\u5918\2\2st\7\u5b5b\2\2tu\7\u5975\2\2u&\3\2\2\2vw\7"+
		"\u5804\2\2wx\7\u59d2\2\2x(\3\2\2\2yz\7\u5804\2\2z{\7\u59bb\2\2{*\3\2\2"+
		"\2|}\7\u5804\2\2}~\7\u5146\2\2~,\3\2\2\2\177\u0080\7\u5804\2\2\u0080\u0081"+
		"\7\u5f21\2\2\u0081.\3\2\2\2\u0082\u0083\7\u886a\2\2\u0083\u0084\7\u59d2"+
		"\2\2\u0084\60\3\2\2\2\u0085\u0086\7\u886a\2\2\u0086\u0087\7\u59bb\2\2"+
		"\u0087\62\3\2\2\2\u0088\u0089\7\u886a\2\2\u0089\u008a\7\u5146\2\2\u008a"+
		"\64\3\2\2\2\u008b\u008c\7\u886a\2\2\u008c\u008d\7\u5f21\2\2\u008d\66\3"+
		"\2\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7\u7686\2\2\u0090\u0091\7\u4ec2"+
		"\2\2\u0091\u0092\7\u4e4a\2\2\u0092\u0093\7\u4ebc\2\2\u00938\3\2\2\2\u0094"+
		"\u0095\t\2\2\2\u0095:\3\2\2\2\u0096\u0098\t\3\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a<\3"+
		"\2\2\2\4\2\u0099\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}