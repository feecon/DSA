package ARRAYS;

public class MinSwaps {
   public static int fun(int[] a, int[] b){
   
    int sum =0;
        for(int i=0;i<a.length;i++){
            int flag =1;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]) {
                    flag =0;
                    break;
                }  
            }
            if(flag==1){sum +=a[i];}
        }
        for(int i=0;i<b.length;i++){
            int flag =1;
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]) {
                    flag =0;
                    break;
                }  
            }
            if(flag==1){sum +=b[i];}
        }
    return sum;


   }

    public static void main(String[] args) {

        int a[] = { 9,-4,3,2,-5}; 
        int b[] = { 2,-5,7,9}; 
        //System.out.println(fun(ar1,ar2));
        
        System.out.println(fun(a,b));
    }

}

