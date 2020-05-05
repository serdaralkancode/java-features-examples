package tr.salkan.code.java.pure.examples.customAnnotations.targetExample;

/*

         Only use Class, Interface or Enum
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TargetTypeExample {

    public String showInfo();



}
