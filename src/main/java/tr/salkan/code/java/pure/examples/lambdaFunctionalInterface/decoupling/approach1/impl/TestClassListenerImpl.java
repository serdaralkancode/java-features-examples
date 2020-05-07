package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.approach1.impl;

import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClassListener;

public class TestClassListenerImpl implements TestClassListener {

    @Override
    public void displayMessage(String msg) {

        System.out.println("message "+ msg);
    }
}
