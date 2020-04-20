package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Person {

    private Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public class Employee {

        private Long empId;
        private String empName;
        private Integer age;


        public Employee(Long empId, String empName, Integer age) {
            this.empId = empId;
            this.empName = empName;
            this.age = age;
        }

        public int findBirtYear(Integer nowYear)
        {
            return nowYear - this.age;
        }

        public Long getEmpId() {
            return empId;
        }

        public void setEmpId(Long empId) {
            this.empId = empId;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
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
}
