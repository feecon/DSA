package Hashing;

import java.util.HashMap;

public class CountFrequency {
    public static void printFreq(int ar[], int Q[]) {
        int n =ar.length;
        int m = Q.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        //calculating frequency in the Hashmap
        for(int i = 0;i<n;i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i], map.get(ar[i])+1);
            }
            else{
                map.put(ar[i], 1);
            }
        }

        //checking for the queries
        for (int i = 0; i < m; i++) {
            if(map.containsKey(Q[i])){
                System.out.println(map.get(Q[i]));
            }
            else{
                System.out.println(0);
            }
        }
        
    }

    public static void main(String[] args) {
        int ar[] = {1,1,1,1,1,1,1,6,1,9,3,2};
        int Q[] = {2,4,5,1,6};

        printFreq(ar, Q);
    }
}
