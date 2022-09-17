import java.util.ArrayList;

/*Amazon -

Given an array of size N having capital Aplhabets, the task is to find the next greater alphabet for each element of the array in order of their appearance in the array. Next greater aphabet of the elemnt in the array is the nearest alphabet on the right which is greater than the current alphabet as per the ASCII value.

input - 
N = 2, arr[] = ['A', 'C', 'D']

output-
'C' , 'D'

input 2-
N = 4, arr[] = ['A', 'C', 'B', 'D']

output2-
'C' , 'D', 'D'
 */

class Solution {

    public static ArrayList<Character> solve(char arr[]) {
        int n = arr.length;

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    list.add(arr[j]);
                    break;
                }

            }
        }
        return list;

    }

    public static void main(String[] args) {
        char arr[] = { 'A', 'C', 'B', 'D' };

        System.out.println(solve(arr));

    }

}