package P7_2DArrays;

public class Q14_MainDiagonalSum {
    public int solve(final int[][] A) {
        int sum=0;
        for(int i=0;i<A.length;i++){
            int j=i;
            sum+=A[i][j];
        }
        return sum;
    }
}

// You can iterate through all the elements such that their row number equals to their column number i.e i == j, and add each of them to the answer.