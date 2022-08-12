

/* if a = 5 , b = 6
after swap 
a = 6 , b = 5

--Swapping-- with temp variable
temp = a
a = b
b =temp
 * 
 */
public class Swap {
    public static void swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= "+ a +" b="+b);     
    }
    public static void main(String[] args) {
        int a = 5;
        int b =6;
        swap(a, b);
        System.out.println(2143206%35);
    }
}
