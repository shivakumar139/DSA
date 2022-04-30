package Recursion;
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subSeq("","abc");
        System.out.println(subSeqList("","abc"));
//        System.out.println(subSeq("","abc"));
        subSeq("", "abc");
    }

    public static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        // include call
        subSeq(p+ch, up.substring(1));

        // exclude call
        subSeq(p, up.substring(1));

    }

    private static ArrayList<String> subSeqList(String p, String up) {
        if(up.isEmpty()){
//            System.out.println(p);
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }

        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(subSeqList(p + up.charAt(0), up.substring(1)));
        ans.addAll(subSeqList(p , up.substring(1)));
        return ans;
    }
}
