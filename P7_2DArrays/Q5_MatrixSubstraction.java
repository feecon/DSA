package P7_2DArrays;

public class Q5_MatrixSubstraction {
    public int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m =A[0].length;

        int[][] sub = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sub[i][j] = A[i][j] - B[i][j];
            }
        }
        return sub;
    }
}
