package GeneralPurposePrograms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] solve(int ar[], int k){
        int n = ar.length;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            //int freq = hm.getOrDefault(ar[i], 0);
            hm.put(ar[i], i);
        }
        System.out.println(hm);

        // for (int i = 0; i < n; i++) {

        //     int a = ar[i];
        //     int b = k - a;

        //     if(hm.containsKey(b) && a!=b ) {
        //         return new int[]{hm.get(b),hm.get(a)};
        //     }
        //     else if(a==b && hm.get(b) > 1){
        //         return new int[]{hm.get(b),hm.get(a)};
        //     }
    
        // }

        return new int[]{};
    }

    public static void main(String[] args) {
        int ar[] = {4,6};
        int k = -3;
        System.out.println(Arrays.toString(solve(ar,k)));
    }
}
