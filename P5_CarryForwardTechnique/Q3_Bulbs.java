package P5_CarryForwardTechnique;

public class Q3_Bulbs {
    public int bulbs(int[] A) {
        int cv=0,c=0;
        int n = A.length;
            for(int i=0;i<n;i++){

                if(c%2 == 0){
                    cv = A[i];
                }else{
                    cv = A[i] == 0?1:0;
                }

                if(cv == 0){
                    c++;
                }
            }

     return c;
    }
}
