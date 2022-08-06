package P6_Subarrays;

public class Q3_MaximumSubarray {
    public int maxSubarray(int A, int B, int[] C) {
        int ans = Integer.MIN_VALUE;
        int curr_sum = 0;
        int j=0;
        for(int i=0; i<A; i++) {
            curr_sum += C[i];
            if(curr_sum > B) {
                while(curr_sum > B) {
                    curr_sum = curr_sum - C[j];
                    j++;
                }
            }
            if(curr_sum <= B)
                ans = Math.max(ans, curr_sum);
        }
        return (ans == Integer.MIN_VALUE)? 0 : ans;
    }
}
