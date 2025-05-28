package interpreter;

public class NumberExpression extends Expression {
	private final int number;
	
	public NumberExpression(int number) {
		this.number = number;
	}
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return this.number;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(number);
	}

}
