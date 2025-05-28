package interpreter;

public class DivideExpression extends Expression {
	private final Expression leftExp;
	private final Expression rightExp;
	
	public DivideExpression(Expression left, Expression right) {
		leftExp = left;
		rightExp = right;
	}
	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return leftExp.interpret() / rightExp.interpret();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "/";
	}

}
