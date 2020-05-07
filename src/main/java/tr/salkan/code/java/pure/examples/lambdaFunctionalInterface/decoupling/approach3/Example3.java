package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.approach3;

import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClass;
import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClassListener;

public class Example3 {

    public static void main(String[] args) {

        Example3 example3 = new Example3();
        example3.process();

    }

    public void process() {

        //local inner class
        class TestClassListenerImpl3 implements TestClassListener {
            public void displayMessage(String msg) {
                System.out.println("message :  "+ msg);
            }
        }


        TestClass testClass = new TestClass();
        testClass.setMessage("Hello",new TestClassListenerImpl3());


    }
}
