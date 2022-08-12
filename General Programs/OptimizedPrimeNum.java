public class OptimizedPrimeNum {
    public static boolean isPrime(int A) {
        //base contions
        if (A<=1)  return false;  //if input is negative, return false
        else if(A==2) return true; //if input is 2, return true
        else if(A%2==0) return false; //if input is multiple of 2, return false

        for (int i = 3; i*i <= A; i=i+2) {
            if(A%i ==0) return false;
        }
        return true;       
    }
    public static void main(String[] args) {
        if(isPrime(12)) System.out.println("YES");
        else System.out.println("NO");
        
    }
}
