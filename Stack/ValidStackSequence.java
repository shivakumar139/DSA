package Stack;
import java.util.*;
public class ValidStackSequence {
    public static void main(String[] args) {


    }
    static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int i=0; i<pushed.length; i++){
            stack.push(pushed[i]);

            if(stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }

        while(j<popped.length){
            if(stack.peek() == popped[j++]){
                stack.pop();
            }

        }

        return stack.isEmpty();
    }
}
