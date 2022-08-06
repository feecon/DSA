package P3_IntroToArrays;

public class Q6_LittlePonyMinMax {
    //check if element exist in the array
    public static boolean checkIfExist(int A[],int k) {
        for (int i = 0; i < A.length; i++) {
            if(A[i]==k)
                return true;
        }
        return false;        
    }
    //if exists, return the count of element greater than that element
    public static int solve(int A[],int B) {
        int count =0;
        while(checkIfExist(A,B)){
            for(int i =0;i<A.length;i++){
                if(A[i]>B)
                    count++;
            }
            if(count!=0)
                return count;  
        }
        return -1;                     
    }
}
