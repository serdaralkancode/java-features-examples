package tr.salkan.code.java.pure.examples.customAnnotations.inheritedExample.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// not using @Inherited annotation

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoInheritedAnnotation {

}
