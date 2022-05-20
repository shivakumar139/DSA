package Stack;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        System.out.println(isValid("((((("));
    }
    static boolean isValid(String s) {
        if(s.length() <= 1){
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(' ){
                stack.push(s.charAt(i));
            } else{
                if(stack.isEmpty())
                    return false;
                else if(s.charAt(i) == ')' && stack.pop() != '(')
                    return false;
                else if(s.charAt(i) == '}' && stack.pop() != '{')
                    return false;
                else if(s.charAt(i) == ']' && stack.pop() != '[')
                    return false;
            }
        }

        return true;
    }
}
