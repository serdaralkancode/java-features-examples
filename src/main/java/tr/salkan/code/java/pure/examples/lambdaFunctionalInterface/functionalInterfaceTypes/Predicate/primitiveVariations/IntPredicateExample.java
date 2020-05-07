package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Predicate.primitiveVariations;

import java.util.function.IntPredicate;

public class IntPredicateExample {

    public static void main(String[] args) {


        IntPredicate isEven = i->{
            if(i%2==0){
                return true;
            }
            return false;
        };

        System.out.println("Is 20 an even number? : "+isEven.test(20));
        System.out.println("Is 31 an even number? : "+isEven.test(31));
        System.out.println("Is 48 an even number? : "+isEven.test(48));
        System.out.println("Is 101 an even number? : "+isEven.test(101));

    }
}
