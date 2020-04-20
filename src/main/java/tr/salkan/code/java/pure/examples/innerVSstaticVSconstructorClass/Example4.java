package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Example4 {

        {
            System.out.println("1.) Example4 Instance Init Block");
        }

        static {
            System.out.println("1.) Example4 static init block");
        }

        Example4 () {
            System.out.println("Example4 - No-Arg Constructor");
        }

        {
            System.out.println("2.) Example4 Instance Init Block");
        }
}

    class Class2 extends Example4 {

        Class2() {
            System.out.println("Class2 - No-Arg Constructor");
        }

        static {
            System.out.println("1.) Class2 static init block");
        }

        {
            System.out.println("1.) Class2 Instance Init Block");
        }
    }

    class Class3 extends Class2 {

        static {
            System.out.println("1.) Class3 static init block");
        }

        Class3() {
            this(10);
            System.out.println("Class3 - No-Arg Constructor");
        }

        {
            System.out.println("1.) Class3 Instance Init Block");
        }

        Class3(int c) {
            System.out.println(c);
        }

        {
            System.out.println("2.) Class3 Instance Init Block");
        }

        static {
            System.out.println("2.) Class3 static init block");
        }

        public static void main(String[] args) {
            System.out.println("1) Class3 main method");
            Class3 class3 = new Class3();
            System.out.println("2) Class3 main method");

            Class4 cls4Example1 = new Class4();
            Class4 cls4Example2 = new Class4();
        }

    }

    class Class4 {
        static {
            System.out.println("1.) Class4 static init block");
        }

        {
            System.out.println("2.) Class4 Instance Init Block");
        }
    }

    //OUTPUT :
    /*
            1.) Example4 static init block
            1.) Class2 static init block
            1.) Class3 static init block
            2.) Class3 static init block
            1) Class3 main method
            1.) Example4 Instance Init Block
            2.) Example4 Instance Init Block
            Example4 - No-Arg Constructor
            1.) Class2 Instance Init Block
            Class2 - No-Arg Constructor
            1.) Class3 Instance Init Block
            2.) Class3 Instance Init Block
            10
            Class3 - No-Arg Constructor
            2) Class3 main method
            1.) Class4 static init block
            2.) Class4 Instance Init Block
            2.) Class4 Instance Init Block
     */

