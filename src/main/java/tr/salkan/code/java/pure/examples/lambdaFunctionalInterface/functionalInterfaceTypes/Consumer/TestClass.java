package tr.salkan.code.java.pure.examples.lambdaFunctionalInterface.functionalInterfaceTypes.Consumer;

public class TestClass {

    private Integer id;
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getObjectHashCode()
    {
        return this.id + "-" + this.code;
    }
}
