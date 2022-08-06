package P3_IntroToArrays;

public class Q4_ReverseTheArray {
    public int[] solve(final int[] A) {
        int p1 =0 , p2 = A.length-1;
       
        //swap the array element
       while(p1<p2){
           int temp =  A[p1];
           A[p1] = A[p2];
           A[p2] = temp;
           p1++;
           p2--;   

       } 
       return A; 
   }
}
