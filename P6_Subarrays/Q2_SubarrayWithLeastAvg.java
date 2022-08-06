package P6_Subarrays;

public class Q2_SubarrayWithLeastAvg {
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum = 0;
        int index = -1;
        int min = Integer.MAX_VALUE;
        int[] ps = new int[n];
        ps[0] = A[0];
        for(int i = 1; i < n ; i ++) {
            ps[i] = ps[i - 1] + A[i];
        }
        for(int i = 0; i <= n - B; i++) {
            if(i == 0) {
                sum = ps[i + B - 1];
            } else {
                sum = ps[i + B -1] - ps[i - 1];
            }
            if(sum < min) {
                min = sum;
                index = i;
            }
        }
        return index;
    }
}
