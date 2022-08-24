
public class Main2 {

    public static int repeatThrice(int ar[], int n){
        int c =0;

        for(int i =0; i<n; i++){
            
            for(int j = i+1; j<n; j++){
                if(ar[i]==ar[j]){c++;}
            }
        }

       return c;
    }

    public static void main(String[] args) {
        int ar[]={1,2,2,3,2};
        int n = ar.length;
        System.out.println(repeatThrice(ar,n));
    }
}
