package P11_BitManipulations2;

public class CheckBit {
    
    public static void main(String[] args) {
        int N = 82;
        // int pos = 2;
        // int c = 0;
        for (int pos = 0; pos < 32; pos++) {
            if (((N >> pos) & 1) == 1) {
                System.out.println(pos + " Set Bit");
                // c++;
            } else {
                System.out.println(pos + " Unset Bit");
            }
        }
        // System.out.println(c);
        
    }
}
