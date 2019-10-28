import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class FibonacciSquare extends AbstractShape {
	public ArrayList<Integer> list = new ArrayList<>();
	private int quadrant;
	private int fib;
	
	/*
	 * FibonacciSquare constructor
	 */
	public FibonacciSquare(int x, int y, Color c, int quadrant, int fib) {
		super(x,y,c);
		this.fib = fib;
		this.quadrant = quadrant;
	}
	
	/*
	 * Calculate the fibonacci number with the inputed index
	 */
	public int computeFib() {
			list.add(1);
			list.add(1);
			for (int i = 2; i < fib; i++) {
				list.add(list.get(i - 2) + list.get(i - 1));
			}
		return list.get(fib-1);
	}
	
	@Override
	public void draw(Graphics g) {
		int n = computeFib();
		g.setColor(c);
		g.drawRect(x, y, n, n);
		switch (this.quadrant) {
		//Quadrant 1;
		case 1:
			g.drawArc(x-n, y, 2*n, 2*n, 0, 90);
			break;
			//Quadrant 2;
		case 2:
			g.drawArc(x, y, 2*n, 2*n, 90, 90);
			break;
			//Quadrant 3!
		case 3:
			g.drawArc(x, y-n, 2*n, 2*n, 180, 90);
			break;
			//Quadrant 4!
		case 4:
			g.drawArc(x-n, y-n, 2*n, 2*n, 270,90);
			break;
		}
	}
	
	/*
	 * Create a deep for FibonacciSquare
	 *  return Shape 
	 */
	@Override
	public Shape deepcopy() {
		return new FibonacciSquare(this.x, this.y, this.c, this.quadrant, this.fib);
	}
}
