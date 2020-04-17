package tr.salkan.code.java.pure.examples.iterators;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

public class SpliteratorThreadExample {

    public static void main(String[] args) {

        Set<String> city = new HashSet<>();
        city.add("İstanbul");
        city.add("Ankara");
        city.add("Konya");
        city.add("İzmir");

        Spliterator<String> stringSpliterator = city.spliterator();
        Spliterator<String> stringSpliterator2 = stringSpliterator.trySplit();

        new Thread(new Runnable() {
            @Override
            public void run() {
                stringSpliterator.forEachRemaining(s -> {
                    System.out.println("split one : "+s);
                });
            }
        }).start();

        stringSpliterator2.forEachRemaining(s -> {
            System.out.println("split two : "+s);
        });
    }
}
