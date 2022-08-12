package GeneralPurposePrograms;

import java.util.HashSet;

public class CountDistinctInKfixedLength {
    static void countDisinct(int ar[] , int k){
        int n =ar.length;

        HashSet<Integer> hs = new HashSet<>();
        int s = 0, e = k-1;
        for(int i=0;i<n;i++){           
            for(int j=s; j<= e ; j++){
                hs.add(ar[j]);
            }
            System.out.println(" ["+ s +" "+ e +"] "+ hs.size());
            for(int j=s; j<= e ; j++){
                hs.remove(ar[j]);
            }
            s++ ; e++;                       
        }
    }

    public static void main(String[] args) {
        int ar[] = {2,4,3,8,3,9,4,9,4,10};
        int k = 4;
        
        countDisinct(ar, k);
        
    }
}
