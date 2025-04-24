package composite;

public class Department extends Composite<Department> {
	Integer id;
	String name;
	
	public Department(String n) {
		this.id = (int)Math.round(Math.random()*10);
		this.name = n;
	}
	
	@Override
	public void operation() {
		super.operation();
		System.out.printf("[%d] s% \n", id, name);
	}
}
