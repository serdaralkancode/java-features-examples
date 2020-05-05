package tr.salkan.code.java.pure.examples.customAnnotations.inheritedExample.example2;

import tr.salkan.code.java.pure.examples.customAnnotations.inheritedExample.annotation.InheritedAnnotation;
import tr.salkan.code.java.pure.examples.customAnnotations.inheritedExample.annotation.NoInheritedAnnotation;

public class Example1 {

    public static void main(String[] args) {

        System.out.println(new BaseClass().getClass().getAnnotation(InheritedAnnotation.class));

        System.out.println(new SubBaseClass().getClass().getAnnotation(InheritedAnnotation.class));

        System.out.println(new SubClass().getClass().getAnnotation(InheritedAnnotation.class));

        System.out.println("--------------------------------------------------");

        System.out.println(new BaseClass().getClass().getAnnotation(NoInheritedAnnotation.class));

        System.out.println(new SubBaseClass().getClass().getAnnotation(NoInheritedAnnotation.class));

        System.out.println(new SubClass().getClass().getAnnotation(NoInheritedAnnotation.class));

    }
}
