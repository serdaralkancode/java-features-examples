package tr.salkan.code.java.pure.examples.collectionDifferences;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class HashSetVsLinkedHashSetVsTreeSet {

    /*

            HashSet         -> store data HashMap
            LinkedHashSet   -> store data LinkedHashMap
            TreeSet         -> store data TreeMap

            HashSet         -> not insertion order
            LinkedHashSet   -> insertion order
            TreeSet         -> Comparator order

            HashSet         -> better than LinkedHashSet and TreeSet > performance
            LinkedHashSet   -> HashSet > LinkedHashSet > TreeSet  -> performance
            TreeSet         -> TreeSet is slow > performance

            HashSet         -> equals and hascode to compare
            LinkedHashSet   -> equals and hascode to compare
            TreeSet         -> compare and compareTo  to compare

            HashSet         -> add only one null element
            LinkedHashSet   -> add only one null element
            TreeSet         -> not allowed null element throws NullPointerException


     */

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet  = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        IntStream.range(1, 10).forEach(i -> hashSet.add(i));
        IntStream.range(1, 10).forEach(i -> linkedHashSet.add(i));
        IntStream.range(1, 10).forEach(i -> treeSet.add(i));

        hashSet.add(5);
        linkedHashSet.add(5);
        treeSet.add(5);

        System.out.println("HashSet :" + hashSet);
        System.out.println("LinkedHashSet :" + linkedHashSet);
        System.out.println("TreeSet :" + treeSet);

        System.out.println("-----------------------");

        //order
        hashSet.add(42);
        hashSet.add(28);
        linkedHashSet.add(42);
        linkedHashSet.add(28);
        treeSet.add(42);
        treeSet.add(28);

        System.out.println("HashSet order : " + hashSet);
        System.out.println("LinkedHashSet order : " + linkedHashSet);
        System.out.println("TreeSet order : " + treeSet);

        System.out.println("-----------------------");

        insertTime();
    }

    private static void insertTime() {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet  = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long startTime = System.nanoTime();
        IntStream.range(1, 1000).forEach(i -> hashSet.add(i));
        long endTime = System.nanoTime();

        System.out.println("HashSet insert time : " + (endTime - startTime));

        long startTime2 = System.nanoTime();
        IntStream.range(1, 1000).forEach(i -> linkedHashSet.add(i));
        long endTime2 = System.nanoTime();

        System.out.println("LinkedHashSet insert time : " + (endTime2 - startTime2));

        long startTime3 = System.nanoTime();
        IntStream.range(1, 1000).forEach(i -> treeSet.add(i));
        long endTime3 = System.nanoTime();

        System.out.println("TreeSet insert time : " + (endTime3 - startTime3));
    }

}
