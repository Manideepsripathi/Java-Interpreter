
public class IfExp extends Expr {
	Expr exp1,exp2,exp3;
	
	public IfExp(Expr _exp1, Expr _exp2, Expr _exp3) {
		exp1 = _exp1;
		exp2 = _exp2;
		exp3 = _exp3;
	}
	public Value eval(Env e) throws EvalError {
		if(exp1.eval(e).getClass()==BoolVal.class){
			if(((BoolVal)(exp1.eval(e))).boolvalue){
				return exp2.eval(e);
			}
			else{
				return exp3.eval(e);
			}				
		}
		else{
			throw new EvalError(" Given Condition is Invalid");
		}
	}
	public String toString() {
		return "if "+exp1.toString()+"then "+exp2.toString()+"else "+exp3.toString();
	}

}
