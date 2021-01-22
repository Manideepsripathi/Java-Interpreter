public class BoolConst extends Expr {
    public final boolean boolvalue;
    public BoolConst(boolean _boolvalue) {
	boolvalue = _boolvalue;
    }
    public Value eval(Env e) throws EvalError {
	return new BoolVal(boolvalue);
    }
    public String toString() {
	return String.valueOf(boolvalue);
    }
}
