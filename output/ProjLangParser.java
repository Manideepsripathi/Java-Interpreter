// $ANTLR 3.5.2 ProjLang.g 2020-04-30 19:32:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_OP", "ASSN", "DIGIT", "DO", 
		"ELSE", "END", "EQ", "EXCLAMATION", "FALSE", "FUN", "ID", "IF", "IN", 
		"LB", "LET", "LETTER", "LPAR", "MUL_OP", "NUM", "RB", "REL", "RPAR", "SQ", 
		"THEN", "TRUE", "VAL", "WHILE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ProjLang.g"; }



	// $ANTLR start "input"
	// ProjLang.g:39:1: input returns [Expr exp] : expr SQ ;
	public final Expr input() throws RecognitionException {
		Expr exp = null;


		Expr expr1 =null;

		try {
			// ProjLang.g:39:28: ( expr SQ )
			// ProjLang.g:39:30: expr SQ
			{
			pushFollow(FOLLOW_expr_in_input307);
			expr1=expr();
			state._fsp--;

			exp =expr1;
			match(input,SQ,FOLLOW_SQ_in_input310); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// ProjLang.g:40:1: expr returns [Expr exp] : ( IF exa= expr THEN exb= expr ELSE exc= expr | LET VAL stringa= ID EQ exd= expr IN exe= expr END | LET FUN stringb= ID LPAR stringc= ID RPAR EQ exf= expr IN exg= expr END | WHILE exh= expr DO exi= expr | LB exj= expr ( SQ exk= expr )* RB | EXCLAMATION exl= expr |stringd= ID ASSN exm= expr |exn= relexpr );
	public final Expr expr() throws RecognitionException {
		Expr exp = null;


		Token stringa=null;
		Token stringb=null;
		Token stringc=null;
		Token stringd=null;
		Expr exa =null;
		Expr exb =null;
		Expr exc =null;
		Expr exd =null;
		Expr exe =null;
		Expr exf =null;
		Expr exg =null;
		Expr exh =null;
		Expr exi =null;
		Expr exj =null;
		Expr exk =null;
		Expr exl =null;
		Expr exm =null;
		Expr exn =null;

		try {
			// ProjLang.g:40:27: ( IF exa= expr THEN exb= expr ELSE exc= expr | LET VAL stringa= ID EQ exd= expr IN exe= expr END | LET FUN stringb= ID LPAR stringc= ID RPAR EQ exf= expr IN exg= expr END | WHILE exh= expr DO exi= expr | LB exj= expr ( SQ exk= expr )* RB | EXCLAMATION exl= expr |stringd= ID ASSN exm= expr |exn= relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUN) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LB:
				{
				alt2=5;
				}
				break;
			case EXCLAMATION:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ASSN) ) {
					alt2=7;
				}
				else if ( (LA2_6==ADD_OP||(LA2_6 >= DO && LA2_6 <= EQ)||LA2_6==IN||(LA2_6 >= LPAR && LA2_6 <= MUL_OP)||(LA2_6 >= RB && LA2_6 <= THEN)) ) {
					alt2=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LPAR:
			case NUM:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// ProjLang.g:40:30: IF exa= expr THEN exb= expr ELSE exc= expr
					{
					match(input,IF,FOLLOW_IF_in_expr324); 
					pushFollow(FOLLOW_expr_in_expr328);
					exa=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr330); 
					pushFollow(FOLLOW_expr_in_expr334);
					exb=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr336); 
					pushFollow(FOLLOW_expr_in_expr340);
					exc=expr();
					state._fsp--;

					exp =new IfExp(exa,exb,exc);
					}
					break;
				case 2 :
					// ProjLang.g:41:5: LET VAL stringa= ID EQ exd= expr IN exe= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr347); 
					match(input,VAL,FOLLOW_VAL_in_expr349); 
					stringa=(Token)match(input,ID,FOLLOW_ID_in_expr353); 
					match(input,EQ,FOLLOW_EQ_in_expr355); 
					pushFollow(FOLLOW_expr_in_expr360);
					exd=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr362); 
					pushFollow(FOLLOW_expr_in_expr367);
					exe=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr369); 
					exp =new LetValExp((stringa!=null?stringa.getText():null),exd,exe);
					}
					break;
				case 3 :
					// ProjLang.g:42:5: LET FUN stringb= ID LPAR stringc= ID RPAR EQ exf= expr IN exg= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr377); 
					match(input,FUN,FOLLOW_FUN_in_expr379); 
					stringb=(Token)match(input,ID,FOLLOW_ID_in_expr383); 
					match(input,LPAR,FOLLOW_LPAR_in_expr385); 
					stringc=(Token)match(input,ID,FOLLOW_ID_in_expr389); 
					match(input,RPAR,FOLLOW_RPAR_in_expr391); 
					match(input,EQ,FOLLOW_EQ_in_expr393); 
					pushFollow(FOLLOW_expr_in_expr397);
					exf=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr399); 
					pushFollow(FOLLOW_expr_in_expr403);
					exg=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr405); 
					exp =new LetFunExp((stringb!=null?stringb.getText():null),(stringc!=null?stringc.getText():null),exf,exg);
					}
					break;
				case 4 :
					// ProjLang.g:43:5: WHILE exh= expr DO exi= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr413); 
					pushFollow(FOLLOW_expr_in_expr417);
					exh=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr419); 
					pushFollow(FOLLOW_expr_in_expr423);
					exi=expr();
					state._fsp--;

					exp =new WhileExp(exh,exi);
					}
					break;
				case 5 :
					// ProjLang.g:44:5: LB exj= expr ( SQ exk= expr )* RB
					{
					match(input,LB,FOLLOW_LB_in_expr431); 
					pushFollow(FOLLOW_expr_in_expr435);
					exj=expr();
					state._fsp--;

					// ProjLang.g:44:17: ( SQ exk= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SQ) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// ProjLang.g:44:19: SQ exk= expr
							{
							match(input,SQ,FOLLOW_SQ_in_expr439); 
							pushFollow(FOLLOW_expr_in_expr443);
							exk=expr();
							state._fsp--;

							exp =new SeqExp(exj,exk);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RB,FOLLOW_RB_in_expr449); 
					}
					break;
				case 6 :
					// ProjLang.g:45:5: EXCLAMATION exl= expr
					{
					match(input,EXCLAMATION,FOLLOW_EXCLAMATION_in_expr455); 
					pushFollow(FOLLOW_expr_in_expr459);
					exl=expr();
					state._fsp--;

					exp =new NotExp(exl);
					}
					break;
				case 7 :
					// ProjLang.g:46:5: stringd= ID ASSN exm= expr
					{
					stringd=(Token)match(input,ID,FOLLOW_ID_in_expr468); 
					match(input,ASSN,FOLLOW_ASSN_in_expr470); 
					pushFollow(FOLLOW_expr_in_expr474);
					exm=expr();
					state._fsp--;

					exp =new AssnExp((stringd!=null?stringd.getText():null),exm);
					}
					break;
				case 8 :
					// ProjLang.g:47:5: exn= relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr483);
					exn=relexpr();
					state._fsp--;

					exp =exn;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// ProjLang.g:48:1: relexpr returns [Expr exp] : exo= arithexpr ( (exs= REL |exs= EQ ) expp= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr exp = null;


		Token exs=null;
		Expr exo =null;
		Expr expp =null;

		try {
			// ProjLang.g:48:28: (exo= arithexpr ( (exs= REL |exs= EQ ) expp= arithexpr )? )
			// ProjLang.g:48:30: exo= arithexpr ( (exs= REL |exs= EQ ) expp= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr498);
			exo=arithexpr();
			state._fsp--;

			exp =exo;
			// ProjLang.g:48:60: ( (exs= REL |exs= EQ ) expp= arithexpr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EQ||LA4_0==REL) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ProjLang.g:48:62: (exs= REL |exs= EQ ) expp= arithexpr
					{
					// ProjLang.g:48:62: (exs= REL |exs= EQ )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==REL) ) {
						alt3=1;
					}
					else if ( (LA3_0==EQ) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// ProjLang.g:48:63: exs= REL
							{
							exs=(Token)match(input,REL,FOLLOW_REL_in_relexpr506); 
							}
							break;
						case 2 :
							// ProjLang.g:48:73: exs= EQ
							{
							exs=(Token)match(input,EQ,FOLLOW_EQ_in_relexpr512); 
							}
							break;

					}

					pushFollow(FOLLOW_arithexpr_in_relexpr517);
					expp=arithexpr();
					state._fsp--;

					if ((exs!=null?exs.getText():null).equals("=")) exp =new BinExp(BinOp.EQ,exp,expp); 
											else exp =new BinExp(BinOp.LT,exp,expp);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// ProjLang.g:50:1: arithexpr returns [Expr exp] : exq= term ( ADD_OP exr= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr exp = null;


		Token ADD_OP2=null;
		Expr exq =null;
		Expr exr =null;

		try {
			// ProjLang.g:50:30: (exq= term ( ADD_OP exr= term )* )
			// ProjLang.g:50:36: exq= term ( ADD_OP exr= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr537);
			exq=term();
			state._fsp--;

			exp =exq;
			// ProjLang.g:50:61: ( ADD_OP exr= term )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ADD_OP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ProjLang.g:50:62: ADD_OP exr= term
					{
					ADD_OP2=(Token)match(input,ADD_OP,FOLLOW_ADD_OP_in_arithexpr541); 
					pushFollow(FOLLOW_term_in_arithexpr546);
					exr=term();
					state._fsp--;

					if ((ADD_OP2!=null?ADD_OP2.getText():null).equals("+")) exp =new BinExp(BinOp.PLUS,exp,exr); 
											else if ((ADD_OP2!=null?ADD_OP2.getText():null).equals("-")) exp =new BinExp(BinOp.MINUS,exp,exr);
											else if ((ADD_OP2!=null?ADD_OP2.getText():null).equals("|")) exp =new BinExp(BinOp.OR,exp,exr); 
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// ProjLang.g:53:1: term returns [Expr exp] : ext= factor ( MUL_OP exu= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr exp = null;


		Token MUL_OP3=null;
		Expr ext =null;
		Expr exu =null;

		try {
			// ProjLang.g:53:26: (ext= factor ( MUL_OP exu= factor )* )
			// ProjLang.g:53:28: ext= factor ( MUL_OP exu= factor )*
			{
			pushFollow(FOLLOW_factor_in_term564);
			ext=factor();
			state._fsp--;

			exp =ext;
			// ProjLang.g:53:55: ( MUL_OP exu= factor )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MUL_OP) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ProjLang.g:53:56: MUL_OP exu= factor
					{
					MUL_OP3=(Token)match(input,MUL_OP,FOLLOW_MUL_OP_in_term568); 
					pushFollow(FOLLOW_factor_in_term572);
					exu=factor();
					state._fsp--;

					if ((MUL_OP3!=null?MUL_OP3.getText():null).equals("*")) exp =new BinExp(BinOp.TIMES,exp,exu);
														else if ((MUL_OP3!=null?MUL_OP3.getText():null).equals("/")) exp =new BinExp(BinOp.DIV,exp,exu);
														else if ((MUL_OP3!=null?MUL_OP3.getText():null).equals("&")) exp =new BinExp(BinOp.AND,exp,exu); 
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// ProjLang.g:56:1: factor returns [Expr exp] : ( NUM | TRUE | FALSE |stringf= ID |stringh= ID LPAR exy= expr RPAR | LPAR exz= expr RPAR );
	public final Expr factor() throws RecognitionException {
		Expr exp = null;


		Token stringf=null;
		Token stringh=null;
		Token NUM4=null;
		Expr exy =null;
		Expr exz =null;

		try {
			// ProjLang.g:56:28: ( NUM | TRUE | FALSE |stringf= ID |stringh= ID LPAR exy= expr RPAR | LPAR exz= expr RPAR )
			int alt7=6;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt7=1;
				}
				break;
			case TRUE:
				{
				alt7=2;
				}
				break;
			case FALSE:
				{
				alt7=3;
				}
				break;
			case ID:
				{
				int LA7_4 = input.LA(2);
				if ( (LA7_4==LPAR) ) {
					alt7=5;
				}
				else if ( (LA7_4==ADD_OP||(LA7_4 >= DO && LA7_4 <= EQ)||LA7_4==IN||LA7_4==MUL_OP||(LA7_4 >= RB && LA7_4 <= THEN)) ) {
					alt7=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAR:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ProjLang.g:56:31: NUM
					{
					NUM4=(Token)match(input,NUM,FOLLOW_NUM_in_factor589); 
					exp =new IntConst(Integer.parseInt((NUM4!=null?NUM4.getText():null)));
					}
					break;
				case 2 :
					// ProjLang.g:57:6: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor598); 
					exp =new BoolConst(Boolean.parseBoolean("true"));
					}
					break;
				case 3 :
					// ProjLang.g:58:5: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor606); 
					exp =new BoolConst(Boolean.parseBoolean("false"));
					}
					break;
				case 4 :
					// ProjLang.g:59:11: stringf= ID
					{
					stringf=(Token)match(input,ID,FOLLOW_ID_in_factor622); 
					exp =new VarExp((stringf!=null?stringf.getText():null));
					}
					break;
				case 5 :
					// ProjLang.g:60:6: stringh= ID LPAR exy= expr RPAR
					{
					stringh=(Token)match(input,ID,FOLLOW_ID_in_factor632); 
					match(input,LPAR,FOLLOW_LPAR_in_factor634); 
					pushFollow(FOLLOW_expr_in_factor638);
					exy=expr();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_factor640); 
					exp =new AppExp((stringh!=null?stringh.getText():null),exy);
					}
					break;
				case 6 :
					// ProjLang.g:61:6: LPAR exz= expr RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_factor649); 
					pushFollow(FOLLOW_expr_in_factor653);
					exz=expr();
					state._fsp--;

					exp =exz;
					match(input,RPAR,FOLLOW_RPAR_in_factor656); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input307 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SQ_in_input310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr324 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr330 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr334 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ELSE_in_expr336 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr347 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr349 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr353 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_expr355 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr360 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr362 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr367 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr377 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FUN_in_expr379 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr383 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAR_in_expr385 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr389 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAR_in_expr391 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_expr393 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr397 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr399 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr403 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr413 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr417 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DO_in_expr419 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_expr431 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr435 = new BitSet(new long[]{0x0000000004800000L});
	public static final BitSet FOLLOW_SQ_in_expr439 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr443 = new BitSet(new long[]{0x0000000004800000L});
	public static final BitSet FOLLOW_RB_in_expr449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXCLAMATION_in_expr455 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr468 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSN_in_expr470 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr498 = new BitSet(new long[]{0x0000000001000402L});
	public static final BitSet FOLLOW_REL_in_relexpr506 = new BitSet(new long[]{0x0000000010505000L});
	public static final BitSet FOLLOW_EQ_in_relexpr512 = new BitSet(new long[]{0x0000000010505000L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr537 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADD_OP_in_arithexpr541 = new BitSet(new long[]{0x0000000010505000L});
	public static final BitSet FOLLOW_term_in_arithexpr546 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term564 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_MUL_OP_in_term568 = new BitSet(new long[]{0x0000000010505000L});
	public static final BitSet FOLLOW_factor_in_term572 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NUM_in_factor589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor632 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAR_in_factor634 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_factor638 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAR_in_factor640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_factor649 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_factor653 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAR_in_factor656 = new BitSet(new long[]{0x0000000000000002L});
}
