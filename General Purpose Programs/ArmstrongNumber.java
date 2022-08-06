import java.util.Scanner;

public class ArmstrongNumber {
    public static void armstrtong(int N) {
        for (int i = 1; i <= N; i++) {
            int sum =0;
            int value =i;
            while(value >0){
                int rem = value%10;
                sum = sum + (rem*rem*rem);
                value = value/10;
            }
            if(sum == i) System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrtong(n);

        sc.close();
    }
}
