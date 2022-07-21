package Stack;
// https://www.codingninjas.com/codestudio/problems/sort-a-stack_985275?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0?source=youtube&campaign=Lovebabbarcodestudio&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio
import java.util.Stack;

public class SortUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(4);
        st.push(4);
        st.push(-5);

        sortStack(st);
        System.out.println(st);
    }

    public static void sortStack(Stack<Integer> stack) {
        if(stack.empty()){
            return;
        }

        int top = stack.pop();
        sortStack(stack);
        insertAtCorrectPos(stack,top);
    }

    private static void insertAtCorrectPos(Stack<Integer> stack, int top) {
        if(stack.isEmpty()){
            stack.push(top);
            return;
        }

        if(stack.peek() <= top){
            stack.push(top);
            return;
        }

        int temp = stack.pop();
        insertAtCorrectPos(stack, top);
        stack.push(temp);
    }

}
