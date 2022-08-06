package P7_2DArrays;

public class Q11_MinorDiagonalSum {
    public int solve(final int[][] A) {
        int sum =0;
        for(int i = 0; i<A.length; i++){
            sum = sum + A[i][A.length-i-1];
        }
        return sum;
    }
}
