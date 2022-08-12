package ARRAYS;

public class Solution {
    public static int name(String s[]) {
        int n = s.length;
        //int ans =0;
        int c =0;
        for (int i = 0; i < n;) {
            
            for (int j = i+1; j < n; j++) {
                if(s[i] == s[j])
                    c=c+1;
                    
            }
            break;
        }
        
        return c;
    }
    public static void main(String[] args) {
        String str[] = {"ram","ramesh","Ram"};
        System.out.println(name(str));
    }
}
