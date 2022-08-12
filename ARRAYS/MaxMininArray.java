/**e.g - 
 * arr[] = {4,10,2,6,3,15} 
 * max element = 15
 * min element = 2
 */
package ARRAYS;

public class MaxMininArray {
    public static void printMaxMinInArray(int arr[]) {
        int N = arr.length;
        int max = arr[0];
        int min = arr[0];
        for(int i =0;i<N;i++){
            if(max<arr[i])
                max = arr[i];
            if(min>arr[i])
                min = arr[i];
        }
        System.out.print(max+" "+min);
    }

    public static void main(String[] args) {
        int arr[] = {4,10,2,6,3,15};
        printMaxMinInArray(arr);
    }
}
