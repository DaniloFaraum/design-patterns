package facade;

import facade.DwarvenMineWorker.Action;

public class App {
	public static void main(String[] args) {
		DwarvenCartOperator cartOp = new DwarvenCartOperator();
		cartOp.goToMine();
		cartOp.work();
		cartOp.goToHome();
		cartOp.action(Action.GO_TO_MINE, Action.GO_TO_SLEEP, Action.GO_TO_HOME);
	}
}
