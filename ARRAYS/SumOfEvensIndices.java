package ARRAYS;

import java.util.Scanner;

public class SumOfEvensIndices {
    public static int[] pS(int ar[]) {
        int n = ar.length;
        int prefixEven[] = new int[n];
        prefixEven[0] = ar[0];

        for(int i =1 ; i<n;i++){
            if(i%2==0)
                prefixEven[i] = prefixEven[i-1] + ar[i];
            else    
                prefixEven[i] = prefixEven[i-1];
        }
        return prefixEven;        
    }

    public static void main(String[] args) {
        int ar[] = {3,2,1,6,-3,2,8,4,9};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Queries: ");
        int Q = sc.nextInt();
        int prefixEven[] = pS(ar);
       for(int i = 0 ; i<Q ;i++){
        System.out.println("Enter L and R: ");
        int L = sc.nextInt();
        int R = sc.nextInt();
        if(L==0){
            System.out.println(prefixEven[R]);
        }else{
            System.out.println(prefixEven[R] - prefixEven[L-1]);
        }

       }

       sc.close();
    
    }
}
