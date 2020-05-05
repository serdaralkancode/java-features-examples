package tr.salkan.code.java.pure.examples.customAnnotations.targetExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*

         Only use Method but NO CONSTRUCTOR
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TargetMethodExaple {

    String showMethodInfo();
}
