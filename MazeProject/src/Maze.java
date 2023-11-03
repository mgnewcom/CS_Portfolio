import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import edu.du.dudraw.DUDraw;

public class Maze {
	// enum to specify the type of each coordinate
	public enum cellValue {
		WALL, OPEN, EXPLORED, FOUND
	}

//2d array to hold types for each coordinate of the maze 
	private cellValue[][] maze;
	// arraylist, stack and queue to open up the maze and solve it
	private Stack<container> breakOpen;
	private DLLQueue<container> explore;
	private ArrayList<container> neighbors;
	// stores height and width of the canvas
	private int height;
	private int width;

	public Maze(int w, int h) {
		this.height = h;
		this.width = w;
//declares the 2d array
		maze = new cellValue[w][h];
		DUDraw.setCanvasSize(400, 400);
		DUDraw.setXscale(0, w);
		DUDraw.setYscale(0, h);
		DUDraw.clear(DUDraw.LIGHT_GRAY);
		DUDraw.enableDoubleBuffering();
//sets all coordinates to walls
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				maze[i][j] = cellValue.WALL;

			}
		}
		// draws and updates the squares as nescesary
		draw();
		DUDraw.show();

	}

	public void draw() {
		// nested for loop gets the x and y values of each space on the canvas and
		// updates accordingly
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (maze[i][j] == cellValue.WALL) {
					DUDraw.setPenColor(DUDraw.BLACK);
					DUDraw.filledSquare(i, j, 1);

				} else if (maze[i][j] == cellValue.OPEN) {
					DUDraw.setPenColor(DUDraw.WHITE);
					DUDraw.filledSquare(i, j, 1);

				}
				if (maze[i][j] == cellValue.EXPLORED) {
					DUDraw.setPenColor(DUDraw.GREEN);
					DUDraw.filledSquare(i, j, 1);

				}
				if (maze[i][j] == cellValue.FOUND) {
					DUDraw.setPenColor(DUDraw.RED);
					DUDraw.filledSquare(i, j, 1);
					System.out.println("drew red square");

				}

			}
		}

	}

	public void generateMaze(int x, int y) {
		// currentCell = (x_start,y_start)
		breakOpen = new Stack<container>();

		DUDraw.setPenColor(DUDraw.WHITE);
		DUDraw.filledSquare(x, y, 1);
		// (x_start, y_start) represent the first cell to open up.
		// Values of x_start and y_start should be odd, you may choose a random cell
		// These values represent the first cell to open up.
		// set the currentCell to Open
		cellValue currentCell = maze[x][y] = cellValue.OPEN;
		// push currentCell on the stack
		breakOpen.push(new container(x, y));
		// while stack is not empty
		while (breakOpen.isEmpty() != true) {
			// pop the stack into currentCell
			container cell = breakOpen.pop();
			// if statements prevent the squares from being drawn out fo bounds
			if (cell.x < 0 || cell.y < 0 || cell.x >= width || cell.y >= height) {

			} else {

				// initialize arrayList neighbors
				neighbors = new ArrayList<container>();
				// do the following for all of the neighboring cells c of currentCell
				// (Note that the neighbors are to the north, south, east, west.
				// and Neighbors are two away in each direction from this cell.)

				// if maze 2 above and between is wall then open maze 2 and between and then add
				// maze 2 to list of neighbors repeat for left right and below
				// Check if c is within the array and has value Wall (see picture below)
				// if so:
				// set the current neighbor cell c to open and add it to neighbors.
				// set the cell between currentCell and c (labeled "wall to remove" in picture
				// below) to open (don't add to neighbors)
				if (cell.x + 2 < width) {
//if both 2 spaces ahead and one space are ahead are wall then break and add to list
					if (maze[cell.x + 2][cell.y] == cellValue.WALL && maze[cell.x + 1][cell.y] == cellValue.WALL) {
						maze[cell.x + 2][cell.y] = cellValue.OPEN;
						maze[cell.x + 1][cell.y] = cellValue.OPEN;

						neighbors.add(new container(cell.x + 2, cell.y));
						// at the end update the canvas
						draw();
						DUDraw.show();

					}
				}
				if (cell.x - 2 >= 0) {
					if (maze[cell.x - 2][cell.y] == cellValue.WALL && maze[cell.x - 1][cell.y] == cellValue.WALL) {
						maze[cell.x - 2][cell.y] = cellValue.OPEN;
						maze[cell.x - 1][cell.y] = cellValue.OPEN;

						neighbors.add(new container(cell.x - 2, cell.y));
						draw();
						DUDraw.show();

					}
				}
				if (cell.y + 2 < height) {
					if (maze[cell.x][cell.y + 2] == cellValue.WALL && maze[cell.x][cell.y + 1] == cellValue.WALL) {
						maze[cell.x][cell.y + 2] = cellValue.OPEN;
						maze[cell.x][cell.y + 1] = cellValue.OPEN;

						neighbors.add(new container(cell.x, cell.y + 2));
						draw();
						DUDraw.show();

					}
				}
				if (cell.y - 2 > 0) {
					if (maze[cell.x][cell.y - 2] == cellValue.WALL && maze[cell.x][cell.y - 1] == cellValue.WALL) {
						maze[cell.x][cell.y - 2] = cellValue.OPEN;
						maze[cell.x][cell.y - 1] = cellValue.OPEN;

						neighbors.add(new container(cell.x, cell.y - 2));
						draw();
						DUDraw.show();

					}
				}

				// shuffle the arrayList neighbors
				Collections.shuffle(neighbors);

				// push all the content of neighbors on the stack
				for (int i = 0; i < neighbors.size(); i++) {
					breakOpen.push(neighbors.get(i));

				}
			}
		}

	}

	public void solveMaze() {

//create new array   
		DLLQueue<container> explore = new DLLQueue<container>();
		// start is maze 1,1
		int x = 1;
		int y = 1;
		// set start and goal of maze
		container start = new container(x, y);

		container goal = new container(width - 2, height - 2);
		container currentCell = start;
		;
		cellValue goal2 = maze[width - 2][height - 2] = cellValue.OPEN;

		maze[currentCell.x][currentCell.y] = cellValue.EXPLORED;
		// add cell 1,1 into the queue
		explore.enqueue(currentCell);
		maze[width - 2][height - 2] = cellValue.OPEN;
		// this will be the starting point of solving the maze
		// while loop for while the queue is not empty and goal is not explored
		while (explore.isEmpty() != true && goal2 != cellValue.EXPLORED) {
			System.out.println("explore Cell");
			// deque the first element
			container cell = explore.dequeue();
			// set the value of the dequeued cell to explored
			maze[cell.x][cell.y] = cellValue.EXPLORED;
			// check if the current cell is equal to the goal then return otherwise go into
			// the neighboring cells are unexplored and if they are add them to queue
			if (cell.equals(goal)) { 
				//mark goal as found 
				maze[goal.x][goal.y] = cellValue.FOUND;
				System.out.println("found end!"); 
				//update the canvas before returning
				draw();
				DUDraw.show();
				return;
			} else { 
				//if statement keeps the search within the bounds
				if (cell.x < 0 || cell.y < 0 || cell.x >= width || cell.y >= height) {

				} else {

					// initialize arrayList neighbors
					neighbors = new ArrayList<container>();
					// do the following for all of the neighboring cells c of currentCell
					// (Note that the neighbors are to the north, south, east, west.
					// and Neighbors are two away in each direction from this cell.)

					// if maze 2 above and between is wall then open maze 2 and between and then add
					// maze 2 to list of neighbors repeat for left right and below
					if (cell.x + 2 < width) {

						if (maze[cell.x + 1][cell.y] == cellValue.OPEN) {
							maze[cell.x + 1][cell.y] = cellValue.EXPLORED;

							container c = new container(cell.x + 2, cell.y);
							neighbors.add(c);
							draw();
							DUDraw.show();

						}
					}
					if (cell.x - 2 >= 0) {
						if (maze[cell.x - 1][cell.y] == cellValue.OPEN) {
							maze[cell.x - 1][cell.y] = cellValue.EXPLORED;

							container c = new container(cell.x - 2, cell.y);
							neighbors.add(c);
							draw();
							DUDraw.show();

						}
					}
					if (cell.y + 2 < height) {
						if (maze[cell.x][cell.y + 1] == cellValue.OPEN) {
							maze[cell.x][cell.y + 1] = cellValue.EXPLORED;

							container c = new container(cell.x, cell.y + 2);
							neighbors.add(c);
							draw();
							DUDraw.show();

						}
					}
					if (cell.y - 2 > 0) {
						if (maze[cell.x][cell.y - 1] == cellValue.OPEN) {
							maze[cell.x][cell.y - 1] = cellValue.EXPLORED;

							container c = new container(cell.x, cell.y - 2);
							neighbors.add(c);
							explore.enqueue(c);
							draw();
							DUDraw.show();

						}
					}
					

					// shuffle the arrayList neighbors
					Collections.shuffle(neighbors);
					

					// push all the content of neighbors on the stack
					// end

					for (int i = 0; i < neighbors.size(); i++) {
						explore.enqueue(neighbors.get(i));


						
					}
				}

			}

			
		}
	}

	public class container {
		private int x;
		private int y;

		public container(int xpos, int ypos) {
			this.x = xpos;
			this.y = ypos;

		}

		public String toString() {
			return x + " " + y;
		}

		public Boolean equals(container c) {
			if (this.x == c.x && this.y == c.y) {
				return true;
			}
			return false;

		}
	}

}
