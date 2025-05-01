package facade;

import java.util.Arrays;
import java.util.logging.Logger;

public abstract class DwarvenMineWorker {

	protected static final Logger LOG = Logger.getLogger(DwarvenMineWorker.class.getName());
	
	public void goToSleep() {
		LOG.info(name() + " went to sleep");
	}
	
	public void wakeUp() {
		LOG.info(name() + " woke up");
	}
	
	public void goToMine() {
		LOG.info(name() + " goes to mine");
	}
	
	public void goToHome() {
		LOG.info(name() + " goes home");
	}
	
	public abstract String name();
	public abstract void work();
	
	enum Action {
		GO_TO_SLEEP, WAKE_UP, GO_TO_MINE, GO_TO_HOME;
	}
	
	public void action(Action...actions) {
		Arrays.stream(actions).forEach(this::action);
	}
	
	public void action(Action action) {
		switch (action) {
		case GO_TO_SLEEP : goToSleep(); break;
		case WAKE_UP : wakeUp(); break;
		case GO_TO_MINE : goToMine(); break;
		case WORK : work(); break;
		}
	}
}
