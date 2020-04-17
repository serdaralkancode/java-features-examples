package tr.salkan.code.java.pure.examples.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

     /*
        METHODS

            hasNext()
			next()
			remove()
			hasPrevios()
			previos()
		    nextIndex()
			set()
			add()

		USING

		    Only List
		    CREATE, READ, UPDATE and DELETE   -> Yes
		    TRAVERSE            -> Forward and Backward direction
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("İstanbul");
        list.add("Ankara");
        list.add("Konya");

        ListIterator<String> listIterator = list.listIterator();

        //forward
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("------------------");

        //backward
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("------------------");

        //set
        ListIterator<String> listIterator2 = list.listIterator();

        listIterator2.next();
        listIterator2.set("İzmir");          //modify

        list.forEach(System.out::println);
    }
}
