// Quick implementation if insertion sort

public class Insertion {

	public static int[] insSort(int[] arr) {
		for (int i=1; i<arr.length; i++) {
			for (int j=0; j<i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					for (int k=i; k>j; k--) {
						arr[k] = arr[k-1];
					}
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {21, 31, 2, 289, 10, 1};
		arr = insSort(arr);
		for (int i=0; i<arr.length; i++)
			System.out.printf("%d, ", arr[i]);
		System.out.println();

	}

}
