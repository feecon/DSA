package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class CountDistinctElementsInFixedK {
    static int[] count(int ar[], int k) {
        int n = ar.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Intitialising the first k elements in to the hashmap
        for (int i = 0; i < k; i++) {
            int freq = hm.getOrDefault(ar[i], 0);
            hm.put(ar[i], freq + 1);
        }
        int dis[] = new int[n-k+1];
        dis[0] = hm.size();
        // System.out.println(hm.size());
        // return hm.values().toArray();

        // till the end of the loop we have to add remove the prev elements and add the
        // next element in to the hm

        int s = 1, e = k;
        while (e < n) {

            // REMOVING
            // if the frequency of ar[s-1] is not 0, decrease the frequency by 1
            hm.put(ar[s - 1], hm.get(ar[s - 1]) - 1);

            // if the frequency of ar[s-1] is 0 then we remove it from the hm
            if (hm.get(ar[s - 1]) == 0) {
                hm.remove(ar[s - 1]);
            }

            // ADDING
            // if the key ar[e] is already present then increase the count by 1
            if (hm.containsKey(ar[e])) {
                hm.put(ar[e], hm.get(ar[e]) + 1);
            } else {
                hm.put(ar[e], 1); // if its a new element just insert and initialise frequency with 1
            }
            dis[s] = hm.size();
            s++;
            e++;
            
        }
        return dis;
    }

    public static void main(String[] args) {
        int ar[] = { 2, 4, 3, 8, 3, 9, 4, 9, 4, 10 };
        int k = 4;
        System.out.println(Arrays.toString(count(ar, k)));
        
    }
}
