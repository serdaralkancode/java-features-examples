package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling;

public class TestClass {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg, TestClassListener testClassListener) {
        message = msg;
        testClassListener.displayMessage(msg);
    }
}
