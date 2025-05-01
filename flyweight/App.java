package flyweight;

public class App {
	public static void main(String[] args) {
		Widget clockRL = WidgetFactory.getWidget("clock");
		clockRL.draw("red","left");
		Widget clockBR = WidgetFactory.getWidget("clock");
		clockRL.draw("white","left");
		Widget weatherRL = WidgetFactory.getWidget("weather");
		clockRL.draw("green","left");
		
		if (clockBR == clockRL) {
			System.out.println("São o mesmo objeto");
		}
	}
}
