package ARRAYS;

import java.util.Arrays;

public class SpecialIndex {
   
        //method to create prefix odd sum array
        public static int[] prefixOdd(int ar[]){
            int n = ar.length;
            int prefixOdd[] = new int[n];
            prefixOdd[0] = 0;
            for(int i =1; i<n; i++){
                if(i%2==1){
                    prefixOdd[i] = prefixOdd[i-1] + ar[i];
                }else{
                    prefixOdd[i] = prefixOdd[i-1];
                }
            }
            return prefixOdd;
        }
        //method to create prefix even sum array
        public static int[] prefixEven(int ar[]){
            int n = ar.length;
            int prefixEven[] = new int[n];
            prefixEven[0] = ar[0];
            for(int i =1; i<n; i++){
                if(i%2==0){
                    prefixEven[i] = prefixEven[i-1] + ar[i];
                }else{
                    prefixEven[i] = prefixEven[i-1];
                }
            }
            return prefixEven;
        }
        //count the special indices
        public static int specialIndex(int[] A) {
            int n = A.length;
            int prefixEven[] = prefixEven(A);  
            int prefixOdd[] = prefixOdd(A);
            int count = 0;
    
            for(int i=0;i<n;i++){
                int sumOfEvens = prefixOdd[n-1] - prefixOdd[i];
                if(i!=0){
                    sumOfEvens += prefixEven[i-1];
                }
                 int sumOfOdds = prefixEven[n-1] - prefixEven[i];
                 if(i!=0){
                     sumOfOdds += prefixOdd[i-1];
                 }
                 if(sumOfEvens == sumOfOdds){
                     count ++;
                 }
            }
            return count;
        }

        public static void main(String[] args) {
            int arr[] = {1,1,1};
            System.out.println(" Original Array --> "+Arrays.toString(arr));
            System.out.println(" Prefix Odd sum Array --> "+Arrays.toString(prefixOdd(arr)));
            System.out.println(" Prefix Even sum Array --> "+Arrays.toString(prefixEven(arr)));
            System.out.println(" Special indices are --> "+specialIndex(arr));
        }
    
    
}
