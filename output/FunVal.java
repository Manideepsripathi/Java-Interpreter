public class FunVal extends Value{
	Env env;
	String str;
	Expr expr1;
	public FunVal(Env _env, String _str, Expr _expr1) {
		env = _env;
		str = _str;
		expr1 = _expr1;
	}
	public String toString() {
		return str+" "+expr1.toString();
	}
}