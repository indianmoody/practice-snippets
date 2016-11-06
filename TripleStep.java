// Trple Step Problem
// A child is running up a staircase of n steps and can hop either 1, 2, or 3 at once. How many different ways are there for h or her
// to run up the stairs?

import java.util.Scanner;
import java.util.Arrays;

public class TripleStep {

	private static int[] arr;
	
	public static int ways(int n) {
		if (n<=3) {
			if (n<=0)
				return 0;
			return 1 + ways(n-1) + ways(n-2) + ways(n-3);
		}
		if (arr[n] != -1)
			return arr[n];
		else {
			return ways(n-1) + ways(n-2) + ways(n-3);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total number of stairs: ");
		int n = scan.nextInt();
		arr = new int[n+1];
		Arrays.fill(arr, -1);
		System.out.printf("Total number of ways to run up the stairs: %d", ways(n));
		scan.close();

	}

}
