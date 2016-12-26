class ChangeBit {
  
  public static int getBit(int n, int i) {
    return ((n & (1<<i)) == 0) ? 0 : 1;
  }
  
  public static int setBit(int n, int i) {
    return n | (1<<i);
  }
  
  public static int clearBit(int n, int i) {
    return n & ~(1<<i);
  }
  
  public static int updateBit(int n, int i, int v) {
    n = clearBit(n, i);
    return (v==0) ? n : setBit(n, i);
  }
  
  public static void main(String[] args) {
    System.out.println(getBit(5, 0));
    System.out.println(setBit(5, 1));
    System.out.println(clearBit(5, 0));
    System.out.println(updateBit(5, 0, 0));
  }
}