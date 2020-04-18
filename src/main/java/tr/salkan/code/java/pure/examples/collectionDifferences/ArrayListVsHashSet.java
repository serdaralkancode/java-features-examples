package tr.salkan.code.java.pure.examples.collectionDifferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListVsHashSet {

    /*
            ArrayList implements List
            HashSet implements Set

            ArrayList dublice value -> YES
            HashSet dublice value   -> NO

            ArrayList  -> inserted ordered
            HashSet    -> unordered

            ArrayList  -> Access and Remove by index
            HashSet    -> None get

            ArrayList  -> add null value (one or more)
            HashSet    -> add null value (only one)
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("İstanbul");
        list.add("Ankara");
        list.add("Konya");

        Iterator<String> cityIterator = list.iterator();
        while(cityIterator.hasNext()){
            System.out.println(cityIterator.next());
        }

        System.out.println("------------------");

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);

        // Duplicate removed
        integerSet.add(4);

        for (Integer temp : integerSet) {
            System.out.print(temp + " ");
        }

    }
}
