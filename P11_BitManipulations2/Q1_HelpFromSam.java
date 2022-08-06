package P11_BitManipulations2;

public class Q1_HelpFromSam {
    public int solve(int A) {
        int c=0;
        while(A>0){
            if((A&1) == 1){
                c++;
            }
            A = A>>1;
        }
    return c;
    }
}


//The problem is finding the number of set bits in A.
//Time Complexity : O( log(A) )