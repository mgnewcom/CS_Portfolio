
public class Algorithm {

	public Algorithm() {

	}

	public static boolean A1(int arr[]) {

		// integer to track the current element in array
		int current = 0;
		// determines wether elements have repeated or not
		
		// for loop to run trough elements
		for (int i = 0; i < arr.length; i++) {
			// sets current to be the current element
			current = arr[i];
			// calls method to find counterpart
			if (A1FindCounterPart(current, arr) == true) {
				return true;
			} else {

			}
		} 
		return false;
		

	}

	public static boolean A2(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			//runs through the whole array and gets values to run though the method evaluating to either true or false
			if (A2BinarySearch(arr, arr[i]) == true) { 
				
				return true;
				}

		}
		
		return false; 
		}

	

	public static boolean A3(int arr[]) {
		// first and last both store the index 
		int i = 0; 
		int j = arr.length-1;
		int first = arr[0];
		int last = arr[arr.length - 1];
		
		
		// runs through the entire array
		while(i < j) {
			// if the sum of i and j is 0 then return true 
			if (first + last == 0) {
				return true;
				// if the indexes eventualy are equal to each other then return false
			
			//if first aand last are less than or greater than 0 then adjust accordingly
			}else if(first + last > 0) {
				j--;
				last = arr[j];
				
			} else if(first + last < 0) { 
				i++; 
				first = arr[i];
			}
			}

		
		return false;

	}

	public static boolean A1FindCounterPart(int n, int arr[]) {
		//System.out.println(" ");
		//System.out.println("currentley testing: " + n);
		// sets the integer to its counterpart for easier search
		n *= -1;
		
		// runs through array once again
		for (int i = 0; i < arr.length; i++) {
			
			//if n is equal to the current array value return true otherwise if none are equal return false
			if (n == arr[i]) {
				
				return true;
			} else {
				
			}
		} 
		return false;
		

	}

	public static boolean A2BinarySearch(int arr[], int search) {

		//sets search value to be opposite for easier search
		search *= -1; 
		
		//gets the first and last positions of the array
		int first = 0;
		int last = arr.length - 1; 
		//gets values from both sides to eventually equal each other
		while (first <= last) { 
			//gets the middle of the array
			int middle = (first + last) / 2; 
			//tests to see if the middly is equal to the search value, if less than or equal then move to the next valuer in the arry
			if (arr[middle] == search) {
				return true;
			} else if (search < arr[middle]) {
				last = middle - 1;
			} else {
				first = middle + 1;
			}
		} 
		//if none equal the seach value then return false  
		return false;
	}

}
