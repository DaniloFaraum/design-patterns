package prototype;

public class Person extends Prototype<Person> implements Cloneable{
	String name;
	Long document;
	
	public Person() {
		System.out.println("Long time to build...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Person=(name: %s, document: %d)", name, document);
	}
}
