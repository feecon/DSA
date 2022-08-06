package P6_Subarrays;

public class Q4_CountingSubarrays {
    public int solve(int[] A, int B) {
        int n = A.length;
        int ps[] = new int[n];
        int sum = 0;
        ps[0] = A[0];
        int count = 0;
        for(int i = 1;i<n;i++){
            ps[i] = ps[i-1] + A[i];
        }
        for(int i = 0;i<n;i++){
            for(int j =i;j<n;j++){
                if (i==0){
                    sum = ps[j];
                }
                else{
                    sum = ps[j]-ps[i-1];
                }
                if(sum<B){
                    count++;
                }
            }
        }
        return count;
    }
}
