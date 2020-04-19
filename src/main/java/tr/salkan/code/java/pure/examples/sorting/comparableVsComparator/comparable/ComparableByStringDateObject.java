package tr.salkan.code.java.pure.examples.sorting.comparableVsComparator.comparable;

import java.time.LocalDate;
import java.util.Objects;

public class ComparableByStringDateObject implements Comparable<ComparableByStringDateObject> {

    private Long id;
    private String name;
    private LocalDate ldt;

    public ComparableByStringDateObject(Long id, String name, LocalDate ldt) {
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
    public int compareTo(ComparableByStringDateObject o) {
        int comp = this.getName().compareTo(o.getName());

        return comp != 0? comp : this.ldt.compareTo(o.getLdt()) ;
    }

    @Override
    public String toString() {
        return "ComparableByStringObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ldt=" + ldt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparableByStringDateObject that = (ComparableByStringDateObject) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(ldt, that.ldt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ldt);
    }
}
