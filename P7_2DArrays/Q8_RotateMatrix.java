package P7_2DArrays;

public class Q8_RotateMatrix {
    public void solve(int[][] A) {
        int n= A.length;
        int m=A[0].length;
        //transpose matrix
        for(int i =0;i<n;i++){
            for(int j = i+1 ; j<m ; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        //reversing the rows 
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < m/ 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][m- 1 - j];
                A[i][m - 1 - j] = temp;
            }
        }
     
    }
}
