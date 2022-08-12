package Hashing;

import java.util.HashSet;

public class CountDistinct {

    //count the disctict elements, means count occurence for one time
    public static int countDistinct(int ar[]) {
        int n = ar.length;
        HashSet<Integer> map = new HashSet<>();
        //insert array elements into the hashset
        for (int i = 0; i < n; i++) {
            map.add(ar[i]);
        }
        return map.size();
    }

    public static void main(String[] args) {
        int ar[] = {1,1,2,3,2,8,2,1};
        System.out.println(countDistinct(ar));

    }
}

//Hashset add no duplicate elements, it only adds for the first occurence of the element