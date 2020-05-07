package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.approach1;

import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClass;
import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.approach1.impl.TestClassListenerImpl;

public class Example1 {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        testClass.setMessage("Hello", new TestClassListenerImpl());

    }
}
