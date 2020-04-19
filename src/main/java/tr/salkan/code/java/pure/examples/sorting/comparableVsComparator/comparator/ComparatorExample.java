package tr.salkan.code.java.pure.examples.sorting.comparableVsComparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<City> list = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();

        list.add(new City(34,"İstanbul",16.8));
        list.add(new City(6,"Ankara",8.3));
        list.add(new City(42,"Konya",3.4));
        list.add(new City(35,"İzmir",6.1));

        list2.add(new Person(1l,"Ahmet",34));
        list2.add(new Person(2l,"Mehmet",12));
        list2.add(new Person(3l,"Ayşe",28));
        list2.add(new Person(4l,"Ahmet",45));
        list2.add(new Person(5l,"Hakan",34));
        list2.add(new Person(6l,"Gamze",11));



        Collections.sort(list,new CityComparator());
        System.out.println(list);

        System.out.println("----------------");

        // Java 8
        // By Name
        Comparator<City> nameSorter = (c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName());
        Collections.sort(list, nameSorter);
        System.out.println(list);

        System.out.println("----------------");

        //Java 8
        //group by name and compare age

        Collections.sort(list2, Comparator
                .comparing(Person::getName)
                .thenComparing(Person::getAge));

        System.out.println(list2);

    }


}
