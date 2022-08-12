package ARRAYS;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {ar[i] = sc.nextInt();}
           
            for (int i = 0; i < n; i++) {
                 if (ar[i] % 2 == 0)
                    System.out.print(ar[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                if (ar[i] % 2 != 0) 
                    System.out.print(ar[i] + " "); 
            }
            System.out.println();

        }
        sc.close();

    }
}
