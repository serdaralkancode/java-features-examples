package tr.salkan.code.java.pure.examples.customAnnotations.targetExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*

         Only use parameter Method
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(value= ElementType.PARAMETER)
public @interface TargetParameterExample {

    String parameterValue();
}
