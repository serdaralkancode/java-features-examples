package tr.salkan.code.java.pure.examples.customAnnotations.retentionExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// use this class -> In source,compile and runtime

@Retention(RetentionPolicy.RUNTIME)
public @interface ReteintionRunTimeExampleClass {

    public String person() default "Ali Kaya";
    public int age() default 18;               // NOT use -> Integer  (only use primitive)
    public String location();
    public String[] comments();
}
