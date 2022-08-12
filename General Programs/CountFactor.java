public class CountFactor {
    static int countFactors(int N){
        int c =0;
        for (int i = 1; i*i <= N; i++) {
            //i is a factor of N
            if(N%i == 0){
                //i is a factor, N/i is a factor
                if(i == N/i){c++;}
                else {c +=2;}
            }
            
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(countFactors(18));
    }
}
