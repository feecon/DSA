/*
 * NOBEL INTEGER - an element is said to be a nobel integer if the number of elements
 * less than is the number itself.
 *  array - [-1,-5,3,5,-10,4]
 * # elements less than -1 = 2, 2 is not equals to -1 , hence -1 is not couted as nobel integer
 * # elements less than 3 = 3, since 3 is equals to the number itsel , its a nobel integer
 * 
 * Find out how many nobel integers are there in the array?
 * 
 */

package ARRAYS;

import java.util.Arrays;

public class NobelInteger {
   static int nobel(Integer ar[]){
        int n = ar.length;
        int c=0;
        Arrays.sort(ar);
        for (int i = 0; i < n; i++) {
            if(ar[i]==i){c++;}
        }
        return c;
    }
    public static void main(String[] args) {
        Integer ar[] = {-1,-5,3,5,-10,4};
        System.out.println(nobel(ar));
    }
}
