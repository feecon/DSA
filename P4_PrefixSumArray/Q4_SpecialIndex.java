package P4_PrefixSumArray;

public class Q4_SpecialIndex {
    
    //method to create prefix odd sum array
    public static int[] prefixOdd(int ar[]){
        int n = ar.length;
        int pso[] = new int[n];
        pso[0] = 0;
        for(int i =1; i<n; i++){
            if(i%2==1){
                pso[i] = pso[i-1] + ar[i];
            }else{
                pso[i] = pso[i-1];
            }
        }
        return pso;
    }

    //method to create prefix even sum array
    public static int[] prefixEven(int ar[]){
        int n = ar.length;
        int pse[] = new int[n];
        pse[0] = ar[0];
        for(int i =1; i<n; i++){
            if(i%2==0){
                pse[i] = pse[i-1] + ar[i];
            }else{
                pse[i] = pse[i-1];
            }
        }
        return pse;
    }

    //get count for all special indices
    public int solve(int[] A) {
        int n = A.length;
        int pso[] = prefixOdd(A);
        int pse[] = prefixEven(A);  
        
        int count = 0;

        for(int i=0;i<n;i++){
            int sumEvens = pso[n-1] - pso[i];
            if(i!=0){
                sumEvens += pse[i-1];
            }
             int sumOdds = pse[n-1] - pse[i];
             if(i!=0){
                sumOdds += pso[i-1];
             }
             if(sumEvens == sumOdds){
                 count ++;
             }
        }
        return count;
    }
}
