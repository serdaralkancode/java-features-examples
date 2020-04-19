package tr.salkan.code.java.pure.examples.stringVsStringBufferVsStringBuilder;

public class Example {

    /*
        String -> immutable
        StringBuffer and StringBuilder -> mutable

        StringBuffer -> synchronized       (all methods)
        StringBuilder -> not synchronized

        String       -> thread-safe class
        StringBuffer -> thread-safe class
        StringBuilder -> not thread-safe class

        StringBuffer -> slow than StringBuilder
        StringBuilder -> fast than StringBuffer

        Methods (StringBuffer - StringBuilder)

                append()
                insert()
                replace()
                delete()
                reverse()

     */

    public static void main(String[] args) {

        String str = "New String";
        StringBuffer stringBuffer = new StringBuffer("New StringBuffer");
        StringBuilder stringBuilder = new StringBuilder("New StringBuilder");

        long timerStarted;

        timerStarted = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            str += " another string";
        }
        System.out.println("Time concatenations for String : " + (System.currentTimeMillis() - timerStarted) + "ms");

        timerStarted = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringBuffer.append(" another string");
        }
        System.out.println("Time concatenations for StringBuffer : " + (System.currentTimeMillis() - timerStarted) + "ms");

        timerStarted = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(" another string");
        }
        System.out.println("Time concatenations for StringBuilder : " + (System.currentTimeMillis() - timerStarted) + "ms");



    }
}
