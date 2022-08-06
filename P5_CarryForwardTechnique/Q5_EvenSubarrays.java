package P5_CarryForwardTechnique;

public class Q5_EvenSubarrays {
    public String solve(int[] A) {
        int n = A.length;
        if (n % 2 == 0 && A[0] % 2 == 0 && A[n - 1] % 2 == 0)
            return "YES";
        else
            return "NO";
    }
}
