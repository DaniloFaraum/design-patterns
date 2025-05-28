package strategy;

import java.io.File;

import strategy.Context.Type;

public class App {
	public static void main(String[] args) {
		File f = new File("*file location*");
		Context.convert(Type.PNG, f, "*file location*");
	}
}
