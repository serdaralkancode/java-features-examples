package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Function;

/*

        -- R apply(T t);

 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Example {

    public static void main(String[] args) {

        Map<Long,String> objMap = new HashMap<>();

        objMap.put(1l,"Serdar");
        objMap.put(2l,"Osman");
        objMap.put(3l,"Handan");


        Function<Map, List<TestClass>> function = (map) ->
        {
           List<TestClass> list = new ArrayList<>();

           map.forEach((k,v) -> {

               TestClass t = new TestClass((Long)k,(String)v);

               list.add(t);

           });

            return list;
        };


       List<TestClass> tList =  function.apply(objMap);

       tList.forEach(t -> System.out.println(t));
    }


}
