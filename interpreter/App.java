package interpreter;

import java.util.Stack;

public class App {
	public static void main(String[] args) {
		String token = "4 8 5 - 10 + * 15";
		
		Stack<Expression> stack = new Stack<Expression>();
		String[] tokens = token.split(" ");
		for (String s : tokens) {
			if (isOperator(s) ) {
				System.out.printf("operator: %s\n", s);
				Expression re = stack.pop();
				Expression le = stack.pop();
				System.out.printf("popped from stack: left: %s, right: %s\n", le, re);
				Expression op = getOperator(s, le, re);
				int result = op.interpret();
				stackPush(stack, result);
			}	else {
				stackPush(stack, Integer.valueOf(s));
			}
		}
	}

	private static void stackPush(Stack<Expression> stack, Integer i) {
		NumberExpression e = new NumberExpression(i);
		stack.push(e);
		System.out.printf("pushed to stack: %d\n", i);
		
	}

	private static Expression getOperator(String s, Expression le, Expression re) {
		// TODO Auto-generated method stub
		return switch (s) {
		case "+" -> new PlusExpression(le, re);
		case "-" -> new MinusExpression(le, re);
		case "*" -> new MultiplyExpression(le, re);
		case "/" -> new DivideExpression(le, re);
		default -> throw new IllegalArgumentException("Unknow operator");
		};
	}

	private static boolean isOperator(String s) {
		return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
	}
}
