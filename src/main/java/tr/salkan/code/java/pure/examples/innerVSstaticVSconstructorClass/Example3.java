package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Example3 {

    final static int variable0;

    // final static int variable5;   // compiler error
                                // Because final static property now assign a value
                                // or assign a value in static block
                                // not assign a value and compile error

    static int variable7;
    static {
        int variable1 = 20;
        // static int variable2=30;          //con not define static variable in static class .
        final int variable3 = 40;
        variable0 = 40;
        variable7 = 10;
    }

    {
        int variable6 = 20;
        variable7 = 30;

    }

    public static void main(String[] args) {

        System.out.println(variable0);
        System.out.println(Example3.variable0);
        System.out.println(variable7);
        System.out.println(Example3.variable7);

        // System.out.println(variable1); //compile error
        // System.out.println(variable3); /compile error
        // System.out.println(variable6); //compile error
    }
}
