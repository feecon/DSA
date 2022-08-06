package P10_BitManipulations1;

public class Q2_AddBinaryStrings {
    public String addBinary(String A, String B) {
        int a_len = A.length();
        int b_len = B.length();
        int max_len=Integer.max(a_len,b_len);
        int bChar = 0;
        int aChar = 0;        
        int remainder=0;
        int carry=0;
        String result = "";
        for(int i=max_len-1;i>=0;i--){
           
            aChar=0;
            bChar=0;
            if(i-max_len+a_len>=0)
                aChar= Character.getNumericValue(A.charAt(i-max_len+a_len));
           
            if(i-max_len+b_len>=0)
                bChar=Character.getNumericValue(B.charAt(i-max_len+b_len));
           
            remainder = (aChar+bChar+carry)&1;
            carry = (aChar+bChar+carry)>>1;
           
            result=remainder+result;
        }
        if(carry>0)
            result=carry+result;
        return result;
    }
}
