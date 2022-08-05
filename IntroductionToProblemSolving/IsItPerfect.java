package IntroductionToProblemSolving;

import java.util.Scanner;

public class IsItPerfect {
    public static void checkPerfectNumber(int A){
        int temp = A;
        int sum = 0;
        for(int i =1; i<=A/2 ; i++){
            if(A%i == 0)
                sum +=i;
        }
        if(sum == temp) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i = 0; i<N ; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i<N ; i++)
            checkPerfectNumber(arr[i]);
        
    }
}
