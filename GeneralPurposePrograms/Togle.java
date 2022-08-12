package GeneralPurposePrograms;

public class Togle {
    public static char[] togle(String str) {
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // if(ch[i] >= 65 && ch[i]<=90){
            //     ch[i] +=32;
            // }
            // else{
            //     ch[i] -=32;
            // }
            ch[i] ^=32;
        }
        return ch;
        
    }

    public static void main(String[] args) {
        String str = "FeECon";

        System.out.println(togle(str));
    }
}
