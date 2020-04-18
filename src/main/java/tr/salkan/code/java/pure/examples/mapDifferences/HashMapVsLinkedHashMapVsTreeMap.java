package tr.salkan.code.java.pure.examples.mapDifferences;

import java.util.*;

public class HashMapVsLinkedHashMapVsTreeMap {

    /*

        HashMap       -> implements Map
        LinkedHashMap -> extends HashMap implements Map
        TreeMap       -> implements NavigableMap extends SortedMap extends Map

        HashMap       -> add -> no guarantees inserted ordered
        LinkedHashMap -> add -> inserted ordered
        TreeMap       -> add -> sorted and ascending order

        HashMap       -> one null key and multiple null value
        LinkedHashMap -> one null key and multiple null value
        TreeMap       -> not null key and multiple null value

        HashMap       -> O(1) performance
        LinkedHashMap -> O(1) performance
        TreeMap       -> O(log(n)) performance

        HashMap       -> use HashTable (synronized) and less memory
        LinkedHashMap -> use doubly-linked list and extra memory
        TreeMap       -> use Red-Black tree and more memory

        HashMap       -> use if get performance and not need ordering
        LinkedHashMap -> use if get inserting order
        TreeMap       -> use if get sorting and comparator

     */

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(34,"İstanbul");
        hashMap.put(6,"Ankara");
        hashMap.put(42,"Konya");
        hashMap.put(35,"İzmir");

        System.out.println("---HashMap---");
        hashMap.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(34,"İstanbul");
        linkedHashMap.put(6,"Ankara");
        linkedHashMap.put(42,"Konya");
        linkedHashMap.put(35,"İzmir");

        System.out.println("---LinkedMap---");
        linkedHashMap.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(34,"İstanbul");
        treeMap.put(6,"Ankara");
        treeMap.put(42,"Konya");
        treeMap.put(35,"İzmir");

        System.out.println("---TreeMap---");
        treeMap.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));


    }
}
