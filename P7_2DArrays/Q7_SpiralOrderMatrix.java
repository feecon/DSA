package P7_2DArrays;

public class Q7_SpiralOrderMatrix {
    public int[][] generateMatrix(int A) {
        int size=A*A;
        int[][] finalAns=new int[A][A];
        int minRow=0;
        int minCol=0;
        int maxRow=A-1;
        int maxCol=A-1;
        int cnt=1;
        int tc=size;
       
        while(cnt<=tc){
            //topWall
            for(int i=minRow, j=minCol ; j<=maxCol ; j++){
                finalAns[i][j]=cnt;
                cnt++;
            }
            minRow++;
            //rightWall
            for(int i=minRow, j=maxCol ; i<=maxRow ; i++){
               
                finalAns[i][j]=cnt;
                cnt++;
            }
            maxCol--;
            //bottomWall
            for(int i=maxRow, j=maxCol ; j>=minCol ; j--){
               
                finalAns[i][j]=cnt;
                cnt++;
            }
            maxRow--;
            //leftWall
            for(int i=maxRow, j=minCol ; i>=minRow ; i--){
               
                finalAns[i][j]=cnt;
                cnt++;
            }
            minCol++;
        }
        return finalAns;
    }
}
