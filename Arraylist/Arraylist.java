package Arraylist;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList();
        li.add(5);
        li.add(2);
        li.add(3);


        Collections.sort(li);
        System.out.println(li);
    }

}
