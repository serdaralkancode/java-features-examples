package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Example2 {

    Example2() {
        System.out.println("Default Constructor");
    }

    static {
        System.out.println("1 - Static Block");
    }

    {
        System.out.println("1 - Instance Block");
    }

    static {
        System.out.println("2 - Static Block");
    }

    {
        System.out.println("2 - Instance Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Class");

        Example2 ins1 = new Example2();
        Example2 ins2 = new Example2();
    }

    //OUTPUT :
    /*
            1 - Static Block
			2 - Static Block

			Main Class

			1 - Instance Block
			2 - Instance Block
			Default Constructor

			1  Instance Block
			2 - Instance Block
			Default Constructor

     */
}
