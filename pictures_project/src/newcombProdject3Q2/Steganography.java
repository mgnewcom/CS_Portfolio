package newcombProdject3Q2;

import edu.du.dudraw.*;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import edu.du.dudraw.DUDraw;

public class Steganography {
//method extracts image from file to display images side by side
	public static Color[][] extractSecretImage(Color[][] pic) {
		Color[][] colPic;
		int red, green, blue;
		colPic = new Color[pic.length][pic[0].length];

		for (int row = 0; row < colPic.length; row++) {
			for (int col = 0; col < colPic[0].length; col++) {
				
				red = pic[row][col].getRed() % 16;  
				green = pic[row][col].getGreen() % 16;
				blue = pic[row][col].getBlue() % 16;
				
				red = red * 16;
				green = green * 16;
				blue = blue * 16;
				colPic[row][col] = new Color(red, green, blue);

			}
		}

		return colPic;
	}
//method extracts one to display side by side with one hidden
	public static Color[][] embedSecretImage(Color[][] pub, Color[][] hide) {

		Color[][] pubHide = null;

		int red, green, blue = 0;
		int red2, green2, blue2 = 0;
		pubHide = new Color[pub.length][pub[0].length]; 
		
		//nested for loop ment for displaying the public image 
		for (int row = 0; row < pubHide.length; row++) {
			for (int col = 0; col < pubHide[0].length; col++) {

				//takes the highest 4 bites from the public image
				red = pub[row][col].getRed() - (pub[row][col].getRed() % 16);

				green = pub[row][col].getGreen() - (pub[row][col].getGreen() % 16);
				blue = pub[row][col].getBlue() - (pub[row][col].getBlue() % 16);

				//if statement dictates where the hidden image will go
				if (row < hide.length && col < hide[0].length) {

					//takes the lowest 4 bytes of the hidden image
					red2 = hide[row][col].getRed() / 16;
					green2 = hide[row][col].getGreen() / 16;
					blue2 = hide[row][col].getBlue() / 16;
					
				//combines the largest and smallest bytes of the images to embed the image
					red = red + red2;  
					green = green + green2;
					blue = blue + blue2; 
				}  
				
				
				
				pubHide[row][col] = new Color(red, green, blue);

			}
		}

		return pubHide;
	}

}
