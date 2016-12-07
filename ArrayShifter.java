import java.util.*;

// Shift array elements in left or right with ShiftArrayLeft or ShiftArrayRight functions respectively.
// The functions take 2 arguments, the array to be shifted and number of shifts desired.

public class ArrayShifter {
	
	public static int[] ShiftArrayLeft(int[] arr, int x) {
		int n = arr.length;
		int[] temp = new int[n];
		for (int i=0; i<x; i++) {
			temp[n+i-x] = arr[i];
		}
		for (int i=x; i<n; i++) {
			temp[i-x] = arr[i];
		}
		
		return temp;
	}
	
	public static int[] ShiftArrayRight(int[] arr, int x) {
		int n = arr.length;
		int[] temp = new int[n];
		for (int i=0; i<n; i++) {
			temp[(i+x)%n] = arr[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(arr));
		arr = ShiftArrayLeft(arr, 2);
		System.out.println(Arrays.toString(arr));
		arr = ShiftArrayRight(arr, 2);
		System.out.println(Arrays.toString(arr));

	}

}
