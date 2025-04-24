package abstractFactory;

public class App {
	public static void main(String[] args) {
		playWith(args[0]);
	}
	
	private static void playWith(String type) {
		KingdomFactory factory = KingdomFactory.getInstance(type);
		Army army = factory.createArmy();
		Castle castle = factory.createCastle();
		King king = factory.createKing();
		
		System.out.println(army.getClass().getSimpleName());
		System.out.println(castle.getClass().getSimpleName());
		System.out.println(king.getClass().getSimpleName());
	}
}
