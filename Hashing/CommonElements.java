package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommonElements {
    public static ArrayList<Integer> printCommon(int A[], int B[]) {
        

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<A.length;i++){
            int freq = map.getOrDefault(A[i], 0);
            map.put(A[i],freq+1);
        }

        System.out.println("Hashmap: "+map);

        //int temp[] = new int[m];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < B.length; i++) {
            
            if(map.containsKey(B[i])){ 
                list.add(B[i]);
                map.put(B[i],map.get(B[i])-1);
                if(map.get(B[i])==0){
                    map.remove(B[i]);
                }

            }
        }

        return list;
    }

    public static void main(String[] args){
        // ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(2,1,4,10));
        // ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(10,10,10));
        //int ar2[] = {};
        int ar[] = {2,1,4,10};
        int ar2[] = {1,3,10,10};

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));

       System.out.println(printCommon(ar, ar2));
        

        


    }
}
