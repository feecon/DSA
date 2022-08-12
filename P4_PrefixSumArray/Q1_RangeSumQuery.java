package P4_PrefixSumArray;

public class Q1_RangeSumQuery {
    public long[] rangeSum(int[] A, int[][] B) {
		int n = A.length;
        
        //Building Prefix sum
		long[] ps = new long[n];
		ps[0] = A[0];
		for (int i = 1; i<n; i++) {
			ps[i] = ps[i - 1] + A[i];
		}
		
		int M = B.length;                                                  
		long[] sum = new long[M];
		for(int i =0; i<M;i++){
            int L = B[i][0] - 1; // index - 1 - 1(previous pos)
			int R = B[i][1] - 1;
			if (L-1 >= 0)
				sum[i] = ps[R] - ps[L - 1];
			else
				sum[i] = ps[R];
        }
		return sum;
	}
}
