package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Consumer;


/*

 *** Consumer is a functional interface; it takes one arguments and returns nothing.

 *** void accept(T t)      => method

 */


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Example {

    public static void main(String[] args) {

        Consumer<List<TestClass>> consumer = list -> {

            AtomicInteger val = new AtomicInteger(10);
            list.forEach(e -> {

                val.set((val.get() + 1) * val.get());

                e.setId(val.get());

                long startTime = System.nanoTime();

                e.setCode(val + "-" + String.valueOf(startTime));

            });

        };

        List<TestClass> list = List.of(new TestClass(),new TestClass(),new TestClass());

        consumer.accept(list);

        list.forEach(l -> {

            System.out.println("id : " + l.getId() + " code : " + l.getCode() + " hashCode : " + l.getObjectHashCode());

        });


    }

}
