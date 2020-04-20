package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Example6 {

    private String privateVariable = "i am private instance variable";
    private static String privateStatic = "I am private static variable";

    public static void main(String[] args) {
        Example6.InnerClass innerRef = new Example6().new InnerClass();
        //InnerClass -> InnerClass access own method
        innerRef.innerTestMethod();

        System.out.println(innerRef.privateInnerVariable);
    }

    private void example6TestMethod() {
        System.out.println("Example6 Test Method");
    }

    private static void example6StaticTestMethod() {
        System.out.println("Example6 Static Test Method");
    }

    class InnerClass {
        private String privateInnerVariable = "I am private inner variable";

        //private static final int val  = 1;    => OK ( static final)
        //private static int val2 = 2;          => NOT ( static )

        // private static final void innerStaticMethod(){ }  => NOT define static method in innerclass

        private void innerTestMethod() {
            // InnerClass -> access Example6 (OuterClass) property
            System.out.println(privateVariable);

            // InnerClass -> access Example6 (OuterClass) static property
            System.out.println(privateStatic);

            // InnerClass -> access Example6 (OuterClass) method
            example6TestMethod();

            // InnerClass -> access Example6 (OuterClass) static method
            example6StaticTestMethod();
        }
    }
}
