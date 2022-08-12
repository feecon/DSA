package ARRAYS;

import java.util.Arrays;

public class Main {
    static int[] function(int ar[]){
        int n = ar.length;
        int temp[] = new int[n];

        int c=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<ar[i];j++){
                if(ar[i]%j == 0)
                    c++;
            }
            temp[i] = c;
        }
        return temp;
    }

    public static void main(String[] args) {
        int ar[] ={1,2,3,7,4,9,6};
        System.err.println(Arrays.toString(ar));
        System.err.println(Arrays.toString(function(ar)));
    }
}
