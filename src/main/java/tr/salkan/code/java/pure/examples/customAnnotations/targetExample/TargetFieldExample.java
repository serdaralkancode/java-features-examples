package tr.salkan.code.java.pure.examples.customAnnotations.targetExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*

         Only use property
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TargetFieldExample {

    String showFieldInfo();
}
