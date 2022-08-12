package ARRAYS;

public class ReversePart {
    public static void reversePart(int arr[], int s , int c) {
        int p1 =s , p2 = c;
        //swap the array element
        while(p1<p2){
            int temp =  arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;   
        }          
    }

    public static void main(String[] args) {
        int arr[] = {4,9,2,-2,12,10};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reversePart(arr,2,4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }   
}
