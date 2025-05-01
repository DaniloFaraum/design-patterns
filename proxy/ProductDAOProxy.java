package proxy;

import java.util.List;

public class ProductDAOProxy extends ProductDAO{

	private static final long SLOW = 0;

	public ProductDAOProxy(List<Product> products) {
		super(products);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Product> findAll() {
		long start = System.currentTimeMillis();
		var r = super.findAll();
		slowQuery(System.currentTimeMillis() - start);
		return r;
	}
	
	@Override
	public Product findById(Integer id) {
		long start = System.currentTimeMillis();
		var r = super.findById(id);
		slowQuery(System.currentTimeMillis() - start);
		return r;
	}
	
	@Override
	public void save(Product p) {
		long start = System.currentTimeMillis();
		super.save(p);
		slowQuery(System.currentTimeMillis() - start);
	};
	
	@Override
	public void remove(Product p) {
		long start = System.currentTimeMillis();
		super.remove(p);
		slowQuery(System.currentTimeMillis() - start);

	}
	
	private void slowQuery(long elapsedTime) {
		StackTraceElement frame = Thread.getAllStackTraces().get(Thread.currentThread())[3];
		if (elapsedTime >= SLOW) {
			System.out.println("method took too much time. Elapsed time: "+ elapsedTime/1000 + "s. " + frame.getMethodName());
		}
	}
	
	
}
