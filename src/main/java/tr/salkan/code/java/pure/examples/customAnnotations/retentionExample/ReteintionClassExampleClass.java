package tr.salkan.code.java.pure.examples.customAnnotations.retentionExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// use this class -> In compile time, not use runtime

@Retention(RetentionPolicy.CLASS)
public @interface ReteintionClassExampleClass {

    public String person() default "Pelin Kara";
    public int age() default 30;               // NOT use -> Integer  (only use primitive)
    public String location();
    public String[] comments();
}
