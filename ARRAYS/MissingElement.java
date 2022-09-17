package ARRAYS;

import java.util.Arrays;

public class MissingElement {
    static int missingEle(int ar[]) {
        int N = ar.length;
        Arrays.sort(ar);

        for (int i = 0; i < N; i++) {
            int j = 1;
            if (ar[i] > 1) {
                if (ar[i] == j) {
                    return j;
                }
            }
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[] = { -5, -3, 1, 2, 8, 10 };
        System.out.println(missingEle(ar));
    }
}
