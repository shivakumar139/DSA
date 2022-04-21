package ListClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumHackerRank {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(4);
        li.add(5);
        li.add(3);
        li.add(2);

        System.out.println(icecreamParlor(4,li));

    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();


        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i),i);
        }

        for (int i = 0; i < arr.size(); i++) {
            int diff = Math.abs(arr.get(i) - m);
            System.out.println(diff);

            if(map.containsKey(diff) && map.get(diff)!=i){
                System.out.println(map.get(diff));
                li.add(i + 1);
                li.add(map.get(diff) + 1);
                break;
            }
        }

        return li;
    }
}
