grammar ProjLang;


IF	: 	'if';
THEN 	: 	'then';
WHILE 	: 	'while';
ELSE 	: 	'else';
DO 	: 	'do';
END	:	'end';
LET	:	'let';
IN 	:	'in';
VAL 	: 	'val';
FUN	: 	'fun';
TRUE 	:	'true';
FALSE 	:	'false';
ADD_OP  :	('+'|'-' | '|');
MUL_OP	:	('*'| '/' | '&');
LPAR	:	'(';
RPAR	:	')';
LB	:	'{';
RB	:	'}';
EQ	:	'=';
SQ      :	';';
EXCLAMATION
	:	'!';
ASSN 	: 	':=';
REL 	: 	('<');
ID	:	LETTER (LETTER | DIGIT)*;
NUM	:	DIGIT+;
WS	:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

fragment LETTER	
	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	
	:	'0'..'9';


// grammer 
input  returns [Expr exp]  :	expr{$exp=$expr.exp;} SQ;
expr  returns [Expr exp]  : 	IF exa=expr THEN exb=expr ELSE exc=expr{$exp=new IfExp($exa.exp,$exb.exp,$exc.exp);}
	 |	LET VAL stringa=ID EQ  exd=expr IN  exe=expr END {$exp=new LetValExp($stringa.text,$exd.exp,$exe.exp);}
	 |	LET FUN stringb=ID LPAR stringc=ID RPAR EQ exf=expr IN exg=expr END {$exp=new LetFunExp($stringb.text,$stringc.text,$exf.exp,$exg.exp);}
	 |	WHILE exh=expr DO exi=expr{$exp=new WhileExp($exh.exp,$exi.exp);} 
	 |	LB exj=expr ( SQ exk=expr{$exp=new SeqExp($exj.exp,$exk.exp);} )* RB
	 |	EXCLAMATION exl=expr{$exp=new NotExp($exl.exp);}
	 |	stringd=ID ASSN exm=expr{$exp=new AssnExp($stringd.text,$exm.exp);}
	 |	exn=relexpr{$exp=$exn.exp;}; 
relexpr returns [Expr exp] :	exo=arithexpr{$exp=$exo.exp;} ( (exs=REL | exs=EQ) expp=arithexpr{if ($exs.text.equals("=")) $exp=new BinExp(BinOp.EQ,$exp,$expp.exp); 
						else $exp=new BinExp(BinOp.LT,$exp,$expp.exp);})?;
arithexpr returns [Expr exp] :     exq=term{$exp=$exq.exp;} (ADD_OP  exr=term{if ($ADD_OP.text.equals("+")) $exp=new BinExp(BinOp.PLUS,$exp,$exr.exp); 
						else if ($ADD_OP.text.equals("-")) $exp=new BinExp(BinOp.MINUS,$exp,$exr.exp);
						else if ($ADD_OP.text.equals("|")) $exp=new BinExp(BinOp.OR,$exp,$exr.exp); } )*;
term returns [Expr exp]  :	ext=factor{$exp=$ext.exp;} (MUL_OP exu=factor{if ($MUL_OP.text.equals("*")) $exp=new BinExp(BinOp.TIMES,$exp,$exu.exp);
									else if ($MUL_OP.text.equals("/")) $exp=new BinExp(BinOp.DIV,$exp,$exu.exp);
									else if ($MUL_OP.text.equals("&")) $exp=new BinExp(BinOp.AND,$exp,$exu.exp); } )*;
factor returns [Expr exp]  :	 NUM {$exp=new IntConst(Integer.parseInt($NUM.text));}
	 |	 TRUE {$exp=new BoolConst(Boolean.parseBoolean("true"));}
	 |	FALSE {$exp=new BoolConst(Boolean.parseBoolean("false"));}
	 |       stringf=ID{$exp=new VarExp($stringf.text);}
	 |	 stringh=ID LPAR exy=expr RPAR {$exp=new AppExp($stringh.text,$exy.exp);}
	 |	 LPAR exz=expr{$exp=$exz.exp;} RPAR;