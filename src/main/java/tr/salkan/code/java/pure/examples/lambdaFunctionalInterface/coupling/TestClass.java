package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.coupling;

public class TestClass {

    private String message;

    public void setMessage(String msg) {
        message = msg;
        displayMessage(msg);
    }

    public void displayMessage(String msg) {
        System.out.println("message :  "+ msg);
    }
}
