package GeneralPurposePrograms;

import java.util.HashMap;

public class TwoSum {
    static boolean solve(int ar[], int k){

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            int freq = hm.getOrDefault(ar[i], 0);
            hm.put(ar[i],freq+1);
        }
        for (int i = 0; i < ar.length; i++) {

            int a = ar[i];
            int b = k - a;

            if(hm.containsKey(b) && a!=b ) {
                return true;
            }
            else if(a==b && hm.get(b) > 1){
                return true;
            }
    
        }

        return false;
    }

    public static void main(String[] args) {
        int ar[] = {8,7,2,3,-4,-1,2,3,8};
        int k = 16;
        System.out.println(solve(ar,k));
    }
}
