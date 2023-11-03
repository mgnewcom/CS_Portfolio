package newcombProdject3Q2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import edu.du.dudraw.DUDraw;

//import com.sun.tools.javac.code.Attribute.Array;

import java.awt.Color;
import java.io.IOException;
import java.io.RandomAccessFile;

import java.util.Scanner;

public class colImageDriver {

	public static void main(String[] args) throws IOException {
		// Color[][] alcatrazArray = new
		// Color[alcatrazArray.length][alcatrazArray[0].length];
		// Color[][] secretArray = new Color[secretArray.length][secretArray[0].length];
		Scanner keyboard = new Scanner(System.in);
		String userChoice;
		String userInput;
		String userInput2;
		Color[][] alcatrazArray = null;

		Color[][] embeddedImage = null;
		System.out.println("Do you want to extract or embed");
//gets images and reads from file
		userChoice = keyboard.nextLine();
		if (userChoice.equals("extract")) {

			System.out.println("please enter the secret file");
			userInput = keyboard.nextLine();
			Color[][] secretArray = null;
			Color[][] alcatrazWithSecret = null;
			try {
				alcatrazWithSecret = BIMPO.readBMPFile(userInput);

			} catch (Exception e) {

				System.out.println("IO faliure");
				System.out.println(e.getMessage());
				System.exit(0);

			}
//sets the canvas
			Color[][] alcatrazWithoutSecret = alcatrazWithSecret;
			secretArray = Steganography.extractSecretImage(alcatrazWithSecret);
			DUDraw.setCanvasSize(alcatrazWithSecret[0].length * 2, alcatrazWithSecret.length);
			DUDraw.clear(DUDraw.LIGHT_GRAY);
			DUDraw.setXscale(0, alcatrazWithSecret[0].length * 2);
			DUDraw.setYscale(0, alcatrazWithSecret.length);
			DUDraw.enableDoubleBuffering();

			// draws the images
			for (int row = 0; row < alcatrazWithoutSecret.length; row++) {
				for (int col = 0; col < alcatrazWithoutSecret[0].length; col++) {

					DUDraw.setPenColor(alcatrazWithoutSecret[row][col]);
					DUDraw.point(col, row);

				}
			}
			for (int row = 0; row < secretArray.length; row++) {
				for (int col = alcatrazWithoutSecret[0].length; col < secretArray[0].length
						+ alcatrazWithoutSecret[0].length; col++) {

					DUDraw.setPenColor(secretArray[row][col - alcatrazWithoutSecret[0].length]);
					DUDraw.point(col, row);

				}
			}
			DUDraw.show();
		} else if (userChoice.equals("embed")) {
//gets files from user
			System.out.println("please enter the first file");
			userInput = keyboard.nextLine();
			System.out.println("please enter the second file");
			userInput2 = keyboard.nextLine();
			Color[][] alcatrazNoSecret = null;
			Color[][] secretArray = null;
			// Color[][] alcatrazWithoutSecret = alcatrazWithSecret;
			try {
				alcatrazNoSecret = BIMPO.readBMPFile(userInput);
				secretArray = BIMPO.readBMPFile(userInput2);

			} catch (Exception e) {

				System.out.println("IO faliure");
				System.out.println(e.getMessage());
				System.exit(0);

			}

			System.out.println(alcatrazNoSecret);
			System.out.println(secretArray);

			// get file names ant then calls embed to store the read files
			embeddedImage = Steganography.embedSecretImage(alcatrazNoSecret, secretArray);

			// sets the canvas size based on the original image
			DUDraw.setCanvasSize(alcatrazNoSecret[0].length * 2, alcatrazNoSecret.length);
			DUDraw.clear(DUDraw.LIGHT_GRAY);
			DUDraw.setXscale(0, alcatrazNoSecret[0].length * 2);
			DUDraw.setYscale(0, alcatrazNoSecret.length);
			DUDraw.enableDoubleBuffering();

			// draws the images
			for (int row = 0; row < alcatrazNoSecret.length; row++) {
				for (int col = 0; col < alcatrazNoSecret[0].length; col++) {

					DUDraw.setPenColor(alcatrazNoSecret[row][col]);
					DUDraw.point(col, row);

				}
			}

			for (int row = 0; row < embeddedImage.length; row++) {
				for (int col = 0; col < embeddedImage[0].length; col++) {

					DUDraw.setPenColor(embeddedImage[row][col]);
					DUDraw.point(col + alcatrazNoSecret[0].length, row);

				}
			}
			DUDraw.show();
			// method copies and saves the embeded image
			writeBMPCopy(userInput, "Secret" + userInput, embeddedImage);
		}
	}

	public static void writeBMPCopy(String in_path, String out_path, Color[][] image) throws IOException {
		Path src = Paths.get(in_path);
		Path dst = Paths.get(out_path);
		int red;
		int green;
		int blue;

		// Copy the file from input to output
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);

		// TODO: Open the output file using a RandomAccessFile, and use
		// the contents of the 'image' array to overwrite the
		// color data in the appropriate place in the output file

		RandomAccessFile out = new RandomAccessFile(out_path, "rw");

		// going to look similar to reading code and instead of reading bytes we are
		// writing bytes

		// calling out.rightByte
		// nested for loop

		// loop over image array image[][]
		// write image to the file

		out.seek(54);
		for (int row = 0; row < image.length; row++) {
			for (int col = 0; col < image[0].length; col++) {

				red = image[row][col].getRed();

				green = image[row][col].getGreen();

				blue = image[row][col].getBlue();

				out.writeByte(blue);
				out.writeByte(green);
				out.writeByte(red);

			}

		}

		out.close();

		//
		// etc...
		//
	}

}
