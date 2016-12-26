// find next smallest and largest numbers with exactly same 1s

class NextNumber {
  
  // next smallest number with same no of 1s
  public static int nextSmallest(int n) {
    
    if (n == 0) {
      return 0;
    }
    
    int ans = n;
    int x0 = 0, x1 = 0;
    
    while (n%2 == 0) {
      x1++;
      n = n/2;
    }    
    while (n%2 == 1) {
      x1++;
      n = n/2;
    }
    
    x0 = x1;
    x1 = x1 - 1;
    
    ans = ans | (1<<x0);
    ans = ans & (~(1<<x1));
    
    return ans;
    
  }
  
  // next largest number with same no of 1s
  public static int nextLargest(int n) {
    if (n == 0) {
      return 0;
    }
    
    int ans = n;
    int x0 = 0, x1 = 0;
    
    while (n%2 == 1) {
      x0++;
      n = n/2;
    }
    
    while (n%2 == 0) {
      x0++;
      n = n/2;
    }
    
    x1 = x0;
    x0 = x0 - 1;
    
    ans = ans | (1<<x0);
    ans = ans & (~(1<<x1));
    
    return ans;
  }
  
  public static void main(String[] args) {
    int n = 27;
    System.out.printf("number n: %d, binary: %s\n", n,  Integer.toBinaryString(n));
    System.out.printf("nextSmallest: %d, binary: %s\n", nextSmallest(27), Integer.toBinaryString(nextSmallest(n)));
	System.out.printf("nextLargest: %d, binary: %s\n", nextLargest(27), Integer.toBinaryString(nextLargest(n)));
  }
}