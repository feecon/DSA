package ARRAYS;

import java.util.Arrays;

public class PrefixSumArray {

    //Building the pefix sum array
    public static int[] pSum(int ar[]) {

        int n = ar.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = ar[0]; //first element is same as first ele of ar

        for(int i =1; i<n ;i++)
            prefixSum[i] =  prefixSum[i-1] + ar[i];
        
        return prefixSum;
    }

    //Range sum from L to R using prefix sum array
    public static int rangeSum(int arr[], int L, int R) {
        int sum = 0;
        int prefixSum[] = pSum(arr); //initialisation of prefix sum array

        if(L==0)
            sum = prefixSum[R];
        else 
            sum = prefixSum[R] - prefixSum[L-1];

        return sum;        
    }

    //Equilibrium Index - if left range sum == right left range sum, then ith index is equilibrium index... left range sum(0,i-1) and right range sum(i+1 , n-1)
    public static int[] equilibrium(int arr[]) {
        int leftSum =0, rightSum = 0;
        int n = arr.length;
        int c =0;
        int prefixSum[] = pSum(arr);
        int index[] = new int[n];

        for(int i =0; i<n; i++){
            if(i>0){
                leftSum = prefixSum[i-1];
            }
            rightSum = prefixSum[n-1] - prefixSum[i];
    
            if(leftSum == rightSum){
                index[i] = i;
                c++; 
            }                         
        }
        System.out.println("Count --> "+c);     
        return index;           
    }

    public static void main(String[] args) {
        int arr[] ={-7,1,5,2,-4,3,0};
        System.out.println("Array --> "+Arrays.toString(arr));
       //System.out.println("Prefix array --> "+Arrays.toString(pSum(arr)));
       //System.out.println("Sum --> "+rangeSum(arr,1, 3));
       System.out.println("Equilibrium indices are --> "+Arrays.toString(equilibrium(arr)));
    }
}
