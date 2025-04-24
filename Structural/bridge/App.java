package bridge;

public class App {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Red());
		System.out.println(c1.draw());
		
		Square s1 = new Square(new Blue());
		System.out.println(s1.draw());
	}
}
