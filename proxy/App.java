package proxy;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {	
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Tupperware", 100.0));
		products.add(new Product(2, "Estante", 200.0));
		products.add(new Product(3, "Mouse", 50.0));
		
		ProductDAO dao = new ProductDAOProxy(products);
		dao.findAll();
		dao.findById(1);
		dao.save(new Product(4, "Marcador", 10.5));
	}
}
