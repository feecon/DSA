package GeneralPurposePrograms;

import java.util.HashSet;

public class TwoSum2 {
    static boolean twoSum(int ar[], int k){

        int n =ar.length;
        HashSet<Integer> hs = new HashSet<>();

        for (int i=0; i<n; i++) {

            int a = ar[i], b = k-a;
            if(hs.contains(b)){
                return true;
            }
            hs.add(a);
        }
        return false;
    }

    public static void main(String[] args) {
        int ar[] = {7,2,3,-4,-1,2,3,8};
        int k = 16;
        System.out.println(twoSum(ar,k));
    }
}
