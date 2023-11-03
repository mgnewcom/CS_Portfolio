package newcombProdject5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.HashMap;

import edu.du.dudraw.*;

public class readBabyNamesDriver {
	private static int[] totalNames;

	public static void main(String[] args) {
		// reads from the file twice, once to get data and once to get years
		ArrayList<HashMap<String, Double>> data = fileRead();
		ArrayList<HashMap<String, Integer>> years = fileRead2();
		// initalizes the keyboard
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("please enter a name: olivia");
		// asks user to read from file and prints graph
		String user = Keyboard.nextLine();
		printGraph(data, user, totalNames, years);
		// gets information for the report names method
		System.out.println("please enter a year between 1880 and 2022");
		int userYear = Keyboard.nextInt();
		if (userYear > 2022 || userYear < 1879) {
			System.out.println("that year is invalad");

		} else {
			System.out.println("please enter a number for the top names during that year");
			int userNumber = Keyboard.nextInt();
			System.out.println(reportNames(userYear, data, userNumber));

		}

		// have the user input a name
		// have files search for name and data
		// make graph using the lines and coordinates of name during the year
		// draw text outputting its peak
		// draw text outputting maximum frequency
		// beak into separate methods
		// consider the persentage of people named that year ex:( name: kim, number of
		// people named kim: 10, total amount of people named that year: 1000,
		// output(10/1000))

	}

	public static ArrayList<HashMap<String, Double>> fileRead() {

		//stores info in hash map
		ArrayList<HashMap<String, Double>> saveNames = new ArrayList<HashMap<String, Double>>();
		String theLine = "";
		String saveName;
		int[] totalPeopleNamed = new int[2022 - 1880];
		

		// DUDraw.setCanvasSize(500, 500);
		// DUDraw.setXscale(0, 100);
		// DUDraw.setYscale(0, 20000);

		// open up the file for reading:
		File inputFile;
		// Try block which contains the code that can throw exception
		for (int i = 1880; i <= 2021; i++) {
			saveNames.add(i - 1880, new HashMap<String, Double>());
			try {
				String fileName = "names/yob" + i + ".txt";
				inputFile = new File(fileName);

				// Hook up the Scanner to read from the file:
				Scanner file;
				// This line below can throw an exception if file doesn't exist
				file = new Scanner(inputFile);
				totalPeopleNamed[i - 1880] = 0;
				while (file.hasNext()) {
					// read the name out of the file and save the highest number found

					theLine = file.nextLine();

					//split the line and separate the name and get the total people names for each year
					String[] splitLine = theLine.split(",");
					String name = splitLine[0];
					double count = Integer.parseInt(splitLine[2]);
					totalPeopleNamed[i - 1880] += count;
					saveNames.get(i - 1880).put(name, count);
					// System.out.println("found olivia");

				}
				// DUDraw.text(50, 19000," maximum frequency: ");

				file.close();
			} catch (FileNotFoundException e) {
				// If exception is thrown, then we print this message
				System.out.println("That file does not exist");

			}

		} 
		//returns the names and data 
		totalNames = totalPeopleNamed;
		return saveNames;

		// System.out.println("The name: " + n + " first appeared in: " +
		// saveFirstYear);
		// System.out.println("the percentange of people named " + n + " is " +
		// (nameCount * 1.0 / totalPeopleNamed) * 10+ "% in " + saveYear);

	}
//same as previous method but retuns the names and years in a hash map
	public static ArrayList<HashMap<String, Integer>> fileRead2() {

		ArrayList<HashMap<String, Integer>> saveNames = new ArrayList<HashMap<String, Integer>>();
		String theLine = "";
		String saveName;
		int[] totalPeopleNamed = new int[2022 - 1880];
		

		// DUDraw.setCanvasSize(500, 500);
		// DUDraw.setXscale(0, 100);
		// DUDraw.setYscale(0, 20000);

		// open up the file for reading:
		File inputFile;
		// Try block which contains the code that can throw exception
		for (int i = 1880; i <= 2021; i++) {
			saveNames.add(i - 1880, new HashMap<String, Integer>());
			try {
				String fileName = "names/yob" + i + ".txt";
				inputFile = new File(fileName);

				// Hook up the Scanner to read from the file:
				Scanner file;
				// This line below can throw an exception if file doesn't exist
				file = new Scanner(inputFile);
				totalPeopleNamed[i - 1880] = 0;
				while (file.hasNext()) {
					// read the name out of the file and save the highest number found

					theLine = file.nextLine();

					String[] splitLine = theLine.split(",");
					String name = splitLine[0];
					double count = Integer.parseInt(splitLine[2]);
					totalPeopleNamed[i - 1880] += count;
					saveNames.get(i - 1880).put(name, i);
					// System.out.println("found olivia");

				}
				// DUDraw.text(50, 19000," maximum frequency: ");

				file.close();
			} catch (FileNotFoundException e) {
				// If exception is thrown, then we print this message
				System.out.println("That file does not exist");

			}

		}
		totalNames = totalPeopleNamed;
		return saveNames;

		// System.out.println("The name: " + n + " first appeared in: " +
		// saveFirstYear);
		// System.out.println("the percentange of people named " + n + " is " +
		// (nameCount * 1.0 / totalPeopleNamed) * 10+ "% in " + saveYear);

	}

