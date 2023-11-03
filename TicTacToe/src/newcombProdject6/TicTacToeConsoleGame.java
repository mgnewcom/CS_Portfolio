package newcombProdject6; 
import java.util.Scanner;

public class TicTacToeConsoleGame {

	public static void main(String[] args) { 
		int pickRow; 
		int pickColumn;  
		int turn = -1; 
		
		TicTacToeBoard t = new TicTacToeBoard(); 
		Scanner keyboard = new Scanner(System.in); 
		
		//t.TicTacToeBoard(); 
		
		System.out.println("enter 0 for column/row 1"); 
		System.out.println("enter 1 for column/row 2"); 
		System.out.println("enter 2 for column/row 2");
		while(!t.boardFull()) { 
			if (turn == -1) { 
			
			System.out.println( "X please enter a row and column");
			}else if(turn == 1) { 
				System.out.println("O please enter a row and column");
			} 
		
		//t.gameOne(0);  
		pickRow = keyboard.nextInt(); 
		pickColumn = keyboard.nextInt(); 
		while (!t.squareOpen(pickRow, pickColumn)) {
			System.out.println("Please pick another square");
			pickRow = keyboard.nextInt(); 
			pickColumn = keyboard.nextInt(); 
			t.squareOpen(pickRow, pickColumn);
	
		}
		if (t.squareOpen(pickRow, pickColumn)) {
			t.placeMarker(pickRow, pickColumn, turn);
			t.drawGameToConsole(); 
		} 
	 t.gameWon(); 
		
	
		
		 
		//turnTaker(turn);  
		
		if(turn == 1) { 
			turn = -1; 
		
			
		}else if(turn == -1) { 
			turn = 1; 
		} 
		
		} 
		

	}
	
 
		
	
	

}
