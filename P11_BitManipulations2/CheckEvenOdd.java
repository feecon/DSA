package P11_BitManipulations2;

public class CheckEvenOdd {
    static void evenOdd(int N) {
        if((N|1)== N+1)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        evenOdd(7);
        System.out.println((8^7^8^7^1));
    }
}
