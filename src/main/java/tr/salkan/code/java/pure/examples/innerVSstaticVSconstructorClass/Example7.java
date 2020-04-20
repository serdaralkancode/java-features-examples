package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Example7 {

    // defined interface
    interface NestedInterface {
        void nestedMethod();
    }

}

class Example implements Example7.NestedInterface {

    @Override
    public void nestedMethod() {		// Override Nested interfacede

    }

}
