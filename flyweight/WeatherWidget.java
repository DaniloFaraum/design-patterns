package flyweight;

public class WeatherWidget extends Widget {

	public WeatherWidget() {
		super("Weather", "code to generate the weather widget");
	}
	
	@Override
	public void draw(String color, String position) {
		System.out.println("Draws the weather with " + color + " in " + position);
	}

}
