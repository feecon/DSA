package P10_BitManipulations1;

public class Q3_NumberOf1Bits {
    public int numSetBits(int A) {
        if (A==0) return 0;
        int one=1; 
        while(A!=1){
            one+=A%2;
            A=A/2;
        }
     return one;
    }
    
}
