package mini2;

import java.util.*;

// number of trailing zeros in factorial of a number

public class FactorialZeros {
	
	public static int zeros(int n) {
		int count2 = 0, count5 = 0;
		for (int i=n; i>1; i--) {
			count2 += numberOf2(i);
			count5 += numberOf5(i);
		}
		if (count2 < count5)
			return count2;
		else
			return count5;
	}
	
	public static int numberOf5(int n) {
		int ans = 0;
		while (n%5 == 0) {
			ans++;
			n = n/5;
		}
		return ans;
	}
	
	public static int numberOf2(int n) {
		int ans = 0;
		while (n%2 == 0) {
			ans++;
			n = n/2;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find trailing zeros in its factorial: ");
		int n = sc.nextInt();
		System.out.printf("Number of trailing zeros in factorial of %d: %d\n", n, zeros(n));

	}

}
