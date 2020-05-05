package tr.salkan.code.java.pure.examples.customAnnotations.inheritedExample.annotation;

import java.lang.annotation.*;

// using @Inherited annotation


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritedAnnotation {

}
