package newcombProdject5;

import java.awt.Color;
import java.util.ArrayList;

import edu.du.dudraw.DUDraw;
import edu.du.dudraw.Draw;
import edu.du.dudraw.DrawListener;

public class windowDisplay implements DrawListener {

	// updated possitions
	private ArrayList<window> Windows = new ArrayList<window>();
	// original positins
	private ArrayList<window> Original = new ArrayList<window>();
	private Draw draw;
	private int xScale;
	private int yScale;

	public windowDisplay(int xS, int yS) {

		//sets canvas sizes
		this.xScale = xS;
		this.yScale = yS;
		this.draw = new Draw(); 
		//allows draw methods to be used 
		draw.addListener(this); 
		//draws canvas
		draw.setCanvasSize(xScale, yScale);
		draw.setXscale(0, xScale);
		draw.setYscale(0, yScale);
		draw.enableDoubleBuffering();

	}

	public Draw getDrawObject() {

		return draw;
	}

	public void addWindow(double xPos, double yPos, double width, double height, Color col) {

		//instanciates two arrays one for the original positions and one for the changed positions 
		this.Original.add(new window(xPos, yPos, width, height, col, draw));
		this.Windows.add(new window(xPos, yPos, width, height, col, draw));

	}

	public void refresh() {

		// go array list and refresh each window
		// for loop
		draw.clear();
		for (window w : Windows) {
			w.draw();
		}
		draw.show();
	}

	public void resetWindows() {
		// clear current array
		// run through original array
		// make deep copy of original array and set it equal to current array

		// runs thought the current array and clears all the window
		draw.clear();
		for (window w : Windows) {
			// resetWindows();
			w.reset();

		}

		// clears each of the elements of the current array
		Windows.clear();

		// adds the original contents into the current array to reset the positions and
		// order
		for (window d : Original) {
			Windows.add(d);

		}
		refresh();

		// need to get origional order

	}

	@Override
	public void keyPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(char c) {
		if (c == 'R' || c == 'r') {
			// calls reset windows method when 'r' is pressed
			resetWindows();

		}
		if (c == 'Q' || c == 'q') {
//closes the program if q is pressed
			draw.closeWindow();

		}

	}

	@Override
	public void mouseClicked(double xp, double yp) {

	}

	@Override
	public void mouseDragged(double xp, double yp) {

		// gets the size of each windows and finds the x any y coordinates
		Windows.get(Windows.size() - 1).setX(xp);
		Windows.get(Windows.size() - 1).setY(yp);
		// clears the canvas when the windows are dragged so that the windows do not
		// repeat
		draw.clear();
		// refreshes the canvas
		refresh();

	}

	@Override
	public void mousePressed(double xp, double yp) {

		// not up top but in front
		// overlap a,b,c,d
		// call overlap with window display

//calls method to find out which window is on top
		window win2 = Windows.get(getWindow(xp, yp));
//removes the position of the window clicked
		Windows.remove(win2);
		// redraws the window on top
		Windows.add(win2);
		refresh();

	}

	@Override
	public void mouseReleased(double xp, double yp) {

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	public int getWindow(double x, double y) {
		// stores which window is on top
		int storeI;
		// array used to go though all windows and find the one on top
		for (int i = Windows.size() - 1; i > 0; i--) {
			// variable used to call overlap method
			window win2 = Windows.get(i);

//if statement determines if the windowis on top or not
			if (win2.overlap(x, y) == true) {
				// stores the window clicked and returns it
				storeI = i;
				return storeI;
			}

		}
		return 0;
	}

}
