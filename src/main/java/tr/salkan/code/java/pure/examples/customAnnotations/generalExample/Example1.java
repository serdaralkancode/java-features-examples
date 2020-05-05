package tr.salkan.code.java.pure.examples.customAnnotations.generalExample;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Example1 {

    public static void main(String[] args) throws IllegalAccessException {

        DBTable dbTable = new DBTable(1l,"AAA","AAA info", LocalDate.now());

        for (Field field : dbTable.getClass().getDeclaredFields()) {

            DBColumnField dbColumnField = field.getAnnotation(DBColumnField.class);

            System.out.println("field name: " + dbColumnField.columnName());

            field.setAccessible(true);

            Object value = field.get(dbTable);
            System.out.println("field value: " + value);

            System.out.println("field type: " + dbColumnField.columnType());
            System.out.println("is primary: " + dbColumnField.isPrimaryKey());

        }

    }
}
