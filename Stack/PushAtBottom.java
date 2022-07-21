package Stack;
//https://www.codingninjas.com/codestudio/problems/insert-an-element-at-its-bottom-in-a-given-stack_1171166?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0?source=youtube&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
import java.util.*;
public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(1);
        st.push(4);
        st.push(5);

        System.out.println(pushAtBottom(st,9));
    }
    public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x)
    {
        // Write your code here
        Stack<Integer> stack = new Stack<>();
        while(!myStack.isEmpty()){
            stack.push(myStack.pop());
        }
        stack.push(x);

        while(!stack.isEmpty()){
            myStack.push(stack.pop());
        }

        return myStack;

    }
}
