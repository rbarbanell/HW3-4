import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass {
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			buildGUI();
		});
		
	}

	private static void buildGUI() {
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawingView panel = new DrawingView();
		frame.add(panel);

		frame.setVisible(true);

		DrawingModel model = new DrawingModel();
		for (int i = 1; i <= 4; i += 1) {
			Shape s = new FibonacciSquare(50*2*i, 50, Color.RED, i, i*2 + 5);
			model.addShape(s);
		}
		
		Shape h1 = new HShape(50,160,Color.GREEN,100);
		Shape h2 = new HShape(400,400,Color.GREEN,20);
		
		model.addShape(h1);
		model.addShape(h2);
		model.addView(panel);
		
	}
}
