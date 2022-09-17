package P11_BitManipulations2;

public class FindUniqu {

    static int FindUnique(int A[]) {
        int N = A.length;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans ^= A[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int ar[] = { 4, 8, 5, 2, 4, 2, 8 };
        System.out.println(FindUnique(ar));
    }
}
