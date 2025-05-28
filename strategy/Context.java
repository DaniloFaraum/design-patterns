package strategy;

import java.io.File;

public class Context {
	public static enum Type { PNG, WEBP};
	
	public static void convert(Type type, File input, String output) {
		Strategy strategy;
		switch (type) {
		case WEBP: strategy = new WEBPStrategy(); break;
		case PNG: strategy = new PNGStrategy(); break;
		default: strategy = new PNGStrategy(); break;
		}
		strategy.convert(input, output);
	}
}
