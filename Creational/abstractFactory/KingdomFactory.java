package abstractFactory;

import java.lang.reflect.InvocationTargetException;

public interface KingdomFactory {
	public Army createArmy();
	public Castle createCastle();
	public King createKing();
	
	public static KingdomFactory getInstance(String type) {
//		if ("Orc".equals(type)) {
//			return new OrcKingdom();
//		}
//		else if ("Elf".equals(type)) {
//			return new ElfKingdom();
//		}
//		else {
//			return null;
//		}
		
		
		type = "abstractfactory." + type + "Kingdom";
		try {
			return (KingdomFactory)Class.forName(type).getConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;                 
		}
	}
	public static void WriteLine(String name) {
		System.out.println(name);
	}
	}
}
