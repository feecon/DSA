package GeneralPurposePrograms;

import java.util.Scanner;

public class PerfectNum {
    static void checkPerfect(int N) {
        int temp = N;
        int sum = 0;
        for (int i = 1; i <= N/2; i++) {
            if (N%i==0)
                sum = sum + i;           
        }    
        if(sum == temp){System.out.println("YES");} 
        else {System.out.println("NO");}       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            checkPerfect(arr[i]);
        }

    sc.close();
    }
}
