package IntroductionToProblemSolving;

import java.util.Scanner;

public class Q6_MultiplicationTable {
    public static void printMulTable(int A){
        for(int i=1; i<=10 ; i++)
            System.out.println(A+" * "+i+" = "+A*i);
        
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printMulTable(n);
        
    }
}
