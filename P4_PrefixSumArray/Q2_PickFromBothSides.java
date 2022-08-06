package P4_PrefixSumArray;

public class Q2_PickFromBothSides {
    public int solve(int[] A, int B) {
        int N = A.length;
        int currentSum = 0;
        for(int i=0; i <B; i++)
            currentSum += A[i];
        int maxSum = currentSum;
        int p1 = B-1, p2 = N-1;

        while(p1>=0 && p2>=0){
            currentSum += A[p2];
            currentSum -= A[p1];
            p2 --;
            p1 --;
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
