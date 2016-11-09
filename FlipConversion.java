// find number of bits to be flipped to convert a number into another number

import java.lang.Math;

public class FlipConversion {

	public static int findDifferentBits(int a, int b) {
		int c = a ^ b;
		int i=0, count=0;
		while (Math.pow(2, i-1) < c) {
			if (getBit(c, i) != 0)
				count++;
			i++;
		}
		return count;
	}
	
	public static int getBit(int num, int i) {
		return num & (1<<i);
	}
	
	public static void main(String[] args) {
		int x = 21;
		int y = 35;
		
		System.out.println(findDifferentBits(x, y));

	}

}
