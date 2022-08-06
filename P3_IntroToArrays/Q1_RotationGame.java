package P3_IntroToArrays;

import java.util.Scanner;

public class Q1_RotationGame {
    public static void reversePart(int arr[], int s , int e) {
        int p1 =s , p2 = e;
        //swap the array element
        while(p1<p2){
            int temp =  arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;   
        }          
    }

    public static int[] rotateKTimes(int arr[], int k, int N){
        k = k % N;
        reversePart(arr,0,N-1);
        reversePart(arr,0,k-1);
        reversePart(arr,k,N-1);

        return arr;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();        
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateKTimes(arr,k,N);
        for(int i=0;i<N;i++)
         System.out.print(arr[i]+" ");
        
         sc.close();
    }
}
