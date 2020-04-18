package tr.salkan.code.java.pure.examples.mapDifferences;

import java.util.HashMap;

public class HashMapVsConcurrentHashMap extends Thread  {

    /*
            HashMap             -> non-Synchronized,not Thread-safe
            ConcurrentHashMap   -> thread safe without synchronizing

            HashMap             -> performance is better
            ConcurrentHashMap   -> performance is low sometimes

            HasMap              -> Threads process add/remove -> ConcurrentModificationException
            ConcurrentHashMap   -> Threads modify not exception

            HashMap             -> null key and null value -> OK
            ConcurrentHashMap   -> null key and null value -> NOT
     */

    static HashMap<Integer,String> hashMap=new HashMap<Integer,String>();

    public void run()
    {
        try
        {
            Thread.sleep(1000);
            hashMap.put(4,"DDD");
        }
        catch(InterruptedException e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        hashMap.put(1,"AAA");
        hashMap.put(2,"BBB");
        hashMap.put(3,"CCC");
        HashMapVsConcurrentHashMap hashMapVsConcurrentHashMap=new HashMapVsConcurrentHashMap();

        hashMapVsConcurrentHashMap.start();

        for (Object o : hashMap.entrySet())
        {
            Object s=o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(hashMap);

    }
}
