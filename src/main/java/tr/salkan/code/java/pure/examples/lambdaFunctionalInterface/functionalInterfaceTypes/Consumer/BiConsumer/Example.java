package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Consumer.BiConsumer;

import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

/*

        *** BiConsumer is a functional interface; it takes two arguments and returns nothing.

        *** void accept(T t, U u)      => method

 */

public class Example {


    static void showInfo(String name, Integer age){
        System.out.println(name+" "+age);
    }

    static void compareNumber(Integer x1,Integer x2)
    {
        if( x1 > x2 )
        {
            System.out.println("x1 bigger");
        }
        else if ( x1 < x2)
        {
            System.out.println(" x2 bigger");
        }
        else
        {
            System.out.println(" x1 and x2 equals");
        }

    }

    static void contentAddToString(String s1, String s2)
    {
        s1  += s2;
    }

    private static <T, U> void visitList(List<T> list, U userObject, BiConsumer<T, U> bc) {
        list.forEach(t -> bc.accept(t, userObject));
    }

    public static void main(String[] args) {


        // referance method
        BiConsumer<String, Integer> biConsumerExample = Example::showInfo;

        biConsumerExample.accept("Hakan", 30);
        biConsumerExample.accept("Oya", 50);

        System.out.println("-------------------------");


        //lambda method
        BiConsumer<String,Integer> biConsumerExample2 = (name, age)->System.out.println(name+" "+age);

        biConsumerExample2.accept("Canan", 18);

        System.out.println("-------------------------");

        BiConsumer<Integer,Integer> biConsumerExample3 = Example::compareNumber;

        biConsumerExample3.accept(5,8);

        System.out.println("-------------------------------");

        BiConsumer<TestClass,List<String>> biConsumerExample4 = (testCls,cmnts) -> {

            if(Objects.nonNull(testCls) && Objects.nonNull(cmnts) && !cmnts.isEmpty())
            {
                testCls.setComments(cmnts);
            }

        };

        TestClass testClass = new TestClass();
        testClass.setId(1l);
        testClass.setName("Kemal");


        // List.of  -> JDK >=9
        List ls = List.of("Comment1","Comment2","Comment3","Comment4");

        biConsumerExample4.accept(testClass,ls);

        System.out.println("Comments : ");

        testClass.getComments().forEach(c -> System.out.println(c));




    }
}