package Observer;

public class Product {
	private Integer id;
	private String description;
	private Double price;
	
	public Product(Integer id, String description, Double price) {
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("Product=(id:%d, desc:%s, price:%.2f", id, description, price);
	}
}
