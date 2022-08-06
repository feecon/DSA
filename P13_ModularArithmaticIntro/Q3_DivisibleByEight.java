package P13_ModularArithmaticIntro;

public class Q3_DivisibleByEight {
    public int solve(String A) {
        int n = A.length();
        if (n == 1){
            if((A.charAt(0) - '0') % 8 == 0){
                return 1;
            }
            return 0;
        }
        if (n == 2) {
            int x = (A.charAt(0) - '0') * 10 + A.charAt(1) - '0';
            if(x % 8 == 0){
                return 1;
            }
            return 0;
        }
        int a3 = (A.charAt(n-3) - '0') * 100 + (A.charAt(n-2) - '0') * 10 + (A.charAt(n-1) - '0');
        if(a3 % 8 == 0){
            return 1;
        }
        return 0;
    }
}
