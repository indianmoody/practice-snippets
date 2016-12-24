package mini3;

public class RecursiveMultiply {
	
	public static int product(int a, int b) {
		int n = 1, count = 0, min, max, ans;
		max = (a > b) ? a : b;
		min = (a > b) ? b : a;
		
		while (n <= min) {
			n = n<<1;
			count++;
		}
		
		count--;
		n = n>>1;
		
		ans = max<<count;
		for (int i=0; i<(min-n); i++) {
			ans += max;
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(product(21, 7));

	}

}
