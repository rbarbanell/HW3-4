import java.awt.Color;

public abstract class AbstractShape implements Shape{
	protected int x, y;
	protected Color c;
	public AbstractShape(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
}
