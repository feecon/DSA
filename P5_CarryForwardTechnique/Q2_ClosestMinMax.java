package P5_CarryForwardTechnique;

public class Q2_ClosestMinMax {
     //returnin msximum in the array
     public static int max(int[] A){
        int max = A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max)
                max = A[i];
        }
        return max;
    }
    //minimum element in the array
    public static int min(int[] A){
        int max = A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]<max)
                max = A[i];
        }
        return max;
    }

    public int solve(int[] A) {
        int n = A.length;
        int minLength = n;
        int max = max(A);
        int min = min(A);
        int len = 0;

        if(min == max){return 1;}
        int minIndex = -1, maxIndex = -1;
        for(int i = n-1; i>-0; i--){
            if(A[i]==min){
                //find the max index on right
                minIndex = i;
                if(maxIndex!=-1){
                    len = maxIndex - minIndex + 1;
                    if(len<minLength){
                        minLength = len;
                    }
                }
            }
            else if(A[i]==max){
                //find the nearest min index on right
                maxIndex = i;
                if(minIndex!=-1){
                    len = minIndex - maxIndex + 1;
                    if(len<minLength){
                        minLength = len;
                    }
                }
            }
        
        }
        return minLength;
    }
}
