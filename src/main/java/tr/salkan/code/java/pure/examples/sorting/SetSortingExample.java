package tr.salkan.code.java.pure.examples.sorting;

import java.util.Arrays;
import java.util.TreeSet;

public class SetSortingExample {

    public static void main(String[] args) {

        //TreeSet provide sorting
        //LinkedHashSet provide inserting ordering
        //HashSet not guarantee ordering

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(14, 12, 8, 53, 48, 19, 630, 1385, 466, 3));

        System.out.println(treeSet);

    }
}
