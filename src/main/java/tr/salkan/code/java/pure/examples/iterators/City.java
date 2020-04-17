package tr.salkan.code.java.pure.examples.iterators;

public class City {

    private String name;
    private int code;
    private double population;

    public City(String name, int code, double population) {
        this.name = name;
        this.code = code;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", population=" + population +
                '}';
    }
}
