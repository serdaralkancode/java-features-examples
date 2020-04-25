package tr.salkan.code.java.pure.examples.errorVsexception;

public class StackOverflowExample {

    public static void test(int i)
    {
        if (i == 0)
            return;
        else {
            test(i++);
        }
    }

    public static void main(String[] args) {

       // test(8);              -> If you run ---> Cause StackOverflow
    }
}
