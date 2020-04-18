package tr.salkan.code.java.pure.examples.collectionDifferences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListVSArrayList {

    /*
            LinkedList   -> Add/Remove Fast
            ArrayList    -> Access Fast, Add/Remove Slow. A lot shifting operation

     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);

        Iterator iter1 = arrayList.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        arrayList.add(1,2);    //a lot shifting operation

        System.out.println("------------------------");

        Iterator iter2 = arrayList.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }

        System.out.println("------------------------");

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);


        Iterator iter3 = linkedList.iterator();
        while (iter3.hasNext()) {
            System.out.println(iter3.next());
        }

    }
}
