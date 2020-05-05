package tr.salkan.code.java.pure.examples.customAnnotations.generalExample;


import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface DBColumnField {

    String columnName();

    Class< ?> columnType();

    boolean isPrimaryKey() default false;
}
