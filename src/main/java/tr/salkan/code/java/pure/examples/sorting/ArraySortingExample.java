package tr.salkan.code.java.pure.examples.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingExample {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[] { 14, 12, 8, 53, 48, 19, 630, 1385, 466, 3 };

        //sorting
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------");

        //reverse order
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(Arrays.toString(numbers));

    }
}
