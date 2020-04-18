package tr.salkan.code.java.pure.examples.mapDifferences;

import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsConcurrentHashMap2 extends Thread{

    static ConcurrentHashMap<Integer,String> concurrentHashMap =
            new ConcurrentHashMap<Integer,String>();

    public void run()
    {
        concurrentHashMap.put(4,"DDD");

        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        concurrentHashMap.put(1,"AAA");
        concurrentHashMap.put(2,"BBB");
        concurrentHashMap.put(3,"CCC");
        HashMapVsConcurrentHashMap2 hashMapVsConcurrentHashMap2 = new HashMapVsConcurrentHashMap2();
        hashMapVsConcurrentHashMap2.start();

        for (Object o : concurrentHashMap.entrySet())
        {
            Object s=o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(concurrentHashMap);
    }
}
