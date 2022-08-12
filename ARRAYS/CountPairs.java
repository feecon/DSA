package ARRAYS;

public class CountPairs {
   public static int pairs(String s){
        int n = s.length();
        int count = 0, ans = 0;
        for (int i = n-1; i >=0; i--) {
            if(s.charAt(i) == 'G'){count++;}    
            else if(s.charAt(i)=='A'){
                ans = ans + count;
                int mod = (int)Math.pow(10,9)+7;
                ans = ans%mod;
            }                   
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "GUGPUAGAF";
        //char ch[] = str.toCharArray();
        System.out.println(pairs(str));
    }
}
