package P11_BitManipulations2;
/*
 * if pos bit is set, make it unset and update N
 * if pos bit is unset, make it set and update N
 */

public class FlipAndUpdate {
    static int flipBits(int N, int pos) {
        if (((N >> pos) & 1) == 0) {
            //set the pos bit ans update N
            N = N + (1 << pos); //adddition (1<<pos) to N
            return N;
        }
        return N - (1<<pos); //subsctraction of (1<<pos) from N
    }
    
    public static void main(String[] args) {
        System.out.println(flipBits(10, 1));
    }
}
