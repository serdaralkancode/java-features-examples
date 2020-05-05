package tr.salkan.code.java.pure.examples.customAnnotations.retentionExample;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example1 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        AnnotationImplClass annotationImplClass = new AnnotationImplClass();


        testRetentionClass(annotationImplClass);

        testRetentionSource(annotationImplClass);

        testRetentionRuntime(annotationImplClass);
    }

    private static void printDeclaredAnnotations(String str, Method method) {

       for(Annotation a : method.getDeclaredAnnotations())
       {
           System.out.println(str + " : " + a.toString());

           System.out.println("\n");
       }

        System.out.println("------------------------------");
    }

    private static void printAnnotations(String str, Method method) {

        for(Annotation a : method.getAnnotations())
        {
            System.out.println(str + " : " + a.toString());

            System.out.println("\n");
        }

        System.out.println("------------------------------");
    }

    private static void testRetentionRuntime(AnnotationImplClass annotationImplClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method=annotationImplClass.getClass().getMethod("printAnnotationRetentionRuntime");

        printAnnotations("testRetentionRuntime method annotations",method);

        printDeclaredAnnotations("testRetentionRuntime method declared annotations",method);

        if(method.isAnnotationPresent(ReteintionRunTimeExampleClass.class)){

            ReteintionRunTimeExampleClass reteintionRunTimeExampleClass =method.getAnnotation(ReteintionRunTimeExampleClass.class);

            System.out.println("Bilgiler  : "+reteintionRunTimeExampleClass.person() + "- " + reteintionRunTimeExampleClass.age());

            method.invoke(annotationImplClass);
        }
    }

    private static void testRetentionSource(AnnotationImplClass annotationImplClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method=annotationImplClass.getClass().getMethod("printAnnotationRetentionSource");

        printAnnotations("testRetentionSource method annotations",method);

        printDeclaredAnnotations("testRetentionSource method declared annotations",method);

        if(method.isAnnotationPresent(ReteintionSourceExampleClass.class)){

            ReteintionSourceExampleClass reteintionSourceExampleClass =method.getAnnotation(ReteintionSourceExampleClass.class);

            System.out.println("Bilgiler  : "+reteintionSourceExampleClass.person() + "- " + reteintionSourceExampleClass.age());

            method.invoke(annotationImplClass);
        }

    }

    private static void testRetentionClass(AnnotationImplClass annotationImplClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method=annotationImplClass.getClass().getMethod("printAnnotationRetentionClass");

        printAnnotations("testRetentionClass method annotations",method);

        printDeclaredAnnotations("testRetentionClass method declared annotations",method);

        if(method.isAnnotationPresent(ReteintionClassExampleClass.class)){

            ReteintionClassExampleClass reteintionClassExampleClass =method.getAnnotation(ReteintionClassExampleClass.class);

            System.out.println("Bilgiler  : "+reteintionClassExampleClass.person() + "- " + reteintionClassExampleClass.age());

            method.invoke(annotationImplClass);
        }
    }
}
