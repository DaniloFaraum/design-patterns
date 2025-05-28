package templatemethod;

public class App {
	public static void main(String[] args) {
		DataParser parser = new CSVParser();
		parser.path = "";
		parser.sanitize();
	}
}
