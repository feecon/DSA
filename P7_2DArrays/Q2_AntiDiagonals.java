package P7_2DArrays;

import java.util.ArrayList;

public class Q2_AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();   //Number of row or columns of square matrix
        int total = 2 * N - 1;  //Total number of anti-diagonals
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(N);

        //Initializing all cells to 0
        for (int i = 0; i < total; i++) {
            res.add(new ArrayList<Integer>(N));
            for (int j = 0; j < N; j++) {
                res.get(i).add(0);
            }
        }

        for (int i = 0; i < total; i++) {
            if (i < N) {    //Anti-digonals starting from first row
                int x = 0, y = i;

                while (x < N && y >= 0) {
                    int cellValue = A.get(x).get(y);
                    res.get(i).set(x, cellValue);
                    x++;
                    y--;
                }
            }
            else {  //Anti-diagonals starting from last column
                int x = i - N + 1, y = N - 1;

                while (x < N && y >= 0) {
                    int cellValue = A.get(x).get(y);
                    res.get(i).set(N - i + x - 1, cellValue);
                    x++;
                    y--;
                }
            }
        }

        return res;
    }
}


// Let’s look at how the coordinates change when you move from one element to the other in the anti-diagonal.
// With every movement, the row increases by one, and the column decreases by one ( or in other words, (1, -1) gets added to the current coordinates).
// Now, all we need to know is the start ( or the first element ) in each diagonal.
// Can you figure out which elements qualify as the first elements in each diagonal?