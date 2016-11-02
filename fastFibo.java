
// fast implementation of fibonacci series

public class fastFibo {
	
	public static int[] fibo(int x) {
		int[] ans = new int[2];
		if (x <= 1) {
			ans[0] = 1; ans[1] = 0;
		}
		else {
			int[] temp = fibo(x-1);
			ans[0] = temp[0] + temp[1]; ans[1] = temp[0];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(12)[0]);

	}

}
