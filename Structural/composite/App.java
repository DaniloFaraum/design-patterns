package composite;

public class App {
	public static void main(String[] args) {
		Department clevel = new Department("C-level");
		
		Department tech = new Department("Technology");
		Department mkt = new Department("Marketing");
		Department hr = new Department("Human Resources");
		
		clevel.add(mkt);
		clevel.add(tech);
		clevel.add(hr);
		
		Department devsecops = new Department("DevSecOps");
		Department dev = new Department("Software Engineer");
		Department data = new Department("Data Analist");
		
		tech.add(dev);
		tech.add(devsecops);
		tech.add(data);
	}

}
