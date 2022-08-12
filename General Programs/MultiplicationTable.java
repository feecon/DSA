import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplicationTable(int N) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = " + N*i);
        }       
        
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        multiplicationTable(num);
    } 
}
