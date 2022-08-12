/* Print Array function */
package ARRAYS;

public class PrintArray {
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }      
    }
    
    public static void main(String[] args) {
        int arr[] = {4,6,8,1,12,10,36};
        printArray(arr);
    }
}
