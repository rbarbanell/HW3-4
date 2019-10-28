import java.awt.Color;
import java.awt.Graphics;

public class HShape extends AbstractShape {
	private int n;
	
	/*
	 * Constructor for HShape
	 */
	public HShape(int x, int y, Color c, int n) {
		super(x,y,c);
		this.n = n;
	}
	@Override
	public void draw(Graphics g) {
		for (int col = 0; col <= 2; col++) {
			for (int row = 0; row <= 2; row++) {
				if ((row == 0 || row == 2) && col == 1) {
					g.setColor(Color.WHITE);
				} else {
					g.setColor(c);
				}
				g.fillRect(x + col*n, y + row*n, n, n);
				g.setColor(Color.BLACK);
				g.drawRect(x + col*n, y + row*n, n, n);
			}
		}
	}
	
	/*
	 * Create a deep for HShape
	 *  return Shape 
	 */
	@Override
	public Shape deepcopy() {
		return new HShape(this.x, this.y, this.c, this.n);
	}
}
