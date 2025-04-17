package adapter;

public class Advertisement {
	String title;
	String description;
	Double price;
	AdvertisementStatus status = AdvertisementStatus.DRAFT;
	
	public Advertisement(String title, String description, double price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	public void publish() {
		System.out.println("Advertisement published process...");
		status = AdvertisementStatus.PUBLISHED;
	}
	public void inactivate() {
		System.out.println("Advertisement published process...");
		status = AdvertisementStatus.INACTIVATED;
	}
	public void activate() {
		System.out.println("Advertisement published process...");
		status = AdvertisementStatus.ACTIVATED;
	}
	public void delete() {
		System.out.println("Advertisement published process...");
		status = AdvertisementStatus.DELETED;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Advertisement=(title: %s, price: %2.f, description: %s, status: %s)", title, price, description, status);
	}
}
