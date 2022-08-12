package GeneralPurposePrograms;

import java.util.Scanner;

/**
 * IsItPrimeNumber
 */
public class IsItPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        isPrime(A);

        sc.close();
    }
    public static void isPrime(int A) {
        int count = 0;
        for (int i = 2; i <= A; i++) {
            if(A % i == 0){
                count ++;
            }           
        }
        if (A == 1) {
            System.out.println("YES");
        } else {
            if (count ==1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }

   
}