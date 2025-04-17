package prototype;

public class Prototype<T extends Cloneable> {
	
	public T copy() {
		try {
			return (T)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
