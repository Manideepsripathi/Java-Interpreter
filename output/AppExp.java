public class AppExp extends Expr {
	String st;
	Expr expr1;
	public AppExp(String _st, Expr _expr1) {
		
		st = _st;
		expr1 = _expr1;
	}
	
	public Value eval(Env e) throws EvalError {
		
		Value value=e.lookup(st);
		if (value instanceof FunVal ){
			FunVal funval=(FunVal)value; 
			value = expr1.eval(e);
			Env env1=funval.env.addBinding(funval.str,value);
			return  funval.expr1.eval(env1);
		}
		else throw new EvalError("Incompatiable Argument"); 
	}

	public String toString() {
		return st+"("+expr1.toString()+")";
	}
}