	public static void printGraph(ArrayList<HashMap<String, Double>> values, String n, int[] totalPeople, 
			//arraylist to get the information read from the file
			ArrayList<HashMap<String, Integer>> years) {
		//stores information needed to produce the graph
		double max = 0;
		int count = 0;
		int sYear = 0;
		double saveFY = 0; 
		//retreaves the value for each year of the name  
		for (int i = 0; i < 2022 - 1880; i++) {
			HashMap<String, Double> nameValue = values.get(i);
			HashMap<String, Integer> nameYear = years.get(i);
			// frequency of babies that goes with that name for that year 
			
			double y2 = nameValue.get(n); 
			//saves the values displayed at the top of the graph
			if (count == 0) {
				sYear = nameYear.get(n);
				count++;

			} 
			
			double newFrequency = y2 / totalNames[i];
			if (max < newFrequency) {
				max = newFrequency;
				saveFY = 1880 + i;
			}

		} 
		//sets canvas based on the max
		DUDraw.setCanvasSize(500, 500);
		DUDraw.setXscale(0, 2022 - 1880);
		DUDraw.setYscale(0, max / 1.125);

		// get the hash map for each year
		int count2 = 0;
//draws the lines of the graph
		for (int i = 0; i < 2022 - 1880; i++) {

			HashMap<String, Double> nameValue = values.get(i);
			// frequency of babies that goes with that name for that year
			double y2 = nameValue.get(n);

			DUDraw.line(i, 0, i, y2 / totalNames[i]);

			// draw line

		}
//draws the statistics of the data
		DUDraw.text((2022 - 1880) / 2, (max / 1.125) * 0.95, "the first appearence of " + n + " was: " + sYear);
		Math.round(max);
		DUDraw.text((2022 - 1880) / 2, (max / 1.125) * 0.85,
				"the max frequency of the name " + n + " is: " + max * 0.1 + "% in the year: " + saveFY);
		DUDraw.show();

	}

	public static String reportNames(int year, ArrayList<HashMap<String, Double>> mostPopularName, int k) {
	//string variable to save the top names
		String topNames = "";
		int count = 0; 
		//two hash maps to save the origional data and store it in 
		HashMap<String, Double> searchK = mostPopularName.get(2021 - year);
		HashMap<Double, String> saveNames = new HashMap<Double, String>();
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<Double> numbers = new ArrayList<Double>();
		// first for loop to get the names
		for (String n : searchK.keySet()) {
			strings.add(n);

		}
		// second for loop to get the values
		for (Double n : searchK.values()) {

			numbers.add(n);

		}

		// third for loop to add them in
		for (Double n : searchK.values()) {

			saveNames.put(numbers.get(count), strings.get(count));
			count++;

		}
		// sorting the numbers in the hash map
		Collections.sort(numbers); 
		//creates array to store top values
		String[] getNames = new String[k]; 
		//gts the top names in reverse order and stores them into the array
		for (int i = 0; i < k; i++) {
			getNames[i] = saveNames.get(numbers.get(numbers.size() - i - 1)); 
			//stores the names in a string to avoid outputting the memory adress
			topNames = topNames + getNames[i] + ", ";
			// System.out.print(getNames[i] + ", ");

		}

		return topNames;

	}
}
