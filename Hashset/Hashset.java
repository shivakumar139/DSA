package Hashset;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set =  new HashSet();
        set.add(5);
        set.add(3);
        set.add(2);
        Iterator it = set.iterator();
        while(it.hasNext()){
            Integer num = (Integer) it.next();
            System.out.println(num+1);
        }

    }
}
