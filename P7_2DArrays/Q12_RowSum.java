package P7_2DArrays;

public class Q12_RowSum {
    public int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] B = new int[n];

        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<m;j++){
                sum = sum + A[i][j];
            }
            B[i] = sum;
        }
        return B;
    }
}
