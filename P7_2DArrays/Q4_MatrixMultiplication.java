package P7_2DArrays;

public class Q4_MatrixMultiplication {
    public int[][] solve(int[][] A, int[][] B) {
        int M = A.length;
        int N = A[0].length;
        int P = B[0].length;
    
        int[][] C = new int[M][P];
    
        for (int i = 0; i < M;i++){
            for (int j = 0; j < P;j++){
                C[i][j] = 0;
            }
        }
    
        for (int i = 0; i < M;i++){
            for (int j = 0; j < P;j++){
                for (int k = 0; k < N;k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    
        return C;
    }
}
