// quick implementation of selection sort

public class Selection {

	public static int[] selSort(int[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			int min = i;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {21, 2, 34, 1, 11};
		arr = selSort(arr);
		for (int i=0; i<arr.length; i++)
			System.out.printf("%d, ", arr[i]);
		System.out.println();
	}

}
