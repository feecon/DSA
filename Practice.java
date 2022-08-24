import java.util.ArrayList;
import java.util.Stack;

public class Practice {

    public static ArrayList<Integer> reverse(int ar[]) {
        // Creating stack obj
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < ar.length; i++) {
            // pushing into stack
            stk.push(ar[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        while (!stk.isEmpty()) {
            list.add(stk.pop());
        }

        return list;
    }

    public static void main(String[] args) {

        int ar[] = { 1, 2, 3, 4, 5 };

        System.out.println(reverse(ar));
        

    }

}
