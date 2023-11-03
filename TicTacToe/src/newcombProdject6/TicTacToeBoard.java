package newcombProdject6;

import java.util.Scanner;

public class TicTacToeBoard {

	private int[][] contents;
	private int X;
	private int O;
	private int turn;

	public TicTacToeBoard() {
		this.contents = new int[3][3];
		this.X = -1;
		this.O = 1;
	}

	public int gameWon() {  
		
			
		if(contents[0][0] == 1 && contents[0][1] == 1 && contents[0][2] == 1){  
			System.out.println("O wins");
			return 1;
			
		}else if(contents[0][0] == -1 && contents[0][1] == -1 && contents[0][2] == -1){ 
			System.out.println("X wins");
			return -1;
			
		}else if(contents[1][0] == 1 && contents[1][1] == 1 && contents[1][2] == 1){ 
			System.out.println("O wins");
			return 1;
			
		}else if(contents[1][0] == -1 && contents[1][1] == -1 && contents[1][2] == -1){ 
			System.out.println("X wins");
			return -1;
			
		}else if(contents[2][0] == 1 && contents[2][1] == 1 && contents[2][2] == 1){ 
			System.out.println("O wins");
			return 1;
			
		}else if(contents[2][0] == -1 && contents[2][1] == -1 && contents[2][2] == -1){ 
			System.out.println("X wins");
			return -1;
			
		}else if(contents[0][0] == 1 && contents[1][0] == 1 && contents[2][0] == 1){ 
			System.out.println("O wins");
			return 1;
			
		}else if(contents[0][0] == -1 && contents[1][0] == -1 && contents[2][0] == -1){ 
			System.out.println("X wins");
			return -1;
			
		}else if(contents[0][1] == 1 && contents[1][1] == 1 && contents[2][1] == 1){ 
			System.out.println("O wins");
			return 1;
			
		}else if(contents[0][1] == -1 && contents[1][1] == -1 && contents[2][1] == -1){ 
			System.out.println("X wins");
			return -1;
			
		}else if(contents[0][2] == 1 && contents[1][2] == 1 && contents[2][2] == 1){  
			System.out.println("O wins");
			return 1;
			
		}else if(contents[0][2] == -1 && contents[1][2] == -1 && contents[2][2] == -1){ 
			System.out.println("X wins");
			return -1;
			
		}else if(contents[0][0] == 1 && contents[1][1] == 1 && contents[2][2] == 1){ 
			System.out.println("O wins");
			return 1;
			
		}else if(contents[0][0] == -1 && contents[1][1] == -1 && contents[2][2] == -1){ 
			System.out.println("X wins");
			return -1;
			
		}else if(contents[0][2] == 1 && contents[1][1] == 1 && contents[2][0] == 1){  
			System.out.println("O wins");
			return 1;
			
		}else if(contents[0][2] == -1 && contents[1][1] == -1 && contents[2][0] == -1){ 
			System.out.println("X wins");
			return -1;
		}else {
			return 0; 
			
		} 
	}

		
		// if(contents.row[][])
		// come back to this, how do i tell the program what rows are
		// use lots of for loops

		
	

	public boolean boardFull() {
		boolean full;
		int array = 0;
		for (int row = 0; row < this.contents.length; row++) {
			for (int column = 0; column < this.contents[row].length; column++) {
				if (contents[row][column] == 0) {
					array++;
				}
			
			}
		}
		if (array == 0) {
			full = true; 
			System.out.print("cats game");

		} else {
			full = false;
		}
		return full;
	}

	public boolean squareOpen(int row, int column) {
		boolean open;
		open = true;

		if (contents[row][column] == -1 || contents[row][column] == 1) {
			open = false;
		} else if (contents[row][column] == 0) {
			open = true;
		}
		return open;

	}

	public void placeMarker(int row, int column, int turn) {
		if (turn == -1) {
			contents[row][column] = -1;
		} else if (turn == 1) {
			contents[row][column] = 1;
		}
	}

	public void drawGameToConsole() {

		for (int row = 0; row < contents.length; row++) {
			for (int column = 0; column < contents[row].length; column++) {
				//System.out.println(contents[row][column]);
				
				if (contents[row][column] == -1) {
					System.out.print("X |");

				} else if (contents[row][column] == 1) {
					System.out.print("O |");

				}else { 
					System.out.print(" |");
					
				}
			}
			System.out.println("");

		}
	}
}
