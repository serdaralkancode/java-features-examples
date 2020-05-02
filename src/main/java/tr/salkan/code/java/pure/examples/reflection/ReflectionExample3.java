package tr.salkan.code.java.pure.examples.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample3 {

    /*
            getConstructor()        -> public Constructor
            getDeclaredConstructor  -> any acess Constructor   (public,private,protected )
     */

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {


        Class testclz = Class.forName("tr.salkan.code.java.pure.examples.reflection.TestReflectionClass");

        System.out.println(testclz);
        Constructor<?> constructor = testclz.getConstructor();

        System.out.println(constructor);

        Class[] parameterType = new Class[1];
        parameterType[0] = int.class;

        System.out.println(TestReflectionClass.class.getDeclaredConstructor(parameterType));

        Constructor<TestReflectionClass> constructorParam = testclz.getDeclaredConstructor(new Class[] {int.class});

        System.out.println(constructorParam);

        Constructor[] constructors = testclz.getDeclaredConstructors();

        System.out.println("----------------------------------------");

        for (Constructor c : constructors) {

            String name = c.getName();
            System.out.println("Constructor name= " + name);

            Class[] paramterTypes = c.getParameterTypes();
            for (Class p : paramterTypes) {
                System.out.println("Param type name = " + p.getName());
            }
            System.out.println("----------------------------------------");
        }


    }
}
