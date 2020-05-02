package tr.salkan.code.java.pure.examples.reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectionExample2 {

    class Test1 {

        private String str = "Test1 str";

        public Test1() {

        }
    }

    private static class Test2 {

        private class Test2InnerClass {

            private int i;

            private Test2InnerClass(int i) {
                this.i = i;
            }
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {

        Class<Test2.Test2InnerClass> c = Test2.Test2InnerClass.class;

        Constructor<Test2.Test2InnerClass> constructor = c.getDeclaredConstructor(Test2.class, int.class);

        System.out.println(constructor);
        System.out.println(constructor.getName());
        System.out.println(Arrays.toString(constructor.getParameters()));

    }
}
