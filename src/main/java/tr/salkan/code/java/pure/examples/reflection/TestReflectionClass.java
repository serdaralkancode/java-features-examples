package tr.salkan.code.java.pure.examples.reflection;

public class TestReflectionClass {

    public TestReflectionClass() {

        System.out.println("TestReflectionClass default constructor");
    }

    public TestReflectionClass(int a){
        System.out.println("TestReflectionClass Constructor int  : "+a);
    }

    private TestReflectionClass(String s){
        System.out.println("TestReflectionClass Constructor string  : "+s);
    }

    protected TestReflectionClass(Long l){
        System.out.println("TestReflectionClass Constructor Long  : "+l);
    }
}
