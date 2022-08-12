package Hashing;

import java.util.HashSet;

public class CheckIfExistZeroSumSubarray {
   
    public static boolean checkIf(int ar[]) {
        int n = ar.length;
        int ps[] = new int[n];
        ps[0] = ar[0];

        for(int i =1;i<n;i++){
            ps[i] = ps[i-1] + ar[i];
        }

        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if((ps[i] == 0)){
                return true;
            }
            map.add(ps[i]);
        }

        if(map.size()< n){return true;}
        else {return false;}

    }

    public static void main(String[] args) {
        int ar[] = {1,2,3,0,5,6,7,8};
        System.out.println(checkIf(ar));
    }
}
