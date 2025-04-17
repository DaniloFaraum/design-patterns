package adapter;

public class AdvertisementAdapter extends Advertisement{
	private Ad ad;
	
	public AdvertisementAdapter(Ad ad) {
		super(ad.description.substring(0,10),
				ad.description,
				ad.price);
		this.status = convertStatus(ad.status);
		this.ad = ad;
	}
	
	private AdvertisementStatus convertStatus(String status) {
		switch (status) {
		case "reviewed": return AdvertisementStatus.PUBLISHED;
		case "new": return AdvertisementStatus.DRAFT;
		case "deleted": return AdvertisementStatus.DELETED;
		default:
			throw new IllegalArgumentException("Unexpected value: " + status);
		}
	}
	
	@Override
	public void publish() {
		this.ad.publish();
	}
	
	@Override
	public void inactivate() {
		this.ad.delete();
	}
	
	@Override
	public void activate() {
		this.ad.publish();
	}
	
	@Override
	public void delete() {
		this.ad.delete();
	}
}
