package Stack;
import java.util.*;
public class ReverseUsingStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(1);
        st.push(4);

        reverseStack(st);
        System.out.println(st);

    }

    public static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        pustAtBottom(stack, top);

    }

    public static void pustAtBottom(Stack<Integer> stack, int top) {
        if(stack.isEmpty()){
            stack.push(top);
            return;
        }

        int item = stack.pop();
        pustAtBottom(stack,top);
        stack.push(item);


    }


}
