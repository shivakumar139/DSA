package TreeMap;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
//        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer> > > treeMap = new TreeMap<>();
//
//        treeMap.put(0, new TreeMap<>());
//        treeMap.get(0).put(0,new PriorityQueue<>());
//        treeMap.get(0).get(0).offer(10);
//
//        treeMap.get(0).put(2,new PriorityQueue<>());
//        treeMap.get(0).get(2).offer(6);
//        treeMap.get(0).get(2).offer(5);
//        List<List<Integer>> ans = new ArrayList<>();
//        System.out.println(treeMap);
//
//        for(TreeMap<Integer, PriorityQueue<Integer>> ys: treeMap.values()){
////            System.out.println(ys);
//            ans.add(new ArrayList<>());
//            for (PriorityQueue<Integer> nodes: ys.values()){
//                while(!nodes.isEmpty()){
//                    ans.get(ans.size() - 1).add(nodes.poll());
//                }
//            }
//        }
//
//        System.out.println(ans);
//        HashSet<Integer> level = new HashSet<>();
//        level.add()


//
//
//        List<List<Integer>> list = new ArrayList<>();
//        ArrayList<Integer> ans = new ArrayList<>(treeMap.keySet());
//
//        for(int key: ans){
//            list.add(treeMap.get(key));
//        }
//        System.out.println(list);


//        System.out.println(treeMap);
//        System.out.println(list);
//        System.out.println(treeMap.containsKey(-2));
//        System.out.println(treeMap.values());
//        System.out.println(ans);
//        System.out.println(list);
//
//
//        PriorityQueue<Integer> p = new PriorityQueue<>();
//        p.add(1);
//        p.add(6);
//        p.add(5);
////        p.add(10);

//        System.out.println(p);

        TreeMap<Integer, TreeMap<Integer,Integer>> map = new TreeMap<>();
        map.put(0, new TreeMap<>());
        map.get(0).put(2,1);
        if(map.containsKey(0)){
            if(map.get(0).firstKey() > 1){
                map.get(0).clear();
                map.get(0).put(1,10);
            }
//            System.out.println(map.get(0).firstKey() > );
        }
        System.out.println(map);
        for(TreeMap<Integer, Integer> m: map.values()){

        }
//        System.out.println(map);
//        System.out.println(map);
//        map.put(0,0);
//        System.out.println(map.containsKey(0));
//        map.put(2,1);
//        map.put(3,0);
//        for (int data: map.values())
//            System.out.println(data);
//
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//            System.out.println(entry.getValue());
//        }

    }
}
