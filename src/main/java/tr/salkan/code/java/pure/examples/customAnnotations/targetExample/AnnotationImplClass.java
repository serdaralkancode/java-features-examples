package tr.salkan.code.java.pure.examples.customAnnotations.targetExample;


@TargetTypeExample(showInfo = "TargetTypeExample annotation ")
public class AnnotationImplClass {

    @TargetFieldExample(showFieldInfo = "name")
    private String name;

    @TargetFieldExample(showFieldInfo = "location")
    private String location;

    @TargetFieldExample(showFieldInfo = "id")
    private int id;

    @TargetConstructorExample(showConstructorInfo = "get constructor method info")
    public AnnotationImplClass(String name, String location, int id) {
        this.name = name;
        this.location = location;
        this.id = id;
    }

    @TargetMethodExaple(showMethodInfo = "get method information")
    public String getInfo()
    {
        return this.name + " - " + this.location + " - " + this.id;
    }

    @TargetMethodExaple(showMethodInfo = "get method information with param")
    public String getInfoParam(@TargetParameterExample(parameterValue = "AnnotationImplClass getInfoParam") String str)
    {
        return this.name + " - " + this.location + " - " + this.id + " - " + str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
