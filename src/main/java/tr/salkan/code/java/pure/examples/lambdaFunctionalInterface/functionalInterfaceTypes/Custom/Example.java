package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Custom;

import java.util.List;

public class Example {

    public static void main(String[] args) {

        List l1 = List.of(1,5,8,18,7,3,26);
        List l2 = List.of(9,3,30,8,7,55);

        ServiceClass serviceClass = new ServiceClass();

        List<Integer> l3 = serviceClass.getCommonsElementOfLists(l1,l2);

        if(l3.isEmpty())
        {
            System.out.println("not common");
        }
        else
        {
            l3.forEach(v -> System.out.println(v));
        }

    }

}
