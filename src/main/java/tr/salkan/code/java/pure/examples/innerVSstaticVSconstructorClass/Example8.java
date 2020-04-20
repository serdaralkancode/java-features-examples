package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Example8 {

    private String privateVar = "I am Example8 variable";

    private void outerPrivateOuter() {
        System.out.println("I am Example8 Method");
    }

    public static void main(String[] args) {
        Example8 example8 = new Example8();
        example8.createLocalInner();
    }

    void createLocalInner() {

        final String finalExample8LocalVariable = "I am final Example8 local variable";

        class LocalInner {
            private void localInnerMethod() {
                System.out.println(privateVar);
                System.out.println(finalExample8LocalVariable);
                outerPrivateOuter();
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.localInnerMethod();
    }
}
