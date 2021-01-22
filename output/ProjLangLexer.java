// $ANTLR 3.5.2 ProjLang.g 2020-04-30 19:32:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD_OP=4;
	public static final int ASSN=5;
	public static final int DIGIT=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int END=9;
	public static final int EQ=10;
	public static final int EXCLAMATION=11;
	public static final int FALSE=12;
	public static final int FUN=13;
	public static final int ID=14;
	public static final int IF=15;
	public static final int IN=16;
	public static final int LB=17;
	public static final int LET=18;
	public static final int LETTER=19;
	public static final int LPAR=20;
	public static final int MUL_OP=21;
	public static final int NUM=22;
	public static final int RB=23;
	public static final int REL=24;
	public static final int RPAR=25;
	public static final int SQ=26;
	public static final int THEN=27;
	public static final int TRUE=28;
	public static final int VAL=29;
	public static final int WHILE=30;
	public static final int WS=31;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "ProjLang.g"; }

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:4:4: ( 'if' )
			// ProjLang.g:4:7: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:5:7: ( 'then' )
			// ProjLang.g:5:10: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:6:8: ( 'while' )
			// ProjLang.g:6:11: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:7:7: ( 'else' )
			// ProjLang.g:7:10: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:8:5: ( 'do' )
			// ProjLang.g:8:8: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:9:5: ( 'end' )
			// ProjLang.g:9:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:10:5: ( 'let' )
			// ProjLang.g:10:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:11:5: ( 'in' )
			// ProjLang.g:11:7: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:12:6: ( 'val' )
			// ProjLang.g:12:9: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:13:5: ( 'fun' )
			// ProjLang.g:13:8: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:14:7: ( 'true' )
			// ProjLang.g:14:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:15:8: ( 'false' )
			// ProjLang.g:15:10: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "ADD_OP"
	public final void mADD_OP() throws RecognitionException {
		try {
			int _type = ADD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:16:9: ( ( '+' | '-' | '|' ) )
			// ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_OP"

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:17:8: ( ( '*' | '/' | '&' ) )
			// ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_OP"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:18:6: ( '(' )
			// ProjLang.g:18:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:19:6: ( ')' )
			// ProjLang.g:19:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:20:4: ( '{' )
			// ProjLang.g:20:6: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:21:4: ( '}' )
			// ProjLang.g:21:6: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:22:4: ( '=' )
			// ProjLang.g:22:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "SQ"
	public final void mSQ() throws RecognitionException {
		try {
			int _type = SQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:23:9: ( ';' )
			// ProjLang.g:23:11: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQ"

	// $ANTLR start "EXCLAMATION"
	public final void mEXCLAMATION() throws RecognitionException {
		try {
			int _type = EXCLAMATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:25:2: ( '!' )
			// ProjLang.g:25:4: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCLAMATION"

	// $ANTLR start "ASSN"
	public final void mASSN() throws RecognitionException {
		try {
			int _type = ASSN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:26:7: ( ':=' )
			// ProjLang.g:26:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSN"

	// $ANTLR start "REL"
	public final void mREL() throws RecognitionException {
		try {
			int _type = REL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:27:6: ( ( '<' ) )
			// ProjLang.g:27:9: ( '<' )
			{
			// ProjLang.g:27:9: ( '<' )
			// ProjLang.g:27:10: '<'
			{
			match('<'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REL"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:28:4: ( LETTER ( LETTER | DIGIT )* )
			// ProjLang.g:28:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// ProjLang.g:28:13: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:29:5: ( ( DIGIT )+ )
			// ProjLang.g:29:7: ( DIGIT )+
			{
			// ProjLang.g:29:7: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:30:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// ProjLang.g:30:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// ProjLang.g:30:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// ProjLang.g:33:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// ProjLang.g:35:2: ( '0' .. '9' )
			// ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// ProjLang.g:1:8: ( IF | THEN | WHILE | ELSE | DO | END | LET | IN | VAL | FUN | TRUE | FALSE | ADD_OP | MUL_OP | LPAR | RPAR | LB | RB | EQ | SQ | EXCLAMATION | ASSN | REL | ID | NUM | WS )
		int alt4=26;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// ProjLang.g:1:10: IF
				{
				mIF(); 

				}
				break;
			case 2 :
				// ProjLang.g:1:13: THEN
				{
				mTHEN(); 

				}
				break;
			case 3 :
				// ProjLang.g:1:18: WHILE
				{
				mWHILE(); 

				}
				break;
			case 4 :
				// ProjLang.g:1:24: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// ProjLang.g:1:29: DO
				{
				mDO(); 

				}
				break;
			case 6 :
				// ProjLang.g:1:32: END
				{
				mEND(); 

				}
				break;
			case 7 :
				// ProjLang.g:1:36: LET
				{
				mLET(); 

				}
				break;
			case 8 :
				// ProjLang.g:1:40: IN
				{
				mIN(); 

				}
				break;
			case 9 :
				// ProjLang.g:1:43: VAL
				{
				mVAL(); 

				}
				break;
			case 10 :
				// ProjLang.g:1:47: FUN
				{
				mFUN(); 

				}
				break;
			case 11 :
				// ProjLang.g:1:51: TRUE
				{
				mTRUE(); 

				}
				break;
			case 12 :
				// ProjLang.g:1:56: FALSE
				{
				mFALSE(); 

				}
				break;
			case 13 :
				// ProjLang.g:1:62: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 14 :
				// ProjLang.g:1:69: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 15 :
				// ProjLang.g:1:76: LPAR
				{
				mLPAR(); 

				}
				break;
			case 16 :
				// ProjLang.g:1:81: RPAR
				{
				mRPAR(); 

				}
				break;
			case 17 :
				// ProjLang.g:1:86: LB
				{
				mLB(); 

				}
				break;
			case 18 :
				// ProjLang.g:1:89: RB
				{
				mRB(); 

				}
				break;
			case 19 :
				// ProjLang.g:1:92: EQ
				{
				mEQ(); 

				}
				break;
			case 20 :
				// ProjLang.g:1:95: SQ
				{
				mSQ(); 

				}
				break;
			case 21 :
				// ProjLang.g:1:98: EXCLAMATION
				{
				mEXCLAMATION(); 

				}
				break;
			case 22 :
				// ProjLang.g:1:110: ASSN
				{
				mASSN(); 

				}
				break;
			case 23 :
				// ProjLang.g:1:115: REL
				{
				mREL(); 

				}
				break;
			case 24 :
				// ProjLang.g:1:119: ID
				{
				mID(); 

				}
				break;
			case 25 :
				// ProjLang.g:1:122: NUM
				{
				mNUM(); 

				}
				break;
			case 26 :
				// ProjLang.g:1:126: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\10\24\16\uffff\1\43\1\44\5\24\1\52\4\24\2\uffff\4\24\1\63\1\uffff"+
		"\1\64\1\65\1\66\1\24\1\70\1\71\1\24\1\73\4\uffff\1\24\2\uffff\1\75\1\uffff"+
		"\1\76\2\uffff";
	static final String DFA4_eofS =
		"\77\uffff";
	static final String DFA4_minS =
		"\1\11\1\146\2\150\1\154\1\157\1\145\2\141\16\uffff\2\60\1\145\1\165\1"+
		"\151\1\163\1\144\1\60\1\164\1\154\1\156\1\154\2\uffff\1\156\1\145\1\154"+
		"\1\145\1\60\1\uffff\3\60\1\163\2\60\1\145\1\60\4\uffff\1\145\2\uffff\1"+
		"\60\1\uffff\1\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\156\1\162\1\150\1\156\1\157\1\145\1\141\1\165\16\uffff\2\172"+
		"\1\145\1\165\1\151\1\163\1\144\1\172\1\164\1\154\1\156\1\154\2\uffff\1"+
		"\156\1\145\1\154\1\145\1\172\1\uffff\3\172\1\163\2\172\1\145\1\172\4\uffff"+
		"\1\145\2\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA4_acceptS =
		"\11\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
		"\1\31\1\32\14\uffff\1\1\1\10\5\uffff\1\5\10\uffff\1\6\1\7\1\11\1\12\1"+
		"\uffff\1\2\1\13\1\uffff\1\4\1\uffff\1\3\1\14";
	static final String DFA4_specialS =
		"\77\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\1\21\4\uffff\1\12\1\uffff\1\13\1\14"+
			"\1\12\1\11\1\uffff\1\11\1\uffff\1\12\12\25\1\22\1\20\1\23\1\17\3\uffff"+
			"\32\24\6\uffff\3\24\1\5\1\4\1\10\2\24\1\1\2\24\1\6\7\24\1\2\1\24\1\7"+
			"\1\3\3\24\1\15\1\11\1\16",
			"\1\27\7\uffff\1\30",
			"\1\31\11\uffff\1\32",
			"\1\33",
			"\1\34\1\uffff\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\42\23\uffff\1\41",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\67",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\72",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			"",
			"",
			"",
			"\1\74",
			"",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( IF | THEN | WHILE | ELSE | DO | END | LET | IN | VAL | FUN | TRUE | FALSE | ADD_OP | MUL_OP | LPAR | RPAR | LB | RB | EQ | SQ | EXCLAMATION | ASSN | REL | ID | NUM | WS );";
		}
	}

}
