package Hashing;

import java.util.HashMap;

public class FirstNonRepeatingElement {
    
    //finding the first non repeating number
    public static int firstNonRepeatingElement(int[] ar){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int freq = map.getOrDefault(ar[i], 0);
            map.put(ar[i], freq+1);
        }

        for (int i = 0; i < ar.length; i++) {
            if(map.get(ar[i])==1){
                return ar[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int ar[] = {1,2,1,8,1,1};
       System.out.println(firstNonRepeatingElement(ar));
        
       

    }
}
