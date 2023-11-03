import java.util.ArrayList;
import java.util.LinkedList;

//import javax.swing.text.Segment;

import edu.du.dudraw.*;

public class Snake implements DrawListener {

	// sets radius for both the segments and the food
	private double rad;
	// determins the direction the snake moves
	private String direction;
	// variable for drawListener
	private Draw draw;
	// variable to add segments
	private Segment seg;
	// keeps track of the size of the snake
	private int size;
	// variable to initialize the food
	private Food food;

	private LinkedList<Segment> player;

	public Snake() {
		// starting x and y positions
		int xpos;
		int ypos;
		this.player = new LinkedList<Segment>();
		xpos = 4;
		ypos = 4;
		// radius value for both segments and food
		this.rad = 0.5;
		// keeps track of the size of the snake
		this.size = 0;
		// initalizes first food
		food = new Food();

//initializes draw
		this.draw = new Draw(); 
		//draws canvas
		draw.setCanvasSize(500, 500); 
		//initializes direction to north
		this.direction = "north";

		// everywhere i see dudraw do "draw"
		draw.clear(DUDraw.LIGHT_GRAY);
		draw.setXscale(0, 15);
		draw.setYscale(0, 15);
		draw.addListener(this);

		draw.enableDoubleBuffering();
		// missing
		// startUpdate

		

		// add segments
		for (int i = 0; i < 3; i++) {
			this.seg = new Segment(xpos, ypos + i, rad);
			player.add(seg);
			draw.setPenColor(DUDraw.BLACK);
			draw.filledSquare(xpos, ypos + i, rad);
			this.size++;
		}

		draw.startUpdate();

	}

	public void drawSnake() {

		draw.setPenColor(DUDraw.BLACK);
		for (int i = 0; i < size; i++) {

			draw.filledSquare(player.get(i).getX(), player.get(i).getY(), rad);

		}
	}

	public void moveSnake() {
		Segment first;

		//saves and updates the positions of the other segments of the snake
		int count = 0;
		int saveX = player.get(0).getX();
		int saveY = player.get(0).getY();

		for (int i = 1; i < player.size(); i++) {
			int newX = saveX;
			int newY = saveY;
			saveX = player.get(i).getX();
			saveY = player.get(i).getY();
			player.get(i).setX(newX);
			player.get(i).setY(newY);

		}
		System.out.println(size);

		if (this.direction == "north") {
			//updates the direction of the head and then adds it to the front
			first = new Segment(player.getFirst().getX(), player.getFirst().getY() + 1, rad);
			player.addFirst(first);

		}
		if (this.direction == "south") {
			//updates the direction of the head and then adds it to the front
			first = new Segment(player.getFirst().getX(), player.getFirst().getY() - 1, rad);
			player.addFirst(first);

		}
		if (this.direction == "west") {
			//updates the direction of the head and then adds it to the front
			first = new Segment(player.getFirst().getX() - 1, player.getFirst().getY(), rad);
			player.addFirst(first);

		}
		if (this.direction == "east") {
			//updates the direction of the head and then adds it to the front
			first = new Segment(player.getFirst().getX() + 1, player.getFirst().getY(), rad);
			player.addFirst(first);

		} 
		//determines if the snake head is on top of the food
		if (player.get(0).foodEaten(food) == true) { 
			//if the snake eats the food then increase the size of the list and do not delete the segment at the end
			System.out.println("food eaten");
			size++;
			food = new Food();

		} else {
			player.removeLast();

		}
	}

	// check what the user pressed
	// save head and update other positions
	// update other pieces of snake to move to segments of snake
	// make animation loop to move snake segment

	@Override
	public void keyPressed(int arg0) {
	}

	@Override
	public void keyReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(char key) { 
		//changes the direction of the snake based on the key pressed
		// north
		if (key == 'w') {

			this.direction = "north";

		}
		// west
		if (key == 'a') {

			this.direction = "west";

		}
		// east
		if (key == 'd') {

			this.direction = "east";

		}
		// south
		if (key == 's') {

			this.direction = "south";

		}

	}

	@Override
	public void mouseClicked(double arg0, double arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(double arg0, double arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(double arg0, double arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(double arg0, double arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// make new segement
		// setFrameTime: 1000 
		
		//update resets the move method and redraws the snake
		draw.setFrameTime(500);
		draw.clear();

		moveSnake();

		drawSnake();
		food.drawFood();

		draw.show();

		//if the snake hits the walls then stop the game
		if (gameOver() == true) {

			draw.stopUpdate();
			draw.text(7, 7, "Game Over");

		}

		// player.addFirst(newSeg);
		// player.removeLast();
		// draw.pause(200);

	}

	public boolean gameOver() {

		//count variable used with collide method
		int count = 1;
		Segment first = player.get(0); 
		//checks to see if the snake crashed into the wall
		if (crash() == true) {
			System.out.println("game over");
			return true;
		} else {
			// check if first intersects with any of the other segments
			while (count < player.size()) {

				//checks to see if the snake hit any part of itself
				if (collide(player.get(count))) {
					System.out.println("game over 2");
					return true;
				}
				count++;

			}
			return false;

		}
	}

	public boolean crash() {

		//determines wether the snake hit the wall
		if (player.get(0).getX() > 15 || player.get(0).getX() < 0 || player.get(0).getY() > 15
				|| player.get(0).getY() < 0) {

			System.out.println("crash");
			return true;
		} else {
			return false;
		}

	}

	// makes a paramiter called colloide if the snake collides into iself
	public boolean collide(Segment other) { 
		
//determines if the snake hit itself
		if (player.get(0).getX() == other.xpos && player.get(0).getY() == other.ypos) {
			System.out.println("collide");
			return true;

		} else {

			return false;
		}

	}

	public class Segment {

		//x and y positions for segments
		private int xpos;
		private int ypos; 
		//radius of food and segments
		private double rad;
		private Food newFood;

		public Segment(int x, int y, double r) {
//gets the segment positions from the main snake class
			this.xpos = x;
			this.ypos = y;
			this.rad = r;
			this.newFood = new Food();

		}
//setters and getters for the x and y positions
		public void setX(int x) {
			this.xpos = x;

		}

		public void setY(int y) {
			this.ypos = y;

		}

		public int getX() {
			return xpos;

		}

		public int getY() {
			return ypos;

		}
//determines if the snake head is on top of the food
		public boolean foodEaten(Food other) {

			if (this.xpos == other.foodX && this.ypos == other.foodY) {
				return true;

			} else {
				return false;
			}

		}
//getter for food variable
		public Food getFood() {
			return newFood;
		}
	}
//food class to create the food
	public class Food {

		private int foodX;
		private int foodY;
		private double rad;

		public Food() {
//determines the position of the random food
			this.foodX = (int) (Math.random() * 15);
			this.foodY = (int) (Math.random() * 15);
			this.rad = 0.5;

		}

		public void drawFood() { 
			//draws the food

			draw.circle(foodX, foodY, rad);

		}

	}

}
