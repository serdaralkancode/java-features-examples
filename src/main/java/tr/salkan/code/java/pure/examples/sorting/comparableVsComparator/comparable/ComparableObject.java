package tr.salkan.code.java.pure.examples.sorting.comparableVsComparator.comparable;

import java.time.LocalDate;
import java.util.Objects;

public class ComparableObject implements Comparable<ComparableObject> {

    // override compareTo method

    private Long id;
    private String name;
    private LocalDate ldt;

    public ComparableObject(Long id, String name, LocalDate ldt) {
        this.id = id;
        this.name = name;
        this.ldt = ldt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLdt() {
        return ldt;
    }

    public void setLdt(LocalDate ldt) {
        this.ldt = ldt;
    }


    @Override
    public int compareTo(ComparableObject o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparableObject that = (ComparableObject) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(ldt, that.ldt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ldt);
    }

    @Override
    public String toString() {
        return "ComparableObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ldt=" + ldt +
                '}';
    }
}
