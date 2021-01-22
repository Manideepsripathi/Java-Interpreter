public class BoolVal extends Value {
    public final boolean boolvalue;
    public BoolVal(boolean _value) {
	boolvalue = _value;
    }
    public String toString() {
	return String.valueOf(boolvalue);
    }
}
