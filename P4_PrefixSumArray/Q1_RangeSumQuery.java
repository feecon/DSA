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
		
		int tC = B.length;
		long[] sum = new long[tC];
		for(int i =0; i<tC;i++){
            int left = B[i][0] - 1; // index - 1 - 1(previous pos)
			int right = B[i][1] - 1;
			if (left-1 >= 0)
				sum[i] = ps[right] - ps[left - 1];
			else
				sum[i] = ps[right];
        }
		return sum;
	}
}
