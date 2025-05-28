package interpreter;

public class MultiplyExpression extends Expression {
	private final Expression leftExp;
	private final Expression rightExp;
	
	public MultiplyExpression(Expression left, Expression right) {
		leftExp = left;
		rightExp = right;
	}
	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return leftExp.interpret() * rightExp.interpret();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "*";
	}

}
