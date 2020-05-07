package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.lambdaApproach;

import tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.decoupling.TestClass;

public class ExampleLambda {

    public static void main(String[] args) {

        ExampleLambda exampleLambda = new ExampleLambda();
        exampleLambda.process();

    }

    private void process() {

        TestClass testClass = new TestClass();

        //lambda
        testClass.setMessage("Hello",
                                    (String msg) -> System.out.println("msg "+ msg));
    }
}
