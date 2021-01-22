public class AssnExp extends Expr{
	public String str;
	public Expr exp;
	public AssnExp(String _str, Expr _exp) {
		str = _str;
		exp = _exp;
	}	
	public Value eval(Env e) throws EvalError{
		Value val = e.lookup(str);
		Value val1;
		if(val == null){
			throw new UnboundVar("Unbound Error");
		}
		else{
			val1 = exp.eval(e);
			if(val.getClass() == val1.getClass()){
				//val1 = exp.eval(e);
				e.updateBinding(str, val1);
			}
			else{
				throw new UnboundVar("Both values types are incompatiable");
			}
		}
		return val;
	}
	
	public String toString() {
		
		return str+":="+exp.toString();
	}
}