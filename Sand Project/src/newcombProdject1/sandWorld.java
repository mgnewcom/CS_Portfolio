package newcombProdject1;

import edu.du.dudraw.DUDraw;

public class sandWorld {
	public enum ParticleType {

		SAND, FLOOR, AIR, GROUND, SHOVEL, RAIN

	}

	int xpos;
	int ypos;
	static int toolType;

	ParticleType[][] world;
	DUDraw[][] squares;

	public sandWorld(int x, int y) {
		this.xpos = x;
		this.ypos = y;
		this.world = new ParticleType[xpos][ypos];
		this.squares = new DUDraw[10][10];
		toolType = 0;
		// nested for loop goes here to initialize array
		for (xpos = 0; xpos < world.length; xpos++) {
			for (ypos = 0; ypos < world[xpos].length; ypos++) {
				world[xpos][ypos] = ParticleType.AIR;
//fills up the canvas with grids of square to determine how the particles can be placed
				for (int i = 10; i < squares.length; i += 10) {
					for (int j = 10; j < squares[i].length; j += 10) {
						DUDraw.setPenColor(DUDraw.LIGHT_GRAY);
						DUDraw.filledSquare(i, j, 10);
					}
				}

				// draw rectangles using array

			}
		}
	}

	public boolean placeParticle(int col, int row, ParticleType newType) {
		boolean place = true;

		// check to see if this positon is empty
		// if it is empty than change the contents to sand 
		
		//makes sure program dosent crash if the user exits the boundaries while dispensing sand
		if (row < 500 && row > 0 && col < 500 && col > 0) {

			// recive a location row colum paricle type, no checks, check to see if row and
			// column are inside bounds, if not return false, if in bounds change world to
			// sand

			if (newType == ParticleType.SAND) {
				world[row][col] = ParticleType.SAND;
				if (Math.random() < 0.5) {
					world[row + 1][col] = ParticleType.SAND;
				}
				if (Math.random() < 0.5) {
					world[row - 1][col] = ParticleType.SAND;
				}
				if (Math.random() < 0.5) {
					world[row][col + 1] = ParticleType.SAND;
				}
				if (Math.random() < 0.5) {
					world[row][col - 1] = ParticleType.SAND;
				}
			}

			// create loop to randomize x points nearby to spread out sand
			place = true;

			// System.out.println("works");
			return place;

		} else {

			place = false;
			System.out.println("cannot place there");

			return place;

		}

	}

	public boolean placeGround(int col, int row, ParticleType newType) {
		boolean placeGround = true;
		if (row < 500 && row > 0 && col < 500 && col > 0) {

			placeGround = true;
			if (newType == ParticleType.GROUND) {
				world[row][col] = ParticleType.GROUND;
				// System.out.println("works");

			}
			return placeGround;
		} else {

			placeGround = false;
			System.out.println("cannot place there");

			return placeGround;

		}

	}

	

	public boolean rain(int col, int row, ParticleType newType) {
		boolean place = true;

		if (row < 500 && row > 0 && col < 500 && col > 0) {
			place = true;

			if (newType == ParticleType.RAIN) {
				world[row][col] = ParticleType.RAIN;

			}

			// create loop to randomize x points nearby to spread out sand

			// System.out.println("works");
			return place;

		} else {

			place = false;
			System.out.println("cannot place there");

			return place;

		}

	}

	public void displayToolName(String newType) {

		DUDraw.text(450, 450, newType);

	}

