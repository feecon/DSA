//import java.util.ArrayList;
class Main {

    public static void sideways(int mat[][]) {

        int n = mat.length;
        int m = mat[0].length;

        // int sumArr[] = new int[n];
        // ArrayList<Integer> list = new ArrayList<>();

        for (int col = 0; col < m; col++) {
            int i = 0, j = col;

            int sum = 0;
            while (i < n && j >= 0) {
                sum = sum + mat[i][j];
                i++;
                j--;
            }

            System.out.print(sum + " ");
        }

        for (int row = 1; row < n; row++) {
            int i = row, j = m - 1;

            int sum = 0;
            while (i < n && j >= 0) {
                sum = sum + mat[i][j];
                i++;
                j--;
            }

            System.out.print(sum + " ");
        }

    }

    public static void main(String[] args) {
        int mat[][] = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        // int n =mat.length;
        // int m =mat[0].length;

        sideways(mat);

    }
}