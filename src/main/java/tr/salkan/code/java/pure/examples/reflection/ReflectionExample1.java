package tr.salkan.code.java.pure.examples.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TestClass
{

    private String stringValue;

    public TestClass()  {  stringValue = "TestClass"; }


    public void testMethod1()  {
        System.out.println("TestClass, public testMethod1 method call and  private string value :  " + stringValue);
    }


    public void testMethod2(int n)  {
        System.out.println("TestClass, public testMethod2 method call with arg  : " + n);
    }

    private void testMethod3() {
        System.out.println("TestClass, private testMethod3 call");
    }
}

public class ReflectionExample1 {


    public static void main(String[] args) {

        TestClass testClass = new TestClass();

        Class cls = testClass.getClass();

        System.out.println("class name  : " + cls.getName());

        System.out.println("--------------------------");
        try
        {
            Constructor constructor = cls.getConstructor();

            System.out.println(" class constructor name : " + constructor.getName());
        }
        catch (NoSuchMethodException e)
        {
            System.out.println("getConstructor exception : " + e.getMessage());
        }

        System.out.println("--------------------------");

        //methods of class
        Method[] methods = cls.getMethods();

        for (Method method:methods)
        {
            System.out.println("class method : " + method.getName());
        }

        System.out.println("--------------------------");

        try
        {
            // NoSuchMethodException
            Method testMethod1Call = cls.getDeclaredMethod("testMethod1");

            //IllegalAccessException and InvocationTargetException
            testMethod1Call.invoke(testClass);
        }
        catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e)
        {
            System.out.println(" error : " + e.getMessage());
        }

        System.out.println("--------------------------");

        try
        {
            // NoSuchMethodException
            Method testMethod2Call = cls.getDeclaredMethod("testMethod2", int.class);

            //IllegalAccessException and InvocationTargetException
            testMethod2Call.invoke(testClass, 10);
        }
        catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e)
        {

            System.out.println(" error : " + e.getMessage());
        }

        System.out.println("--------------------------");

        try
        {
            //get property  -> NoSuchFieldException
            Field field = cls.getDeclaredField("stringValue");

            field.setAccessible(true);

            //new value set property  -> IllegalAccessException
            field.set(testClass, "TestClass field set new value");
        }
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            System.out.println("error : " + e.getMessage());
        }

        System.out.println("--------------------------");

        try
        {
            Method testMethod3Call = cls.getDeclaredMethod("testMethod3");

            testMethod3Call.setAccessible(true);

            testMethod3Call.invoke(testClass);
        }
        catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e)
        {
            System.out.println("error : " + e.getMessage());
        }


    }


}
