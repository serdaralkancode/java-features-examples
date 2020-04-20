package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Example1 {

    static {
        System.out.println("Static Initialization Block");
    }

    {
        System.out.println("Instance Initialization Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Class");
        Example1 ins1 = new Example1();
        Example1 ins2 = new Example1();
    }

    //OUTPUT :
    /*
            - Static Initialization Block
            - Main Class
            - Instance Initialization Block
            - Instance Initialization Block

     */

}
