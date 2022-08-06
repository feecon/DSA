package P7_2DArrays;

public class Q10_MatrixScalerproduct {
    public int[][] solve(int[][] A, int B) {
        int row = A.length, col = A[0].length;
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                A[i][j] *= B;
        return A;
    }
}


// Run a outer loop from i = 1  to i = row,
// Run a inner loop from j = 1  to j = col,
// Do A[i][j]*B for all elements,
// return the updated matrix.