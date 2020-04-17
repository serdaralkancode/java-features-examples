package tr.salkan.code.java.pure.examples.equalsVSreferance;

public class Man extends Person {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
