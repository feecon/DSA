package P7_2DArrays;

public class Q6_MatrixTranspose {
    public int[][] solve(int[][] A) {
        int n= A.length;
        int m=A[0].length;
        int[][] trans = new int[m][n];
        //transpose matrix usin extra space
        for(int i =0;i<m;i++){
            for(int j = 0 ; j<n ; j++){
            trans[i][j] = A[j][i];
                
            }
        }
        return trans;
    }
}
