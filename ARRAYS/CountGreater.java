/* Q1.Given N array elements, count the number of elements  having atleast 1 
element greater than itself 
e.g. 
1. arr[7] = {-3,-2,6,8,4,8,5},  output - 5
2. arr[8] = {10,3,10,7,10,2,10,8}, output = 7

Idea -
--> For max number we cannot have number greater than itself
--> Iterate and get the count of max number, say c
--> final ans = Total number of element - c

e.g explaination- 
1. 8 is the max number in the array, count of 8s is 2, hence result = 7 - 2 = 5
2. 10 is the max number in the array, count of 10s is 4, hence result = 8 - 4 = 4
*/

package ARRAYS;

public class CountGreater {
    public static int countGreater(int arr[]) {
        int max = arr[0];
        int N = arr.length;
        int count = 0;
        for (int i = 2; i < N; i++) {
            if(max < arr[i])
                max = arr[i];

            if(max == arr[i])  
                count++;   
        }
        return N-count;       
    }   
    public static void main(String[] args) {
        int arr[] = {10,3,10,7,10,2,10,8};
        System.out.println(countGreater(arr));
    } 
}

