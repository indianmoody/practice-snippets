public class BitMultiply {
    
    public static int multi(int a, int b) {
        int sol;
        if (a < b) {
            int x = 2, y = 0;
            sol = b;
            
            while (x <= a) {
                sol = sol << 1;
                y = x;
                x = x << 1;
            }
            
            for (int i=0; i<a-y; i++) {
                sol += b;
            }
        }
        else {
            int x = 2, y = 0;
            sol = a;
            
            while (x <= b) {
                sol = sol << 1;
                y = x;
                x = x << 1;
            }
            
            for (int i=0; i<b-y; i++) {
                sol += a;
            }
        }
        return sol;
    }
    
    public static void main(String []args) {
        int a, b;
        a = 5;
        b = 3;
        System.out.println(multi(a, b));
    }
}