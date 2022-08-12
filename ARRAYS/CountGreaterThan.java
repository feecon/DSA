package ARRAYS;

public class CountGreaterThan {
    public static boolean checkIfExist(int A[],int k) {
        for (int i = 0; i < A.length; i++) {
            if(A[i]==k)
                return true;
        }
        return false;       
    }
    public static int greater(int A[],int B) {
       
        //int max = A[0];
        int count = 0;

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

    public static void main(String[] args) {
        int arr[] = {23, 47, 8, 49, 47, 32, 48, 4, 36, 11, 8, 13, 2, 10, 18, 39, 31, 45, 9, 30 };
        int k =5;
        System.out.println(greater(arr, k));
    }
}
