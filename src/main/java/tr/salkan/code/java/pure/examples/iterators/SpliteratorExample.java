package tr.salkan.code.java.pure.examples.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorExample {

    /*
            JAVA 8 Feature
            Parallel programming
            Sequential traversal (Non-linear,Tree)
            Using MAP  -> NO

            METHODS
                int characteristics()
                long estimateSize()
                default long getExactSizeIfKnown()
                default Comparator<? super T> getComparator()
                default boolean hasCharacteristics(int val)
                boolean tryAdvance(Consumer<? super T> action)
                default void forEachRemaining(Consumer<? super T>action)
                Spliterator<T> trySplit( )
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list2 = Arrays.asList(15, 33, 210, 125, 19, 2, 212, 111);

        list.add(10);
        list.add(30);
        list.add(-100);
        list.add(-50);
        list.add(800);
        list.add(40);

        Stream<Integer> integerStream = list.stream();
        Spliterator<Integer> integerSpliterator = integerStream.spliterator();

        System.out.println("estimate size : " + integerSpliterator.estimateSize());
        System.out.println("------------------");
        System.out.println("exact size : " + integerSpliterator.getExactSizeIfKnown());
        System.out.println("------------------");
        integerSpliterator.forEachRemaining((s) -> System.out.println(s));
        System.out.println("------------------");


        Spliterator<Integer> spliterator1 = list2.spliterator();
        Spliterator<Integer> spliterator2 = spliterator1.trySplit();

        System.out.println("SplitIterator 1:");
        spliterator1.forEachRemaining(val -> System.out.println(val));

        System.out.println("SplitIterator 2:");
        spliterator2.forEachRemaining(val -> System.out.println(val));


    }
}
