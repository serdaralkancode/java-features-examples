package tr.salkan.code.java.pure.examples.customAnnotations.targetExample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example1 {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Class[] classes = {AnnotationImplClass.class};

        for (Class classObj : classes) {


            for(Method m : classObj.getMethods())
            {
                System.out.println("Method : " + m.getName() + "\n");

                for(Annotation methodannotation : m.getAnnotations())
                {
                    System.out.println("Method Annotation : " + methodannotation.toString() + " \n");
                }

            }

            for(Annotation annotations : classObj.getAnnotations())
            {
                System.out.println("Annotation : " + annotations.toString() + "\n");
            }

            for(Field field : classObj.getDeclaredFields())
            {

                for(Annotation fieldAnnotation : field.getAnnotations())
                {
                    System.out.println("field name : " + field.getName() + " " + fieldAnnotation.toString() +  "\n");
                }


            }

        }

    }
}
