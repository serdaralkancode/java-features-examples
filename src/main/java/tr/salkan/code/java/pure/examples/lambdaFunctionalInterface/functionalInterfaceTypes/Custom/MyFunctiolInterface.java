package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Custom;

import java.util.List;

@FunctionalInterface
public interface MyFunctiolInterface {

    /*
            List<K>  -> First List  input
            List<L>  -> Second List input
            List<K>  -> Commons Element List output

     */

     <K,L> List<K> commonElementOfLists(List<K> list1,List<L> list2);
}
