package memento;

public class MoveCommand implements Command {
	private int startx, starty;
	private int endx, endy;
	private Editor editor;
	public MoveCommand(Editor editor) {
		this.editor = editor;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Move by x: " + (endx - startx) + "y: " + (endy - starty);
	}

	@Override
	public void execute() {
		for (var shape : editor.getShapes().getSelected()) {
			shape.moveBy(endx-startx, endy-starty);
		}

	}
	public void start(int x, int y) {
		startx = x;
		starty= y;
		for (var shape : editor.getShapes().getSelected()) {
			shape.drag();
		}
	}
	public void stop(int x, int y) {
		endx = x;
		endy= y;
		for (var shape : editor.getShapes().getSelected()) {
			shape.drop();
		}
	}
	public void move(int x, int y) {
		for (var shape : editor.getShapes().getSelected()) {
			shape.moveTo( - startx, y - starty);
		}
	}
}
