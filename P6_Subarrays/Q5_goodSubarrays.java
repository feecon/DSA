package P6_Subarrays;

public class Q5_goodSubarrays {

    private boolean good(int sum, int loop, int B) {
        if((sum < B && loop%2 == 0) || (sum > B && loop%2 != 0))
            return true;
       
        return false;
    }

    public int solve(int[] A, int B) {
        int count = 0;        
        for(int i = 0; i < A.length; i++) {
            int loop = 1;
            int sum = A[i];
            if(good(sum, loop, B))
                count++;
            //loop++;            
            for(int j = i + 1; j < A.length; j++) {
                loop++;
                sum += A[j];
                if(good(sum, loop, B))
                    count++;
            }
        }
        return count;
    }
   
}
