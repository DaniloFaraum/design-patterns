package interpreter;

public class PlusExpression extends Expression {
	private final Expression leftExp;
	private final Expression rightExp;
	
	public PlusExpression(Expression left, Expression right) {
		leftExp = left;
		rightExp = right;
	}
	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return leftExp.interpret() + rightExp.interpret();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "+";
	}

}
