package decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class App {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Aluno\\eclipse-workspace2\\StructuralPatterns\\src\\data/sample.txt");
		Reader reader = new FileReader(file);
		int ch;
		while ((ch = reader.read()) != -1) {
			System.out.print((char)ch);
		}
		
		BufferedReader buff = new BufferedReader(reader);
		buff.lines().forEach(System.out::println);
	}
}
