public class LetValExp extends Expr{
	public String str;
	public Expr ex1,ex2;
	public LetValExp(String _str, Expr _ex1, Expr _ex2) {
		str = _str;
		ex1 = _ex1;
		ex2 = _ex2;
	}
	public Value eval(Env e) throws EvalError {
		Env environment1=e.addBinding(str, ex1.eval(e));
		return ex2.eval(environment1);
	}
	public String toString() {
		return "let val"+str+":="+ex1.toString()+"in"+ex2.toString()+"end";
	}

}