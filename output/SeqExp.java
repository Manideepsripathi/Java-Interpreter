public class SeqExp extends Expr{
	public Expr exp1,exp2;
	public SeqExp(Expr _exp1, Expr _exp2) {
		exp1 = _exp1;
		exp2 = _exp2;
	}
	public Value eval(Env e) throws EvalError {
		Value val1=exp1.eval(e);
		return exp2.eval(e);
	}
	public String toString() {
		return "{"+exp1.toString()+";"+exp2.toString()+"}";
	}
}