package P11_BitManipulations2;

public class Q2_FindingGoodDays {
    public int solve(int A) {
        int c=0;
        for(int i=0;i<32;i++){
            if((A>>i&1) == 1){
                c++;
            }
        }
    return c;
    }  
}

// Since for each day, the food doubles up as the previous day with 1 unit on the first day, starting from i = 0,
// the number of food units Boomer was supposed to get on ith day is 2i.
// Only on the days he was well behaved did he get food. So adding the power of 2 on each day, he was well behaved,
// gives the total number of food units, i.e., A.
// Hence, the number of 1's in the binary representation of A is the number of days he was well behaved.