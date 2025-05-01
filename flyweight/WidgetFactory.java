package flyweight;

import java.util.HashMap;
import java.util.Map;

public class WidgetFactory {
	private static final Map<String, Widget> pool = new HashMap<String, Widget>();
	
	public static Widget getWidget(String name) {
		if (!pool.containsKey(name)) {
			pool.put(name, factory(name));
		}
		return pool.get(name);
	}
	
	private static  Widget factory(String name) {
		switch (name) {
		case "clock": return new ClockWidget();
		case "weather": return new WeatherWidget();
		default: throw new IllegalArgumentException("Unknow widget type");
		}
	}
	
//	public static Integer countWidget(String name) {
//		pool.keySet().forEach(k -> );
//	}
}

