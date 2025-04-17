package bridge;

public class Square extends Shape{
	
	public Square(Color color) {
		super(color);
	}
	
	@Override
	public String draw() {
		return "Square drawing" + color.fill();
	}
}
