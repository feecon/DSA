package P5_CarryForwardTechnique;

public class Q1_SpecialSubsequencesAG {
    public int solve(String A) {
        int n =A.length();
            int count = 0, ans = 0;
            for (int i = n-1; i >=0; i--) {
                if(A.charAt(i) == 'G'){count++;}    
                else if(A.charAt(i)=='A'){ans = ans + count;
                int mod = (int) (Math.pow(10,9) + 7); 
                ans = ans%mod;   
                }               
            }
            //int mod = (int) (Math.pow(10,9) + 7);
            return ans;
        }
}
