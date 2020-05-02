package tr.salkan.code.java.pure.examples.reflection;

public class IsInstanceVsInstanceof {

    /*
            isInstance -> class is decided at run time. (late binding) e.g.
            instanceof -> you need to know the exact class at compile time.
     */

    public static void main(String[] args) {

        TestExampleCls obj1 = new TestExampleCls(1,"A");

        Integer i = 4;
        String s = "Hello";

        if(obj1 instanceof TestExampleCls)
        {
            System.out.println("Yes TestExampleCls");
        }

        // it is error in compile time -> IDE warn -> Cannot cast Integer
//        if(obj1 instanceof Integer)
//        {
//
//        }


          // it is error in compile time -> IDE warn -> Cannot cast TestExampleCls
//        if(i instanceof TestExampleCls)
//        {
//
//        }

        try
        {
           boolean intComp =  isInstanceTest(i,"java.lang.Integer");
           boolean strComp =  isInstanceTest(s,"java.lang.String");

            System.out.println(" intComp : " + intComp + " strComp :" + strComp);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }

    private static boolean isInstanceTest(Object obj, String str) throws ClassNotFoundException {

        return Class.forName(str).isInstance(obj);
    }

}
