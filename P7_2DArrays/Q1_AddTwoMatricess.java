package P7_2DArrays;

public class Q1_AddTwoMatricess {
    public int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m =A[0].length;

        int[][] sum = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum[i][j] = A[i][j] + B[i][j];
            }

        }
        return sum;
    }
}
