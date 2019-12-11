// Generated from C:/_data/01_sourcecode/github/dhbw-vorlesungen/dhbw-vorlesung-einfuehrungCompilerbau/MarkdownParser/src\Markdown.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Count=9, 
		CodeSeparator=10, Text=11, LineFeed=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Count", 
			"CodeSeparator", "Text", "LineFeed"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'# '", "'## '", "'### '", "'#### '", "'##### '", "'###### '", 
			"'.'", "'*'", null, "'```'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "Count", "CodeSeparator", 
			"Text", "LineFeed"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MarkdownLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Markdown.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nB\n\n\r\n\16\nC\3\13\3\13\3\13\3\13"+
		"\3\f\6\fK\n\f\r\f\16\fL\3\r\5\rP\n\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\4\3\2\63;\r\2\"#\62<AAC|\u00a6"+
		"\u00a6\u00b8\u00b8\u00be\u00be\u00c5\u00c5\u0155\u0155\u2015\u2015\u2020"+
		"\u2020\2U\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7\"\3\2\2\2\t\'\3\2\2"+
		"\2\13-\3\2\2\2\r\64\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23A\3\2\2\2\25E\3"+
		"\2\2\2\27J\3\2\2\2\31O\3\2\2\2\33\34\7%\2\2\34\35\7\"\2\2\35\4\3\2\2\2"+
		"\36\37\7%\2\2\37 \7%\2\2 !\7\"\2\2!\6\3\2\2\2\"#\7%\2\2#$\7%\2\2$%\7%"+
		"\2\2%&\7\"\2\2&\b\3\2\2\2\'(\7%\2\2()\7%\2\2)*\7%\2\2*+\7%\2\2+,\7\"\2"+
		"\2,\n\3\2\2\2-.\7%\2\2./\7%\2\2/\60\7%\2\2\60\61\7%\2\2\61\62\7%\2\2\62"+
		"\63\7\"\2\2\63\f\3\2\2\2\64\65\7%\2\2\65\66\7%\2\2\66\67\7%\2\2\678\7"+
		"%\2\289\7%\2\29:\7%\2\2:;\7\"\2\2;\16\3\2\2\2<=\7\60\2\2=\20\3\2\2\2>"+
		"?\7,\2\2?\22\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2"+
		"D\24\3\2\2\2EF\7b\2\2FG\7b\2\2GH\7b\2\2H\26\3\2\2\2IK\t\3\2\2JI\3\2\2"+
		"\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\30\3\2\2\2NP\7\17\2\2ON\3\2\2\2OP\3"+
		"\2\2\2PQ\3\2\2\2QR\7\f\2\2R\32\3\2\2\2\6\2CLO\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}