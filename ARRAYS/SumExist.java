/* Q2- Given N array elements, check if there exists a pair(i,j) such that
arr[i] + arr[j] == k and i!=j

Note : i & j are index value, k is a given sum
example-
1. arr[] = {3, -2, 1, 4, 3, 6, 8} , k = 10
            0   1  2  3  4  5  6    i = 3, j =5 => arr[3] + arr[5] == 10, hence true

2. arr[] = {2, 4, -3, 7} , k = 5
            0   1  2  3                              No such pair found , hence false
*/
package ARRAYS;

public class SumExist {
    public static boolean sum(int arr[], int k) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(arr[i] + arr[j] == k)
                    return true;                
            }
        }
        return false;     
    }

    public static void main(String[] args) {
        int arr[] ={3, -2, 1, 4, 3, 6, 8};
        int k =10;
        System.out.println(sum(arr, k));
        
    }
    
}
