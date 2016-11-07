// Magic Index
// Find and print al magic index numbers in an array
// method "distinct": to solve quickly for sorted distinct array
// method "nonDistinct" to solve efficiently sorted not distinct array 

public class MagicIndex {

	public static void distinct(int[] A) {
		int i = 0;
		while (A[i] == i && i < A.length) {
			System.out.printf("%d, ", i);
			i++;
		}
		System.out.println();
	}
	
	public static void notDistinct(int[] B) {
		int i = 0;
		while(i < B.length) {
			if (B[i] == i)
				System.out.printf("%d, ", i);
			else if(i < B.length) {
				i = B[i];
				continue;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		int[] A = {0, 1, 2, 4, 6, 8, 9};
		int[] B = {2, 3, 3, 3, 4, 5, 8, 8, 8}; 
		
		distinct(A);
		notDistinct(B);

	}

}
