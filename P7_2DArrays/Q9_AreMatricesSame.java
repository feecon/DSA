package P7_2DArrays;

public class Q9_AreMatricesSame {
    public int solve(int[][] A, int[][] B) {
        for (int i=0; i<A.length; i++) {
         for (int j=0; j<A[0].length; j++) {
             if (A[i][j] != B[i][j]) {
                 return 0;
             }
         }
     }
     return 1;
 }
}

// Here run an outer loop for i = 0 to i = row,
// and inner loop from j = 0 to j = col,
// and return 0 if any A[i][j] != B[i][j]
// otherwise return 1 at the end of the loop.
