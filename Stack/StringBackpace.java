package Stack;

import java.util.Stack;

//https://leetcode.com/problems/backspace-string-compare/
public class StringBackpace {
    public static void main(String[] args) {
//        "bxj##tw"
//"bxj###tw"
        System.out.println(backspaceCompare("bxj##tw", "bxj###tw"));
    }

    static boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j) >= 'a' && s.charAt(j) <='z' ){
                stackS.push(s.charAt(j));
            } else{
                if(stackS.size() > 0)
                    stackS.pop();
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) >= 'a' && t.charAt(i) <='z' ){
                stackT.push(t.charAt(i));
            } else{
                if(stackT.size() > 0)
                    stackT.pop();
            }
        }

        System.out.println(stackS);
        System.out.println(stackT);
//
//        if(stackS.size() != stackT.size())
//            return false;
//        while(!stackS.isEmpty() && !stackT.isEmpty()){
//            if(stackS.peek() == stackT.peek()){
//                stackS.pop();
//                stackT.pop();
//            } else {
//                return false;
//            }
//        }
        return String.valueOf(stackS).equals(String.valueOf(stackT));
    }
}
