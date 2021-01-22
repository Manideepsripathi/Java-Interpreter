public class LetFunExp extends Expr{
	public String string1,string2;
	public Expr exp1,exp2;

	public LetFunExp(String _string1, String _string2, Expr _exp1, Expr _exp2) {
	
		string1 = _string1;
		string2 = _string2;
		exp1 = _exp1;
		exp2 = _exp2;
	}

	public Value eval(Env e) throws EvalError {
		Env en1=e.addBinding(string1, null);
		FunVal funvalue=new FunVal(en1,string2,exp1);
		Env e2=en1.updateBinding(string1, funvalue);
		Value v= exp2.eval(e2);
		return v;
	}

	
	public String toString() {
		
		String s= "let fun"+string1+"("+string2+")"+exp1.toString()
		+"in"+exp2.toString()+"end";
		return s;
	}
}