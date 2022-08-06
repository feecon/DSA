package P3_IntroToArrays;

public class Q2_GoodPair {
    public int solve(int[] A, int B) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(A[i] + A[j] == B)
                    return 1;                
            }
        }
        return 0; 
    }
}
