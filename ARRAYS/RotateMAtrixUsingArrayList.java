package ARRAYS;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;

public class RotateMAtrixUsingArrayList {
    public static void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int m = a.get(0).size();
        
        //transpose the matrix a 
        for(int i =0; i<n ; i++){
            for(int j = i+1 ; j <m ; j++){
                //swap the i and j elements
                Collections.swap(a,i,j);
            }
        }
        //reversing the rows 
        for(int i =0; i<n ; i++){
            for(int j =0 ; j <m/2 ; j++){
                //swap the i and m-1 -j elements
                Collections.swap(a.get(i),i,m-1-j);
            }
        }
	}
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.get(1).add(1);
        list.get(1).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(1).add(5);

        rotate(list);
    }
}
