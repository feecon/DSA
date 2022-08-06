package P7_2DArrays;

public class Q3_ColumnSum {
    public int[] solve(int[][] A) {
        int [] arr = new int[A[0].length];
        for (int i=0; i<A[0].length; i++) {
            for (int j=0; j<A.length; j++) {
                arr[i] += A[j][i];
            }
        }
        return arr;
    }
}
