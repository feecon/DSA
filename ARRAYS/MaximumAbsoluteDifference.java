package ARRAYS;

public class MaximumAbsoluteDifference {

    static int maxAbsoluteDiff(int ar[]){
        int N = ar.length;
        int Xmin = Integer.MAX_VALUE , Ymin = Integer.MAX_VALUE;
        int Xmax= Integer.MIN_VALUE , Ymax = Integer.MIN_VALUE;

        for(int i=0;i<N;i++){
            int x =  ar[i] - i;
            int y = ar[i] + i;

            Xmax = Math.max(Xmax,x);
            Xmin = Math.min(Xmin,x);

           Ymax = Math.max(Ymax,y);
           Ymin = Math.min(Ymin,y);

        }
        return Math.max(Xmax-Xmin, Ymax-Ymin);

    }

    public static void main(String[] args) {

        int A[] = { 1, 3, -1 };
        System.out.println(maxAbsoluteDiff(A));
    }

}