package tr.salkan.code.java.pure.examples.customAnnotations.retentionExample;

public class AnnotationImplClass {

    @ReteintionClassExampleClass(person = "Serdar ALKAN",age = 35,location = "Ankara",comments = {"Comment1","Comment2"})
    public void printAnnotationRetentionClass() {

        System.out.println(" AnnotationImplClass printAnnotation call with @Reteintion ->Class ");
    }

    @ReteintionSourceExampleClass(person = "Senem Doğan",age = 28,location = "İstanbul",comments = {"Comment3","Comment4"})
    public void printAnnotationRetentionSource() {

        System.out.println(" AnnotationImplClass printAnnotation call with @Reteintion ->Source ");
    }

    @ReteintionRunTimeExampleClass(person = "Ayşe Kara",age = 19,location = "İstanbul",comments = {"Comment5","Comment6"})
    public void printAnnotationRetentionRuntime() {

        System.out.println(" AnnotationImplClass printAnnotation call with @Reteintion ->Runtime ");
    }


}
