package proxy;

public class Product {
	private Integer id;
	private String description;
	private double price;
	
	public Product(Integer id, String description, double price) {
		this.setId(id);
		this.setDescription(description);
		this.setPrice(price);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
