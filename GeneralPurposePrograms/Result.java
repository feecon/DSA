package GeneralPurposePrograms;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Result {
    static long sumOfPrime(List<Integer> ar) {
        long sum = 0;
        for (int i = 0 ; i < ar.size(); i++) {
            if (isPrime(ar.get(i))) {
                sum += ar.get(i);
            }
        }
        return sum;
    }

    static boolean isPrime(int A) {
        int c = 0;
        for (int i = 2; i <= A; i++) {
            if (A % i == 0) {
                c++;
            }
        }
        if (A == 1) {
            return true;
        } else {
            if (c == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int e = sc.nextInt();
            ar.add(e);
        }
        
        System.out.println(sumOfPrime(ar));

        sc.close();
    }
    
}
