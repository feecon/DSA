package Hashing;

import java.util.HashSet;

public class CheckIfDistict {
      //check if all elements are distinct elements
      public static boolean checkDistinct(int ar[]) {
        int n = ar.length;
        HashSet<Integer> map =  new HashSet<>();
        //insert array elements into the hashset
        for (int i = 0; i < n; i++) {
            map.add(ar[i]);
        }
        if(map.size() == n){return true;}
        else {return false;}
    }
    public static void main(String[] args) {
       
        int ar2[] = {1,2,2,4,5,6}; // array containing distict elements
        boolean flag = checkDistinct(ar2);
        System.out.println(flag);
    }
}
