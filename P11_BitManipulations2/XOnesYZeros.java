package P11_BitManipulations2;

public class XOnesYZeros {

    static int xyOnesZeroes(int x, int y) {

        return (((1<<x)-1)<<y);
    }
    public static void main(String[] args) {
        System.out.println(xyOnesZeroes(2, 3));
        // System.out.println((10<<3));
    }
}
