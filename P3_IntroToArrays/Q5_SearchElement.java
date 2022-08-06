package P3_IntroToArrays;

import java.util.Scanner;

public class Q5_SearchElement {
    public static int search(int arr[], int k){
        int N = arr.length;
        for(int i=0;i<N;i++){
            if(arr[i]==k)
                return 1;
        }
        return 0;        
    }


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 1; i <= TC; i++) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
        int k = sc.nextInt();
        System.out.println(search(arr, k)); 
        }
        sc.close();
    }
}
