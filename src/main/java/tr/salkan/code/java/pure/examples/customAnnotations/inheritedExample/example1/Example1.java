package tr.salkan.code.java.pure.examples.customAnnotations.inheritedExample.example1;

import tr.salkan.code.java.pure.examples.customAnnotations.inheritedExample.annotation.InheritedAnnotation;
import tr.salkan.code.java.pure.examples.customAnnotations.inheritedExample.annotation.NoInheritedAnnotation;

public class Example1 {

    /*

        A super class annotated with @inherited annotation, subclass of super class inherited this annotation

        doesn't work methods, constructors, fields

     */


    public static void main(String[] args) {

        NoInheritedAnnotation noInheritedAnnotation = SubClass.class.getAnnotation(NoInheritedAnnotation.class);
        System.out.println("not using @inherited annotation :" + noInheritedAnnotation);  //null

        InheritedAnnotation inheritedAnnotation = SubClass.class.getAnnotation(InheritedAnnotation.class);
        System.out.println("using @inherited annotation :" + inheritedAnnotation);

    }
}
