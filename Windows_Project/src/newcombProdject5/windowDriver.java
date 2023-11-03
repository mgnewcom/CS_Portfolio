package newcombProdject5;

import java.awt.Color;

import edu.du.dudraw.DUDraw;
import edu.du.dudraw.Draw;

public class windowDriver {

	public static void main(String[] args) {  
		
		//creates canvas
		windowDisplay winDis = new windowDisplay(200,200); 
		
		//draws windows in window display method
		winDis.addWindow(50,50,60,80,Draw.BLUE); 
		
		

		winDis.addWindow(100,130,80,80,Draw.RED); 
		
		
		winDis.addWindow(80,80,60,80,Draw.GREEN); 
		
		
		winDis.addWindow(100, 40, 60, 60, Draw.BLACK);
		winDis.refresh();  
		
		
		
		
		
		
		
	}

}
