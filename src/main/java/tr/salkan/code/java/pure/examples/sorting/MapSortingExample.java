package tr.salkan.code.java.pure.examples.sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortingExample {

    //TreeMap provide sorting
    //LinkedHashMap inserted ordered
    //HashMap no guarantees inserted ordered

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(35, "Kayseri");
        map.put(6, "Ankara");
        map.put(42, "Konya");
        map.put(1, "Adana");
        map.put(16, "Bursa");

        //sorting by key
        TreeMap<Integer, String> treeMap = new TreeMap<>(map);

        System.out.println(treeMap);

        System.out.println("---------------------------");

        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        System.out.println(sortedMap);

    }
}
