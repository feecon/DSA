package P3_IntroToArrays;

import java.util.Scanner;

public class Q3_MinMaxInArray {
    public static void printMaxMinInArray(int arr[]){
        int N = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<N;i++){
            if(max<arr[i])
                max = arr[i];
            if(min>arr[i])
                min = arr[i];
        }
        System.out.print(max+" "+min);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<N;i++)
            arr[i] = sc.nextInt();

        printMaxMinInArray(arr);

        sc.close();

        
    }
}