	public void step() {

		for (int r = 1; r < world.length - 1; r++) {
			for (int c = 0; c < world[r].length; c++) {
				if (this.world[r][c] == ParticleType.SAND && this.world[r - 1][c] == ParticleType.AIR && c > 1) {
					this.world[r][c] = ParticleType.AIR;
					
					this.world[r - 1][c] = ParticleType.SAND;
					

				} 
				
				if(world[r][c] == ParticleType.SAND && 
						world[r][c-1] == ParticleType.AIR && 
				world[r][c+1] == ParticleType.AIR &&
						world[r-1][c] == ParticleType.SAND) { 
					if(Math.random() > 0.5) { 
						
							
							world[r][c+1] = ParticleType.SAND;
								
								
						
					}else { 
						
							
							
							world[r][c-1] = ParticleType.SAND;
						
						
					}  
					world[r][c] = ParticleType.AIR;
				
					
				}  
				//sand flows to fill up the corners if there is no sand already
				if(world[r][c] == ParticleType.SAND && world[r-1][c-1] == ParticleType.AIR) { 
					world[r][c-1] = ParticleType.SAND; 
					world[r][c] = ParticleType.AIR;
					
				} 
				
				if(world[r][c] == ParticleType.SAND && world[r-1][c+1] == ParticleType.AIR) { 
					world[r][c+1] = ParticleType.SAND; 
					world[r][c] = ParticleType.AIR;
					
				} 
				
			}

		}

	}

	public void rainFall() { 
		//array is always reinsaciated to check to see where rain can be placed
		for (int r = 1; r < world.length - 1; r++) {
			for (int c = 0; c < world[r].length; c++) {
				if (this.world[r][c] == ParticleType.RAIN && this.world[r - 1][c] == ParticleType.AIR && c > 1) {
					this.world[r][c] = ParticleType.AIR;
					this.world[r - 1][c] = ParticleType.RAIN;
				
				
			}  
				
				
				if(world[r][c] == ParticleType.RAIN && 
						world[r][c-1] == ParticleType.AIR && 
						world[r][c+1] == ParticleType.AIR && 
						world[r-1][c] == ParticleType.RAIN) { 
					if(Math.random() < 0.5) { 
						world[r][c-1] = ParticleType.RAIN;
						
					}else{ 
						world[r][c+1] = ParticleType.RAIN;
						
					} 
					world[r][c] = ParticleType.AIR;
					
				} 
				//rain flows left and right to where there is no water already present 
				if(world[r][c] == ParticleType.RAIN && world[r][c-1] == ParticleType.AIR){ 
					world[r][c] = ParticleType.AIR;
					world[r][c-1] = ParticleType.RAIN; 
					
					
				} 
				if(world[r][c] == ParticleType.RAIN && world[r][c+1] == ParticleType.AIR) {  
					world[r][c] = ParticleType.AIR;
					world[r][c+1] = ParticleType.RAIN; 
					
				} 
				if(c <= 0) { 
					world[r][c+1] = ParticleType.AIR;
					
				}else if(c >= 500) { 
					world[r][c-1] = ParticleType.AIR;
					
				}
		} 
			}
		}

	//}

	public void draw() {
//2d array is always reinstaciated in order to check the canvas
		for (xpos = 0; xpos < world.length; xpos++) {
			for (ypos = 0; ypos < world[xpos].length; ypos++) {

				if (world[ypos][xpos] == ParticleType.SAND) {
					DUDraw.setPenColor(DUDraw.YELLOW);
					DUDraw.point(xpos, ypos);
				}

			}
		}

	}

	public void drawGround() {
		for (xpos = 0; xpos < world.length; xpos++) {
			for (ypos = 0; ypos < world[xpos].length; ypos++) {

				if (world[ypos][xpos] == ParticleType.GROUND) {
					DUDraw.setPenColor(DUDraw.BLACK);
					DUDraw.filledCircle(xpos, ypos, 5);
				}

			}

		}

	}

	public void drawRain() {
		for (xpos = 1; xpos < world.length; xpos++) {
			for (ypos = 1; ypos < world[xpos].length; ypos++) {

				if (world[ypos][xpos] == ParticleType.RAIN) {
					DUDraw.setPenColor(DUDraw.BOOK_BLUE);
					DUDraw.point(xpos, ypos);

				}

			}

		}
	}
}
