
public class mazeDriver {

	public static void main(String[] args) {
		Maze g = new Maze(51, 51); 
		g.generateMaze(5,5); 
		g.solveMaze();

	}

}
