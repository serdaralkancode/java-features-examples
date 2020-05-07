package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Custom;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceClass {

    public <K,L> List<K> getCommonsElementOfLists (List<K> list1, List<L> list2)
    {

        MyFunctiolInterface myFunctiolInterface = new MyFunctiolInterface() {

            @Override
            public <K, L> List<K> commonElementOfLists(List<K> list1, List<L> list2) {

                List<K> listOneList = list1.stream().filter(l1 -> list2.stream()
                        .anyMatch(l2 -> l2.equals(l1))).collect(Collectors.toList());

                return listOneList;

            }
        };

        return myFunctiolInterface.commonElementOfLists(list1,list2);
    }

}
