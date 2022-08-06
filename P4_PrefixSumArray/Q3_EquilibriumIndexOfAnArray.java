package P4_PrefixSumArray;

public class Q3_EquilibriumIndexOfAnArray {
     //Building prefix sum array
     public static int[] pSum(int[] A){
        int n = A.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = A[0];

        for(int i =1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + A[i];
        }
        return prefixSum;
    }
    //Equilibrium index, when left range sum(from 0 to i-1) == right range sum(from i+1 to n-1)
    public int solve(int[] A) {
        int leftRangeSum =0, rightRangeSum = 0;
        int n = A.length;
        int prefixSum[] = pSum(A);

        for(int i =0; i<n; i++){
            if(i>0){
                leftRangeSum = prefixSum[i-1];
            }
            rightRangeSum = prefixSum[n-1] - prefixSum[i];
    
            if(leftRangeSum == rightRangeSum)
                return i;           
        }     
    return -1;  
    }     
}
