package tr.salkan.code.java.pure.examples.sorting.comparableVsComparator.comparable;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    /*
        * interface
        * natural ordering
        * Implemented class must override compareTo() method
        * List -> Collections.sort -> sorted automatically
        * Array -> Arrays.sort     -> sorted automatically
        * TreeMap                  -> sorted automatically by key
        * Implemented class should use equals method (strongly recommended)

     */

    public static void main(String[] args) {

        List<ComparableObject> list = new ArrayList<>();
        List<ComparableByStringDateObject> list2 = new ArrayList<>();

        list.add(new ComparableObject(1l, "Ahmet", LocalDate.of(2018, Month.MAY, 21)));
        list.add(new ComparableObject(4l, "Bilal", LocalDate.of(2018, Month.APRIL, 22)));
        list.add(new ComparableObject(3l, "Pelin", LocalDate.of(2018, Month.AUGUST, 25)));
        list.add(new ComparableObject(5l, "Cihan", LocalDate.of(2018, Month.OCTOBER, 23)));
        list.add(new ComparableObject(2l, "Deniz", LocalDate.of(2018, Month.NOVEMBER, 24)));

        list2.add(new ComparableByStringDateObject(1l, "Ahmet", LocalDate.of(2018, Month.MAY, 21)));
        list2.add(new ComparableByStringDateObject(4l, "Bilal", LocalDate.of(2018, Month.APRIL, 22)));
        list2.add(new ComparableByStringDateObject(3l, "Ahmet", LocalDate.of(2018, Month.AUGUST, 25)));
        list2.add(new ComparableByStringDateObject(5l, "Cihan", LocalDate.of(2018, Month.OCTOBER, 23)));
        list2.add(new ComparableByStringDateObject(2l, "Deniz", LocalDate.of(2018, Month.NOVEMBER, 24)));

        Collections.sort(list);

        System.out.println(list);

        System.out.println("----------------------");

        Collections.sort(list2);

        System.out.println(list2);

    }
}
