package Recursion;

import com.sun.jdi.event.StepEvent;

import java.util.ArrayList;
import java.util.Collections;

public class SubSeq {
    public static void main(String[] args) {
//        subSeq("","abc");
        System.out.println(subSeqList("","abc"));
    }

    private static void subSeq(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        subSeq(p + up.charAt(0), up.substring(1));
        subSeq(p , up.substring(1));
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
