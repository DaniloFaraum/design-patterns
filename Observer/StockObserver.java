package Observer;

public class StockObserver implements Observer<Product> {
	
	@Override
	private void update(Product t) {
		System.out.println("Issuing fiscal invoices for: " + t);

	}
}
