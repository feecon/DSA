package ARRAYS;

import java.util.Arrays;

public class RotateKTimes {
    // int arr1[]={1,2,3,4,5}; // 5,1,2,3,4 // 4,5,1,2,3
    // int arr2[]={0,5,1,7}; // 7%5=2
    // k=2,n=5
    // reverse arr1 0 to n-1 = {5,4,3,2,1}
    // reverse from 0 to k-1 {4,5,3,2,1}
    // reverse from k to n-1 {4,5,1,2,3}
    // reversing an array
    public static int[] reversepart(int arr[], int l, int r) {
        int lp = l;
        int rp = r;
        while (lp < rp) {
            int t = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = t;
            lp++;
            rp--;
        }
        return arr;
    }

    public static int[] rotate(int[] ar, int k) {

        int n = ar.length;
        reversepart(ar, 0, n - 1);
        reversepart(ar, 0, k - 1);
        reversepart(ar, k, n - 1);
        return ar;

    }

    public static void main(String[] args) {
        int ar[] = { 1, 7, 8, 5, 3 };
        System.out.println("Original Array-->" + Arrays.toString(ar));
        // System.out.println(Arrays.toString(reversepart(arr1,3,6)));
        int B[] = { 0, 5, 1, 7 };
        int n = ar.length;
        int m = B.length;
        int[] temp = new int[n];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = ar[i];
        }
        for (int i = 0; i < m; i++) {
            B[i] %= n;
            System.out.println(Arrays.toString(rotate(ar, B[i])));
            // System.out.println();
            for (int j = 0; j < ar.length; j++) {
                ar[j] = temp[j];
            }
        }
    }
}
