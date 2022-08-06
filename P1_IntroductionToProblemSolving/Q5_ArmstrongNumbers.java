package P1_IntroductionToProblemSolving;

import java.util.Scanner;

public class Q5_ArmstrongNumbers {
    public static void armstrong(int N){
        for(int i =1; i<= N ; i++){
            int sum = 0;
            int value = i ;
            while(value>0){
                int lastDigit = value%10;
                sum += (lastDigit*lastDigit*lastDigit);
                value /= 10;
            }
            if(sum == i)
                System.out.println(sum);
        }
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrong(n);

        sc.close();
    }
}
