package P5_CarryForwardTechnique;

public class Q4_AmazingSubarrays {
    public int solve(String A) {
        int finalAns=0;
        int n=A.length();
        for(int i=0; i<n;i++){
            if((A.charAt(i)=='A') ||(A.charAt(i)=='E')|| (A.charAt(i)=='I') ||(A.charAt(i)=='O')||(A.charAt(i)=='U')
            ||(A.charAt(i)=='a') ||(A.charAt(i)=='e')|| (A.charAt(i)=='i') ||(A.charAt(i)=='o')||(A.charAt(i)=='u')){
                finalAns+=n-i;
            }
            finalAns=finalAns%10003;
        }
        return finalAns;
    }
}
