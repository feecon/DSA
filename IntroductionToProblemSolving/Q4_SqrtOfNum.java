package IntroductionToProblemSolving;

public class Q4_SqrtOfNum {
    public static int squareRoot(int A) {
        int pSquare = -1;
        for(int i = 1; i*i <= A ; i++){
            if(i*i == A)
                pSquare = i;
        }
        return pSquare;
    }
    public static void main(String[] args) {
        int N = 4;
        System.out.println(" Square root of "+N+ " is "+squareRoot(N));
        
    }
}
