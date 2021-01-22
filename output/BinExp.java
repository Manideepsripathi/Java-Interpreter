public class BinExp extends Expr {
	public BinOp bop;
	public Expr expr1, expr2;

	public BinExp(BinOp _bop, Expr _expr1, Expr _expr2) {
		bop = _bop;
		expr1 = _expr1;
		expr2 = _expr2;
	}

	public Value eval(Env e) throws EvalError {

		if (bop.toString() == "PLUS" || bop.toString() == "MINUS" || bop.toString() == "TIMES"
				|| bop.toString() == "DIV" || bop.toString() == "LT") {
			Value value1 = expr1.eval(e);
			Value value2 = expr2.eval(e);
			if (value1 instanceof IntVal && value2 instanceof IntVal) {
				int val1 = ((IntVal) value1).value;
				int val2 = ((IntVal) value2).value;

				switch (bop.toString()) {
				case "PLUS":
					return new IntVal(val1 + val2);
				case "MINUS":
					return new IntVal(val1 - val2);
				case "TIMES":
					return new IntVal(val1 * val2);
				case "DIV":
					return new IntVal(val1 / val2);
				case "LT":
					return new BoolVal(val1 < val2);
				}
			} else {
				throw new EvalError(" Invalid operator, Check the operator you have given ");
			}

		} 
		else if (bop.toString() == "AND" || bop.toString() == "OR" || bop.toString() == "EQ") {
			
			Value value1 = expr1.eval(e);
			switch (bop.toString()) {
				case "AND":
						if (value1 instanceof BoolVal) {
							boolean val1 = ((BoolVal) value1).boolvalue;
		
							if (val1) {
								Value val2 = expr2.eval(e);
								if (val2 instanceof BoolVal) {
									return new BoolVal(((BoolVal) val2).boolvalue);
								} 
								else {
									throw new EvalError("Expresssion 2 is not Bool type");
								}
							} 
							else {
								return new BoolVal(false);
							}
		
						} 
						else {
							throw new EvalError("Expresssion 1 is not Bool type");
						}
				case "OR":
						if (value1 instanceof BoolVal) {
							boolean val1 = ((BoolVal) value1).boolvalue;
							if (val1) {
								return new BoolVal(true);
							} 
							else {
								Value val2 = expr2.eval(e);
								if (val2 instanceof BoolVal) {
									return new BoolVal(((BoolVal) val2).boolvalue);
								} 
								else {
									throw new EvalError("Expresssion 2 is not Bool type");
								}
							}
						}
						else {
							throw new EvalError("Expresssion 1 is not Bool type");
						}
				case "EQ":
					Value value2 = expr2.eval(e);
					if (value1 instanceof BoolVal && value2 instanceof BoolVal) {
						boolean val1 = ((BoolVal) value1).boolvalue;
						boolean val2 = ((BoolVal) value2).boolvalue;
						return new BoolVal(val1 == val2);
					} 
					else if(value1 instanceof IntVal && value2 instanceof IntVal) {
						int val1 = ((IntVal)value1).value;
						int val2 = ((IntVal)value2).value;
						return new BoolVal(val1 == val2);
					}
					else
					{
						throw new EvalError(" Both are not of Booltype and integer type");
					}
				default:
					System.out.println("default");
				}
			} 
		else {
			throw new EvalError("Invalid operator, Check the operator you have given");
		}
		return null;
	}

	public String toString() {
		return bop.toString() + expr1.toString() + expr2.toString();

	}
}