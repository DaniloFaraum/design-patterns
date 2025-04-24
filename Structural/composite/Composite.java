package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite<T extends Composite<T>> {
	private List<T> children = new ArrayList<T>();
	
	public void add(T... t) {
		children.addAll(List.of(t));
	}
	
	public void remove(T t) {
		children.remove(t);
	}
	
	public void operation() {
		children.forEach(Composite::operation);

	}
}
