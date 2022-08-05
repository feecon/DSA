import java.util.Scanner;

public class SumOfNumbers {
    public static void sumOfNaturalNumbers(int N) {
        int sum =0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println(sum);      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOfNaturalNumbers(num);
    }
    
}
