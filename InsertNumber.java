class InsertNumber {
  
  public static int insertNumber(int n, int m, int i, int j) {
    int nTemp = 0;
    for (int x=i; x<=j; x++) {
      nTemp = nTemp | (1<<x);
    }
    int mTemp = ~nTemp;
    
    n = n | nTemp;
    m = m<<i;
    m = m | mTemp;
    
    n = n & m;
    
    return n;
  }
  
  public static void main(String[] args) {
    
    int ans = insertNumber(1024, 19, 2, 6);
    System.out.println(Integer.toBinaryString(ans));
  }
}