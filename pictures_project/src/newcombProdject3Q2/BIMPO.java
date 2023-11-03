package newcombProdject3Q2;

import java.awt.Color;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BIMPO { 
	public static Color[][] readBMPFile(String fileName) throws IOException{
		//this method reads the file and then returns by storing it in a color array
		 byte char1, char2; 
		 int offset;
		 RandomAccessFile input = new RandomAccessFile(fileName, "r");  
		 char1 = input.readByte(); 
		 char2 = input.readByte(); 
		 if(char1 != 'B' || char2 != 'M') { 
			 input.close(); 
			 return null;
			 }  
		 input.seek(10); 
		 offset = input.readInt(); 
		 offset = Integer.reverseBytes(offset); 
		 if(offset != 54) { 
			 return null;
			 
		 }else { 
			 System.out.println("10 works");
		 }
		 
		 input.seek(18);  
		 int width = input.readInt();  
		 //System.out.println(width);
		 int height = input.readInt(); 
		 width = Integer.reverseBytes(width); 
		 height = Integer.reverseBytes(height);
		 if(width%4 != 0) { 
			 return null;
		 }else { 
			 System.out.println("18 works");
		 }
		 
		 input.seek(28); 
		 Short n; 
		 n = input.readShort(); 
		 n = Short.reverseBytes(n); 
		 if(n != 24) { 
			 
			 return null;
			 
		 }else { 
			 System.out.println("28 works");
		 }  
		 
		 input.seek(54); 
		 int red, green, blue; 
		 Color[][] picture = new Color[height][width]; 
		 
		 for(int row = 0; row < picture.length; row++) { 
			 for(int col = 0; col < picture[0].length; col++) { 
				 red = input.readUnsignedByte(); 
				 green = input.readUnsignedByte();
				 blue = input.readUnsignedByte(); 
				 
				 picture[row][col] = new Color(blue, green, red);
				 
			 } 
			 
			 
		 } 
		 
		 return picture;
		 
		 
		 


	}

}
