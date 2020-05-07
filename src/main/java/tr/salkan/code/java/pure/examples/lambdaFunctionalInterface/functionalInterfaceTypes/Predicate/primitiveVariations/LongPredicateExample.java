package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Predicate.primitiveVariations;

import java.util.function.LongPredicate;

public class LongPredicateExample {

    public static void main(String[] args) {

        LongPredicate isEven = longVal->{
            if(Long.toString(longVal).length()%2==0){
                return true;
            }
            return false;
        };


        System.out.println(isEven.test(2003L));
        System.out.println(isEven.test(745899234L));

    }
}
