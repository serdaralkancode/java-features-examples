package tr.salkan.code.java.pure.examples.collectionDifferences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorVSArrayList {

    /*

            Vector      ->  synchronized
            ArrayList   ->  not synchronized

            Vector is thread safe           -> Performance slow
            ArrayList is not thead safe     -> Performance faster

            Vector data Growth              -> %100
            ArrayList data Growth           -> %50

     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        Iterator it = arrayList.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("----------------------");

        Vector<String> vector= new Vector<String>();

        vector.addElement("D");
        vector.addElement("E");
        vector.addElement("F");

        Iterator it2 = vector.iterator();
        while (it2.hasNext())
            System.out.println(it2.next());



    }
}
