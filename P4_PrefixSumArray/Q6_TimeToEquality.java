package P4_PrefixSumArray;

public class Q6_TimeToEquality {
    public int solve(int[] A) {
        int n = A.length;

       int sum = 0;
       int max = A[0];
       for(int i = 0; i < n; i++) {
           if(A[i] > max){
               max = A[i];
           }
       }

      for(int i = 0; i < n; i++) {
          int ans = max-A[i];
          sum = sum + ans;
      }
      return sum;
   }
}

// Since we can only increase the element by 1, we should increase all elements up to the maximum element.
// We can find the maximum element, and for finding the minimum number of moves, we should find the summation of the absolute difference of all 
// elements with the maximum element.