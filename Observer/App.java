package Observer;

import java.util.Scanner;

public class App {
	 public static void main(String[] args) {
		QueueSubject subject = new QueueSubject.getInstace();
		
		subject.attach(new StockObserver());
		
		subject.add(new Product(1, "Tupperware", 100.0));
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		do {
			System.out.println("submit a product or 0 o exit:");
			String line = sc.nextLine();
			exit = "0".equals(line);
			if (!exit) {
				subject.add(productFactory(line));
			}
		} while (!exit);
			sc.close();
	}
	 
	 private static Product productFactory(String line) {
		 String[] split = line.split(";");
		 return new Product(Integer.valueOf(split[0]), split [1], Double.valueOf(split[2]));
	 }
}
