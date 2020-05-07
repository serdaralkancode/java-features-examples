package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Predicate.primitiveVariations;

import java.util.function.DoublePredicate;

public class DoublePredicateExample {

    public static void main(String[] args) {



        DoublePredicate startsWith1 = doubleVal->{
            if(Double.toString(doubleVal).startsWith("1")){
                return true;
            }
            return false;
        };


        System.out.println(startsWith1.test(10.63));
        System.out.println(startsWith1.test(220.88));


    }
}
