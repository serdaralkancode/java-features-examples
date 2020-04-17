package tr.salkan.code.java.pure.examples.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    /*
        METHODS

            hasNext()
		    next()
		    remove()

		USING

		    All Collections
		    READ AND REMOVE     -> YES
		    INSERT AND UPDATE   -> NO
		    TRAVERSE            -> Forward direction
     */


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("İstanbul");
        list.add("Ankara");
        list.add("Konya");

        Iterator<String> cityIterator = list.iterator();

        while(cityIterator.hasNext()){
            System.out.println(cityIterator.next());
        }

        System.out.println("------------------");

        CityIterator cityIterator1 = new CityIterator();
        for(Object city : cityIterator1){
            System.out.println(((City)city).getName());
        }
    }
}
