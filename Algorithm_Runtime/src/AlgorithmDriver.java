import java.util.Arrays;

public class AlgorithmDriver {

	public static void main(String[] args) {

		System.out.println("n\t A1\t A2\t A3");
//creates a new array 
		for (int n = 50000; n <= 800000; n *= 2) {

			int oneToTen;
			// int[] arr = {-7, -1, 0, 1, 3, 4, 7};
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 2 * n) + 1;

			}

			// sorts the contents of the array
			Arrays.sort(arr);

			long start1 = System.currentTimeMillis();
			// runs diffrent trials for the program because the methods have diffrent
			// runtimes
			long numTrials1 = 3;
			long numTrials2 = 2000;
			long numTrials3 = 30000;
//for every method start the timer and run through the loop with the trials and then afterwards stop the timer and get the average
			for (int i = 0; i < numTrials1; i++) {
				Algorithm.A1(arr);
			}
			long stop1 = System.currentTimeMillis();
			double d1 = (double) (stop1 - start1) / numTrials1;

			long start2 = System.currentTimeMillis();
			for (int i = 0; i < numTrials2; i++) {
				Algorithm.A2(arr);
			}
			long stop2 = System.currentTimeMillis();
			double d2 = (double) (stop2 - start2) / numTrials2;

			long start3 = System.currentTimeMillis();
			for (int i = 0; i < numTrials3; i++) {
				Algorithm.A3(arr);
			}
			long stop3 = System.currentTimeMillis();
			double d3 = (double) (stop3 - start3) / numTrials3;

			// System.out.println(a.A2(arr));
			// System.out.println(a.A3(arr));

			// once testing is done time arrays by making arrays that

			System.out.println(n + "\t" + d1 + "\t" + d2 + "\t" + d3);

		}

	}

}
