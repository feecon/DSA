package ARRAYS.MATRIX;

public class SpiralPrinting {
    public static void spiral(int[][] mat) {
        int n=mat.length;
        //int m =mat[0].length;
        int i=0,j=0;
        while(n>1){
            for (int k = 1; k < n; k++) {
                System.out.print(mat[i][j]+" ");
                j++;
            }
            for (int k = 1; k < n; k++) {
                System.out.print(mat[i][j]+" ");
                i++;
            }
            for (int k = 1; k < n; k++) {
                System.out.print(mat[i][j]+" ");
                j--;
            }
            for (int k = 1; k < n; k++) {
                System.out.print(mat[i][j]+" ");
                i--;
            }
            i++; j++; n=n-2;
        } 
        if(n==1){
            System.out.print(mat[i][j]);
        }        
    }
    public static void main(String[] args) {
        int mat[][] = {
            { 1,   2,  3,  4,  5 },
            { 6,   7,  8,  9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 },
            { 21, 22, 23, 24, 25 },
    };
    spiral(mat);
    }
}
