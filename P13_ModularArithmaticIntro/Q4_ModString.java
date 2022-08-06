package P13_ModularArithmaticIntro;

public class Q4_ModString {
    public int findMod(String A, int B) {
        long ans = 0;
        long mod = B;
        int n = A.length();
        long curr = 1;
        for(int i = n - 1; i >= 0; i--){
            long dig = A.charAt(i) - 48;
            long term = (dig * curr) % mod;
            ans = (ans + term) % mod;
            curr = (curr * 10) % mod;
        }
        return (int)ans;
    }
}
