package GeneralPurposePrograms;

public class Solution {

    public static char[] solve(char[] ch) {

        //char ch[] = A.toCharArray();
        int p1 = 0;
        int p2 = 0;
        int n = ch.length;

        System.out.println("solve methode call:");
        System.out.println(ch);
        while(p2<n){
            //iterate p2 till space of the end of string
            while((p2<n) && (ch[p2] != ' ')){ p2 = p2+1;}
            
            reverse(ch,p1,p2-1);
            p1 = p2+1;
            p2 = p1; 
        }
        //System.out.println(ch);
        return ch;       
    }

    public static String reverse(char[] ch, int s, int e){
        //int n = ch.length;
    
        //System.out.println("reverse method call: ");

        while(s<e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
         return new String(ch);
    }
    public static void main(String[] args) {
        String str = "__Feecon is Best in all";
        // System.out.println("length of array--> "+ch.length);
        char ch[] = str.toCharArray();
        int n = ch.length;
        //System.out.println(reverse(ch,0,n-1));
        System.out.println(solve(ch));
    }
}

