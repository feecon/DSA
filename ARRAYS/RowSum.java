package ARRAYS;

public class RowSum {
    public static void rowWiseSum(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i <n ;i++){
            //we need ith row sum
            int sum = 0;
            for(int j = 0; j <m;j++){
                sum += mat[i][j];
            }
            System.out.println(sum);
        }       
    }
    public static void main(String[] args) {
        int mat[][] = {{4,3,1,7},{6,2,3,4},{5,3,2,7}};
        rowWiseSum(mat);
    }
}
