package ARRAYS;

import java.util.Arrays;

public  class ReverseArray {
    public static void reverseArray(int arr[]) {
        int p1 =0 , p2 = arr.length-1;
        //swap the array element
        while(p1<p2){
            int temp =  arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;   
        }          
    }

    public static void main(String[] args) {
        int arr[] = {4,9,2,-2,12,10};
        //before reversed

        System.out.println(Arrays.toString(arr));

        reverseArray(arr); //calling reverse method
        //after reversed
        System.out.println(Arrays.toString(arr));
    }
}
