package adapter;

public class App {
	public static void main(String[] args) {
		Advertisement ad1 = new Advertisement("Titulo 1", "O melhor produto", 2.99);
		ad1.publish();
		ad1.inactivate();
		ad1.activate();
		ad1.delete();
		System.out.println(ad1);

		Ad ad2 = new Ad();
		ad2.description = "Desc mt boa";
		ad2.price = 250.0;
		ad2.status = "Reviewed";
		System.out.println(ad2);
		
		Advertisement ad3 = new AdvertisementAdapter(ad2);
		ad1.publish();
		ad1.inactivate();
		ad1.activate();
		ad1.delete();
		System.out.println(ad3);
	}
}
