
class Main{

    public static void sideways(int mat[][]){

        int n= mat.length;
        int m =mat[0].length;

        //int sumArr[] = new int[n];

        
        for(int c = 0;c<m ; c++){
            int i =0, j=c;
            int sum=0;
            while(i<n && j>=0){
                sum = sum+mat[i][j];
                i++; j--;
            }
            System.out.print(sum+" ");
        }
        
        for(int r = 1;r<n ; r++){
            int i =r, j=m-1;
            int sum =0;
            while(i<n && j>=0){
                sum = sum+mat[i][j];
                i++; j--;
            }
            System.out.print(sum+" ");
        }
        
    }
    public static void main(String[] args) {
        int mat[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

          sideways(mat);            
    }
}