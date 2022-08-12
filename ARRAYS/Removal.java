package ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class Removal {
    static int minCost(Integer ar[]){
        int n = ar.length;
        //Arrays.sort(ar);
       
        Arrays.sort(ar, Collections.reverseOrder());
       // System.out.println(Arrays.toString(ar));
        int sum =0;
        for(int i =0;i<n;i++){
            sum = sum + ar[i]*(i+1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Integer ar[] = {3,6,2,4};
        System.out.println(minCost(ar));
    }
}
