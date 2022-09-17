
class Result {
    private static void reversePart(int arr[], int s , int e) {
        int p1 =s , p2 = e;
        //swap the array element
        while(p1<p2){
            int temp =  arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;   
        }          
    }

    public static void rotateLeft(int arr[], int k) {
        int N = arr.length;
        k = k % N;
        reversePart(arr,0,N-1);
        reversePart(arr,0,k-1);
        reversePart(arr,k,N-1);

        for (int e : arr) {
            System.out.print(e+" ");
        }
    }


    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6};
        
       rotateLeft(ar,4);
        
        //swap(2, 6);

  
    }

}