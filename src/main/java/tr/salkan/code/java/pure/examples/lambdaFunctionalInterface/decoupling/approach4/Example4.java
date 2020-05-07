package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.approach4;

import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClass;
import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClassListener;

public class Example4 {

    public static void main(String[] args) {

        Example4 example4 = new Example4();
        example4.process();
        
        
    }

    private void process() {

        TestClass testClass = new TestClass();


        //anonymous class
        testClass.setMessage("Hello",
                            new TestClassListener() {

                                    @Override
                                    public void displayMessage(String msg) {

                                        System.out.println("message :  "+ msg);
                                    }
                            });

    }
}
