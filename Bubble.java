// practice bubble sort

public class Bubble {

	public static int[] bubSort(int[] arr) {
		for (int i=arr.length-1; i>=0; i--) {
			for (int j=0; j<i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 31, 12, 23, 105, 64, 1, 0};
		arr = bubSort(arr);
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d, ", arr[i]);
		}

	}

}
