package tr.salkan.code.java.pure.examples.customAnnotations.generalExample;

import java.time.LocalDate;

public class DBTable {

    @DBColumnField(columnName = "id", isPrimaryKey = true, columnType = Long.class)
    private long id;

    @DBColumnField(columnName = "name", columnType = String.class)
    private String name;

    @DBColumnField(columnName = "info", columnType = String.class)
    private String info;

    @DBColumnField(columnName = "insertedDate", columnType = LocalDate.class)
    private LocalDate insertedDate;

    public DBTable(long id, String name, String info, LocalDate insertedDate) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.insertedDate = insertedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public LocalDate getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(LocalDate insertedDate) {
        this.insertedDate = insertedDate;
    }

    @Override
    public String toString() {
        return "DBTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", insertedDate=" + insertedDate +
                '}';
    }
}
