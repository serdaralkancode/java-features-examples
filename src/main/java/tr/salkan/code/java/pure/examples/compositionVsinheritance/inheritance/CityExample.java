package tr.salkan.code.java.pure.examples.compositionVsinheritance.inheritance;

import java.util.HashSet;

public class CityExample extends HashSet<Object> {


    public static void main(String[] args) {

        CityExample cities = new CityExample();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("Konya");

        cities.forEach(System.out::println);
    }

}
