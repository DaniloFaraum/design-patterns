package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
	private List<Pair> history = new ArrayList<Pair>();
	private int pointer = 0;
	
	private class Pair {
		Command cmd;
		Memento memento;
		
		public Pair(Command cmd, Memento memento) {
			this.cmd = cmd;
			this.memento = memento;
		}

		public Command getCmd() {
			return cmd;
		}

		public Memento getMemento() {
			return memento;
		}
	}
	
	public void push(Command cmd, Memento m) {
		history.add(new Pair(cmd, m));
		pointer++;
	}
	public boolean undo() {
		if (pointer == 0) return false;
		
		Pair pair = history.get(--pointer);
		System.out.println(pair.cmd.getname());
		pair.getMemento().restore();
		pair.getCmd().execute();
		return true;
	}
	public boolean redo() {
		if (pointer> history.size()) return false;
		
		Pair pair = history.get(++pointer);
		System.out.println(pair.cmd.getname());
		pair.getMemento().restore();
		pair.getCmd().execute();
		return true;
	}
}
