package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class CountElements {
    public static int[] count(int ar[]){

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> list = new  ArrayList<>();

        for(int i=0;i<ar.length;i++){
            int freq = map.getOrDefault(ar[i], 0);
            map.put(ar[i],freq+1);
        }
        System.out.println(map);
        list.add(map.size());

        //for each loop using Entry and entrySet()

        for(Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" --> " + entry.getValue());
        }

        return ar;
    }

    public static void main(String[] args) {
        int ar[] = {2,6,7,6,12,6,3,2};
        count(ar);
    }
}
