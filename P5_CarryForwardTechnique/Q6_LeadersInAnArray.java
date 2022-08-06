package P5_CarryForwardTechnique;

public class Q6_LeadersInAnArray {
    public int[] solve(int[] A) {

        int n = A.length;
        int max = A[n - 1];
        int c = 1;
        int maxn = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > max) {
                max = A[i];
                c++;
            }
        }

        int[] res = new int[c];
        res[c - 1] = A[n - 1];
        int o = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > maxn) {
                maxn = A[i];
                res[o] = maxn;
                o++;
            }
        }
        return res;
    }
}
