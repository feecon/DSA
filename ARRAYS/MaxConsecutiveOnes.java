package ARRAYS;

public class MaxConsecutiveOnes {
    public static int maxConOnes(String str) {
        int n = str.length();
        int c = 0;
        //count the numbers of 1s in whole array
        for(int i =0; i<n; i++){
            if(str.charAt(i)=='1')
                 c = c + 1;
        } 
        //edge case if whole array consist of 1s
        if(c == n)
            return n;
        
        int ans =0;
        //iterate whole array and stop at 0
        for(int i =0;i<n;i++){
            //when 0 encounters
            if(str.charAt(i)=='0'){
                int l=0, r=0;
                //count for the consecutive 1s to the left side
                for(int j = i-1; j>=0; j--){
                    if(str.charAt(j)=='1')
                         l++;
                    else
                        break;                    
                }
                //count for the consecutive 1s to the right
                for(int j = i+1 ; j<n ;j++){
                    if(str.charAt(j)=='1')
                        r++;
                    else
                        break;
                }
                int count = l + r; 
                //if there exist 1 other than that of consecutive 1s
                if(count < c)
                     count = count +1;
                if(ans < count)
                     ans = count;               
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        String s ="111000";
        System.out.println(maxConOnes(s));
    }
}
