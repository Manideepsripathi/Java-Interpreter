public class WhileExp extends Expr{
	Expr ex1,ex2;
	
	public WhileExp(Expr _ex1, Expr _ex2) {
		ex1 = _ex1;
		ex2 = _ex2;
	}
	public Value eval(Env e) throws EvalError {		
		Value  v=ex1.eval(e);
		boolean b1;
		if(v instanceof BoolVal)
		{
			b1=((BoolVal)v).boolvalue;
			while(b1)
			{
				v=ex2.eval(e);
				b1=((BoolVal)ex1.eval(e)).boolvalue;
			}
		}
		else{
			throw new EvalError("Invalid Condition");
		}
		return v;
	}
	public String toString() {
	
		return "while "+ex1.toString()+"do "+ex2.toString();
	}


}