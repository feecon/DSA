package P3_IntroToArrays;

public class Q8_MinimumPicks {
    public int solve(int[] A) {
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
            //check if A[i] is odd, find min of all odds
            if(A[i]%2!=0){
                if(A[i]<min){
                    min = A[i];
                }
            } 
        }
        return max-min  ;       
    }
}
