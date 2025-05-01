package flyweight;

public class ClockWidget extends Widget {

	public ClockWidget() {
		super("Clock", "code to generate the clock widget");
	}
	
	@Override
	public void draw(String color, String position) {
		System.out.println("Draws a clock with " + color + " in " + position);
	}

}
