package ARRAYS.MATRIX;

public class ColSum {
    public static void colWiseSum(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        for(int j = 0; j<m ;j++){
            //we need jth col sum
            int sum = 0;
            for(int i = 0; i<n ;i++){
                sum += mat[i][j];
            }
            System.out.print(sum+" ");
        }       
    }
    public static void main(String[] args) {
        int mat[][] = {{4,3,1,7},{6,2,3,4},{5,3,2,7}};
        colWiseSum(mat);
    }
}
