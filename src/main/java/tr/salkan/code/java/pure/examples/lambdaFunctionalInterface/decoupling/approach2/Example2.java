package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.approach2;

import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClass;
import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClassListener;

public class Example2 {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        testClass.setMessage("Hello",new TestClassListenerImpl2());

    }

    //inner class
    static class TestClassListenerImpl2 implements TestClassListener {
        public void displayMessage(String msg) {
            System.out.println("message :  "+ msg);
        }
    }
}
