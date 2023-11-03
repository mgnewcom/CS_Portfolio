package newcombProdject5;

import java.awt.Color;

import edu.du.dudraw.DUDraw;
import edu.du.dudraw.Draw;
import edu.du.dudraw.DrawListener;

public class window {
	private double x;
	private double y;
	private double w;
	private double h;
	private double x2;
	private double y2;
	private Draw draw;
	private windowDisplay WD;
	private Color color;

	public window(double xPos, double yPos, double width, double height, Color col, Draw d) {
		// these get values from the user
		// stores x and y coordinates to update values
		this.x = xPos;
		this.y = yPos;
		this.w = width;
		this.h = height;
		this.color = col;
		// saves original positions from reset method
		this.x2 = xPos;
		this.y2 = yPos;

		this.draw = d;

	}

	public void draw() {
		// draws windows
		draw.setPenColor(color);
		draw.filledRectangle(x, y, w, h);

	}

	public boolean overlap(double xPos, double yPos) {
		// gets size of canvas
		if (xPos < x + w && xPos > x - w && yPos < y + h && yPos > y - h) {

			return true;

		} else {
			return false;
		}

	}

	public void reset() {
		// replaces current positions of windows with original positions
		x = x2;
		y = y2;

	}

	//setters for x and y values
	public void setX(double xSet) {

		this.x = xSet;

	}

	public void setY(double ySet) {

		this.y = ySet;

	}

}
