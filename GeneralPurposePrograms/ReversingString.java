package GeneralPurposePrograms;

public class ReversingString {
    static char[] reverse(String str, int s, int e) {
        int p1 = s;
        int p2 = e;
        char[] ch = str.toCharArray();

        while (p1 < p2) {
            // swap p1 and p2
            char temp = ch[p2];
            ch[p2] = ch[p1];
            ch[p1] = temp;

            p1++;
            p2--;
        }
        return ch;
    }

    public static String solve(String str) {
        //reverse(str, s, e);

        int p1 = 0;
        int  p2 = p1;

        int n = str.length();
        //reversing the words
        while(p1<n){
            if(str.charAt(p2)!= ' ' && str.charAt(p2)<n ){
                reverse(str,p1,p2);
            }
            p1 = p2 + 1 ; 
            p2 = p1;
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "Feecon is Best";
        int n = str.length();
        
        //System.out.println(solve(str, 0, n-1));
    }
}
