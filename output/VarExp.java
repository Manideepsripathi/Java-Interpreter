public class VarExp extends Expr {
	public final String str;
	public VarExp(String _str) {
		str=_str;
	}
	public Value eval(Env e) throws EvalError {
		return e.lookup(str);
	}
	public String toString() {
		return str;
	}
}
