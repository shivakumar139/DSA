package Stack;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();

//        System.out.println(st.peek());
        System.out.println(removeDuplicates("pbbcggttciiippooaais", 2));
    }
    static String removeDuplicates(String s, int k) {

        Stack<Character> st = new Stack<Character>();
        int[] count = new int[27];

        char[] arr = s.toCharArray();
        int c=0;
        st.push(arr[0]);
        int index = arr[0] - 'a';
        count[index]++;

        for (int i=1; i< arr.length; i++){
            index = arr[i] - 'a';
            if(!st.isEmpty() && arr[i] == st.peek()){
                count[index]++;
            } else{
                st.push(arr[i]);
                count[index]++;
            }

            if(count[index] == k){
                count[index] = 0;
                st.pop();
            }

        }

        // form a string
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            int loop = count[st.peek() - 'a'];
            while (loop > 0){
                ans.append(st.peek());
                loop--;
            }

            st.pop();
        }


        return ans.reverse().toString();
    }
}