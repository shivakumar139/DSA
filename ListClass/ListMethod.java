package ListClass;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        list1.add(-1);
        list1.add(0);
        list1.add(1);

        list2.add(0);
        list2.add(1);
        list2.add(-1);
        System.out.println(list1.containsAll(list2));

    }
}
