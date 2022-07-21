package Stack;
//https://www.codingninjas.com/codestudio/problems/valid-parenthesis_795104?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        System.out.println(isValidParenthesis(str));
    }
    public static boolean isValidParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            // openeing
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == '}') {
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    }
                }
                if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    }
                }
                stack.pop();
            }
        }

        return stack.empty();
    }

}
