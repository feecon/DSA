package ARRAYS;

public class RorateMatrix {
    public static void solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // swap the array element
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[0].length - 1 - j];
                A[i][A[0].length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2 },
                { 3, 4 }
        };

        solve(arr);
    }
}
