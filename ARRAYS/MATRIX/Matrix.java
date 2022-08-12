package ARRAYS.MATRIX;

public class Matrix {

    static void rowSum(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        // printing sum row wise
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // col changes while sum
            for (int j = 0; j < m; j++) {
                sum = sum + mat[i][j];
            }
            System.out.println(sum);
            
        }

    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1,   2,  3,  4,  5 },
                { 6,   7,  8,  9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 },
        };

        rowSum(mat);
    }
}
