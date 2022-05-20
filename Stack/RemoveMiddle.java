package Stack;
import java.util.*;
public class RemoveMiddle {
    public static void main(String[] args) {

        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(1);
//        inputStack.push(2);
//        inputStack.push(3);
//        inputStack.push(4);
//        inputStack.push(5);
        deleteMiddle(inputStack, inputStack.size());
        System.out.println(inputStack);
    }

    static void deleteMiddle(Stack<Integer> inputStack, int n) {
        if(n==0 || inputStack.isEmpty())
            return;


        int size = inputStack.size();
        Stack<Integer> s = new Stack<>();
        int i=0;
        n++;
        while(i < size/2){
            s.push(inputStack.pop());
            i++;
        }
        inputStack.pop();

        while(!s.isEmpty()){
            inputStack.push(s.pop());
        }

    }
}
