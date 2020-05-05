package tr.salkan.code.java.pure.examples.customAnnotations.retentionExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// use this class -> In source code, not use compile and runtime

@Retention(RetentionPolicy.SOURCE)
public @interface ReteintionSourceExampleClass {

    public String person() default "Yusuf Aslan";
    public int age() default 13;               // NOT use -> Integer  (only use primitive)
    public String location();
    public String[] comments();

}
