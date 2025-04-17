package prototype;

public class App {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Batman";
		p1.document = 9845854L;
		System.out.println(p1);
		
		Person p2 = p1.copy();
		p2.name = "Jhon Doe";
		p2.document = 1235854L;
		System.out.println(p2);
		
		Person p3 = p1.copy();
		p3.name = "Jhon Michael";
		p3.document = 4635854L;
		System.out.println(p3);
	}
}
