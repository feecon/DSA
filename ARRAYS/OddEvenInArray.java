package ARRAYS;

import java.util.Arrays;

public class OddEvenInArray {
    public static void oddEven(int ar[]) {
        int n = ar.length;
        int o[] = new int [n];
        int e[] = new int[n];

        for(int i= 0 ; i<n;i++){
            if(ar[i]%2==0){
                e[i] = ar[i];
            }else{
                o[i] = ar[i];
            }
        }
        System.out.println("Even numbers are--> "+Arrays.toString(e));
        System.out.println("Odd numbers are--> "+Arrays.toString(o));       
    }

    public static void main(String[] args) {
        int arr[] = {2,1,-23,11,10,16};
        oddEven(arr);
    }
}
