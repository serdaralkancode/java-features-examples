package tr.salkan.code.java.pure.examples.compositionVsinheritance.composition;

import java.util.HashSet;
import java.util.Set;

public class CityExample {

    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {

        set.add("İstanbul");
        set.add("Ankara");
        set.add("Konya");
        set.forEach(System.out::println);
    }
}
