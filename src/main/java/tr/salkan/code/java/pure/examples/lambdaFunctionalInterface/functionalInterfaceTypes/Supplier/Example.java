package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Supplier;

/*


    Accepts no inputs and returns a value of type T	   =>      T get()

 */

import java.util.Random;
import java.util.function.Supplier;

public class Example {

    public static void main(String[] args) {

        Random random = new Random();
        Supplier<Integer> s1 = () -> random.nextInt(10);
        System.out.println(s1.get());

        Supplier<TestClass> s2 = TestClass::new;

        TestClass t = s2.get();

        t.getComments().forEach(c -> System.out.println(c));


    }


}
