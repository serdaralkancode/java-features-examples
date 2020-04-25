package tr.salkan.code.java.pure.examples.errorVsexception;

import java.util.ArrayList;
import java.util.List;

public class UnCheckedExceptionExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // i <= list.size()    -> i == list.size() -> IndexOutOfBoundsException
        for(int i = 0; i<= list.size(); i++)
        {
            System.out.println(list.get(i));
        }



    }
}
