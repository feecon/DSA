package P6_Subarrays;

import java.util.ArrayList;

public class Q6_AlternatingSubarrays {
    public int[] solve(int[] A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                A[i] = -1;
            }
        }
        for (int i = B; i < A.length - B; i++) {
            if (isAlt(A,i,B)) {
                arr.add(i);
            }
        }

        int[] result = new int[arr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr.get(i);
        }
        return result;
    }

    public static boolean isAlt(int[] A, int i, int B) {
        int prev = A[i];
        int left = i - 1;
        int right = i + 1;
        while (left >= i - B) {
            if (A[left] == -prev && A[left] == A[right]) {
                prev = A[left];
                left--;
                right++;
            } else {
                return false;
            }
        }
        return true;
    }
}
