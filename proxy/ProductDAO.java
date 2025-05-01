package proxy;

import java.util.List;
import java.util.Random;

public class ProductDAO {
	private List<Product> products;
	
	public ProductDAO(List<Product> products) {
		this.products = products;
	}
	
	public List<Product> findAll() {
		simulateDelay();
		return products;
	}
	
	public Product findById(Integer id) {
		simulateDelay();
		return products.parallelStream().filter(e -> e.getId() == id).findFirst().orElse(null);
	}
	
	public void save(Product p) {
		simulateDelay();
		products.add(p);
	}
	
	public void remove(Product p) {
		simulateDelay();
		products.remove(p);
	}
	
	public void simulateDelay() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
