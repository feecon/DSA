package P3_IntroToArrays;

public class Q7_SecondLargest {
    
    public int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        int maxIndex=0; //index of max element in the array
        for(int i=0;i<n;i++){
            if(A[i]>max){
                max = A[i];
                maxIndex=i;
            }
        }

        for(int i=0;i<n;i++){
            //2nd max element will be in the index other than the index of max element
            if(i!=maxIndex){  
                if(A[i]>sMax && A[i]<=max){
                    sMax = A[i];
                }                    
            }            
        }

        if(sMax>0)
            return sMax;
        else
            return -1;
    }
}
