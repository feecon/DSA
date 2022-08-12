package ARRAYS;

public class MinimumPicks {
    public static int differenceEO(int A[]) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            //check if A[i] is even, find max of all evens
            if(A[i]%2==0){
                if(A[i]>max){
                    max = A[i];
                }
            }
            //check if A[i] is odds, find max of all odds
            if(A[i]%2!=0){
                if(A[i]<min){
                    min = A[i];
                }
            } 
        }
        return max-min  ;       
    }
    public static void main(String[] args) {
        int ar[] = {91, 76, 81, 73, 64, 13, -63, 8, 60, 27 };
        System.out.println(differenceEO(ar));
        System.out.println(-97%2);
    }
}
