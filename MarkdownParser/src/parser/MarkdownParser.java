// Generated from C:/_data/01_sourcecode/github/dhbw-vorlesungen/dhbw-vorlesung-einfuehrungCompilerbau/MarkdownParser/src\Markdown.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Count=9, 
		CodeSeparator=10, Text=11, LineFeed=12;
	public static final int
		RULE_document = 0, RULE_blockElement = 1, RULE_textElement = 2, RULE_codeElement = 3, 
		RULE_headline = 4, RULE_h1 = 5, RULE_h2 = 6, RULE_h3 = 7, RULE_h4 = 8, 
		RULE_h5 = 9, RULE_h6 = 10, RULE_list = 11, RULE_orderedList = 12, RULE_orderedListElement = 13, 
		RULE_unorderedList = 14, RULE_unorderedListElement = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "blockElement", "textElement", "codeElement", "headline", 
			"h1", "h2", "h3", "h4", "h5", "h6", "list", "orderedList", "orderedListElement", 
			"unorderedList", "unorderedListElement"
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

	@Override
	public String getGrammarFileName() { return "Markdown.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MarkdownParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public List<BlockElementContext> blockElement() {
			return getRuleContexts(BlockElementContext.class);
		}
		public BlockElementContext blockElement(int i) {
			return getRuleContext(BlockElementContext.class,i);
		}
		public List<TerminalNode> LineFeed() { return getTokens(MarkdownParser.LineFeed); }
		public TerminalNode LineFeed(int i) {
			return getToken(MarkdownParser.LineFeed, i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << Count) | (1L << CodeSeparator) | (1L << Text))) != 0)) {
				{
				setState(32);
				blockElement();
				}
			}

			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(35);
						match(LineFeed);
						}
						}
						setState(38); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LineFeed );
					setState(40);
					blockElement();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineFeed) {
				{
				{
				setState(46);
				match(LineFeed);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockElementContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public HeadlineContext headline() {
			return getRuleContext(HeadlineContext.class,0);
		}
		public TextElementContext textElement() {
			return getRuleContext(TextElementContext.class,0);
		}
		public CodeElementContext codeElement() {
			return getRuleContext(CodeElementContext.class,0);
		}
		public BlockElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterBlockElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitBlockElement(this);
		}
	}

	public final BlockElementContext blockElement() throws RecognitionException {
		BlockElementContext _localctx = new BlockElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blockElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case Count:
				{
				setState(52);
				list();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				{
				setState(53);
				headline();
				}
				break;
			case Text:
				{
				setState(54);
				textElement();
				}
				break;
			case CodeSeparator:
				{
				setState(55);
				codeElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TextElementContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public TextElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterTextElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitTextElement(this);
		}
	}

	public final TextElementContext textElement() throws RecognitionException {
		TextElementContext _localctx = new TextElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(Text);
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

	public static class CodeElementContext extends ParserRuleContext {
		public List<TerminalNode> CodeSeparator() { return getTokens(MarkdownParser.CodeSeparator); }
		public TerminalNode CodeSeparator(int i) {
			return getToken(MarkdownParser.CodeSeparator, i);
		}
		public List<TerminalNode> LineFeed() { return getTokens(MarkdownParser.LineFeed); }
		public TerminalNode LineFeed(int i) {
			return getToken(MarkdownParser.LineFeed, i);
		}
		public List<TextElementContext> textElement() {
			return getRuleContexts(TextElementContext.class);
		}
		public TextElementContext textElement(int i) {
			return getRuleContext(TextElementContext.class,i);
		}
		public CodeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterCodeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitCodeElement(this);
		}
	}

	public final CodeElementContext codeElement() throws RecognitionException {
		CodeElementContext _localctx = new CodeElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_codeElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CodeSeparator);
			setState(61);
			match(LineFeed);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(62);
				textElement();
				setState(63);
				match(LineFeed);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(CodeSeparator);
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

	public static class HeadlineContext extends ParserRuleContext {
		public H1Context h1() {
			return getRuleContext(H1Context.class,0);
		}
		public H2Context h2() {
			return getRuleContext(H2Context.class,0);
		}
		public H3Context h3() {
			return getRuleContext(H3Context.class,0);
		}
		public H4Context h4() {
			return getRuleContext(H4Context.class,0);
		}
		public H5Context h5() {
			return getRuleContext(H5Context.class,0);
		}
		public H6Context h6() {
			return getRuleContext(H6Context.class,0);
		}
		public HeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterHeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitHeadline(this);
		}
	}

	public final HeadlineContext headline() throws RecognitionException {
		HeadlineContext _localctx = new HeadlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_headline);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				h1();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				h2();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				h3();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				h4();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				h5();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				h6();
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

	public static class H1Context extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public H1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitH1(this);
		}
	}

	public final H1Context h1() throws RecognitionException {
		H1Context _localctx = new H1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_h1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			match(Text);
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

	public static class H2Context extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public H2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterH2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitH2(this);
		}
	}

	public final H2Context h2() throws RecognitionException {
		H2Context _localctx = new H2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_h2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__1);
			setState(84);
			match(Text);
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

	public static class H3Context extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public H3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterH3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitH3(this);
		}
	}

	public final H3Context h3() throws RecognitionException {
		H3Context _localctx = new H3Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_h3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__2);
			setState(87);
			match(Text);
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

	public static class H4Context extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public H4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterH4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitH4(this);
		}
	}

	public final H4Context h4() throws RecognitionException {
		H4Context _localctx = new H4Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_h4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__3);
			setState(90);
			match(Text);
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

	public static class H5Context extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public H5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterH5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitH5(this);
		}
	}

	public final H5Context h5() throws RecognitionException {
		H5Context _localctx = new H5Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_h5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__4);
			setState(93);
			match(Text);
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

	public static class H6Context extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public H6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterH6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitH6(this);
		}
	}

	public final H6Context h6() throws RecognitionException {
		H6Context _localctx = new H6Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_h6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__5);
			setState(96);
			match(Text);
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

	public static class ListContext extends ParserRuleContext {
		public UnorderedListContext unorderedList() {
			return getRuleContext(UnorderedListContext.class,0);
		}
		public OrderedListContext orderedList() {
			return getRuleContext(OrderedListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				unorderedList();
				}
				break;
			case Count:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				orderedList();
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

	public static class OrderedListContext extends ParserRuleContext {
		public List<OrderedListElementContext> orderedListElement() {
			return getRuleContexts(OrderedListElementContext.class);
		}
		public OrderedListElementContext orderedListElement(int i) {
			return getRuleContext(OrderedListElementContext.class,i);
		}
		public List<TerminalNode> LineFeed() { return getTokens(MarkdownParser.LineFeed); }
		public TerminalNode LineFeed(int i) {
			return getToken(MarkdownParser.LineFeed, i);
		}
		public OrderedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterOrderedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitOrderedList(this);
		}
	}

	public final OrderedListContext orderedList() throws RecognitionException {
		OrderedListContext _localctx = new OrderedListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderedList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			orderedListElement();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(LineFeed);
					setState(104);
					orderedListElement();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class OrderedListElementContext extends ParserRuleContext {
		public TerminalNode Count() { return getToken(MarkdownParser.Count, 0); }
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public OrderedListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterOrderedListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitOrderedListElement(this);
		}
	}

	public final OrderedListElementContext orderedListElement() throws RecognitionException {
		OrderedListElementContext _localctx = new OrderedListElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderedListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			match(Count);
			setState(111);
			match(T__6);
			setState(112);
			match(Text);
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

	public static class UnorderedListContext extends ParserRuleContext {
		public List<UnorderedListElementContext> unorderedListElement() {
			return getRuleContexts(UnorderedListElementContext.class);
		}
		public UnorderedListElementContext unorderedListElement(int i) {
			return getRuleContext(UnorderedListElementContext.class,i);
		}
		public List<TerminalNode> LineFeed() { return getTokens(MarkdownParser.LineFeed); }
		public TerminalNode LineFeed(int i) {
			return getToken(MarkdownParser.LineFeed, i);
		}
		public UnorderedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unorderedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterUnorderedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitUnorderedList(this);
		}
	}

	public final UnorderedListContext unorderedList() throws RecognitionException {
		UnorderedListContext _localctx = new UnorderedListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unorderedList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			unorderedListElement();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(LineFeed);
					setState(116);
					unorderedListElement();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class UnorderedListElementContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(MarkdownParser.Text, 0); }
		public UnorderedListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unorderedListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).enterUnorderedListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownListener ) ((MarkdownListener)listener).exitUnorderedListElement(this);
		}
	}

	public final UnorderedListElementContext unorderedListElement() throws RecognitionException {
		UnorderedListElementContext _localctx = new UnorderedListElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unorderedListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(122);
			match(T__7);
			setState(123);
			match(Text);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\5\2"+
		"$\n\2\3\2\6\2\'\n\2\r\2\16\2(\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\5\rg\n\r\3\16\3\16\3\16\7\16l\n\16\f\16\16\16o\13\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\7\20x\n\20\f\20\16\20{\13\20\3\21\3\21"+
		"\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\177\2"+
		"#\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16U\3"+
		"\2\2\2\20X\3\2\2\2\22[\3\2\2\2\24^\3\2\2\2\26a\3\2\2\2\30f\3\2\2\2\32"+
		"h\3\2\2\2\34p\3\2\2\2\36t\3\2\2\2 |\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2#$\3"+
		"\2\2\2$-\3\2\2\2%\'\7\16\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2"+
		")*\3\2\2\2*,\5\4\3\2+&\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2"+
		"\2/-\3\2\2\2\60\62\7\16\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66;\5\30\r\2\67;\5\n\6\28;\5"+
		"\6\4\29;\5\b\5\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2"+
		"\2<=\7\r\2\2=\7\3\2\2\2>?\7\f\2\2?E\7\16\2\2@A\5\6\4\2AB\7\16\2\2BD\3"+
		"\2\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7"+
		"\f\2\2I\t\3\2\2\2JQ\5\f\7\2KQ\5\16\b\2LQ\5\20\t\2MQ\5\22\n\2NQ\5\24\13"+
		"\2OQ\5\26\f\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2"+
		"\2\2Q\13\3\2\2\2RS\7\3\2\2ST\7\r\2\2T\r\3\2\2\2UV\7\4\2\2VW\7\r\2\2W\17"+
		"\3\2\2\2XY\7\5\2\2YZ\7\r\2\2Z\21\3\2\2\2[\\\7\6\2\2\\]\7\r\2\2]\23\3\2"+
		"\2\2^_\7\7\2\2_`\7\r\2\2`\25\3\2\2\2ab\7\b\2\2bc\7\r\2\2c\27\3\2\2\2d"+
		"g\5\36\20\2eg\5\32\16\2fd\3\2\2\2fe\3\2\2\2g\31\3\2\2\2hm\5\34\17\2ij"+
		"\7\16\2\2jl\5\34\17\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\33\3\2"+
		"\2\2om\3\2\2\2pq\7\13\2\2qr\7\t\2\2rs\7\r\2\2s\35\3\2\2\2ty\5 \21\2uv"+
		"\7\16\2\2vx\5 \21\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\37\3\2\2"+
		"\2{y\3\2\2\2|}\7\n\2\2}~\7\r\2\2~!\3\2\2\2\f#(-\63:EPfmy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}