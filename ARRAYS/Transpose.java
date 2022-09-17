package ARRAYS;

public class Transpose {
   static int[][] transpose(int mat[][]){
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[0].length; j++) {
                int temp =  mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;

    }
    public static void main(String[] args) {
        int mat[][] = {
            { 1,   2,  3,  4,  5 },
            { 6,   7,  8,  9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 },
            { 21, 22, 23, 24, 25 },
    };
    transpose(mat);
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[0].length; j++) {
            System.out.print(mat[i][j]+ " ");
        }
        System.out.println();
    }
    System.out.println(3<<3);

    }
}
