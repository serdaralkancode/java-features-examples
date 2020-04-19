package tr.salkan.code.java.pure.examples.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortingExample {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(14, 12, 8, 53, 48, 19, 630, 1385, 466, 3);

        Collections.sort(numbersList);

        System.out.println(numbersList);

        System.out.println("--------------------------");

        //reverse
        Collections.sort(numbersList, Collections.reverseOrder());

        System.out.println(numbersList);
    }
}
