package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Predicate;


/*

        - Contains test() method which takes one argument and returns boolean

 */

import java.util.function.Predicate;

public class Example {


    public static void main(String[] args) {

        String str = "Java and Python are most popular programmer languages";

        //Predicate defined
        Predicate<String> p = s->s.contains("and");

        boolean b = p.test(str);

        System.out.println("Predicate test result : " + b);


        System.out.println("--------------------------------------------------------");

        Predicate<TestClass> p2 = testClass->testClass.getType().equals("Type1");

        Predicate<TestClass> p3 = testClass->
        {
            if(testClass.getType().equals("Type1") && testClass.getVal() > 150)
            {
                return true;
            }
            return false;
        };

        Predicate<TestClass> p4 = testClass->testClass.getVal() > 100;

        TestClass tcls1 = new TestClass("Type1 Test Class","Type1",100);
        TestClass tcls2 = new TestClass("Type2 Test Class","Type2",150);
        TestClass tcls3 = new TestClass("Type1 Test Class","Type1",200);


        System.out.println("Test Class Tyoe 1 : " + p2.test(tcls1)) ;
        System.out.println("Test Class Tyoe 2 : " + p2.test(tcls2)) ;

        System.out.println("Test Class Tyoe1 tcls1 and Value test : " + p3.test(tcls1)) ;
        System.out.println("Test Class Tyoe2 tcls2 and Value test : " + p3.test(tcls2)) ;
        System.out.println("Test Class Tyoe1 tcls3 and Value test : " + p3.test(tcls3)) ;


        System.out.println("--------------------------Multi Predicate------------------------------");

        // and   type1 and val > 100
        Predicate<TestClass> p5 = p2.and(p4);

        System.out.println("Test Class Tyoe1 tcls1 and Value test : " + p5.test(tcls1)) ;
        System.out.println("Test Class Tyoe2 tcls2 and Value test : " + p5.test(tcls2)) ;
        System.out.println("Test Class Tyoe1 tcls3 and Value test : " + p5.test(tcls3)) ;


        System.out.println("--------------------------------------------------------------------------");

        // or  type1 or val > 100
        Predicate<TestClass> p6 = p2.or(p4);

        System.out.println("Test Class Tyoe1 tcls1 and Value test : " + p4.test(tcls1)) ;
        System.out.println("Test Class Tyoe2 tcls2 and Value test : " + p4.test(tcls2)) ;
        System.out.println("Test Class Tyoe1 tcls3 and Value test : " + p4.test(tcls3)) ;


    }


}
