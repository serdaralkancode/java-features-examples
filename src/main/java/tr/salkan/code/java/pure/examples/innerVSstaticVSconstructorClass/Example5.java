package tr.salkan.code.java.pure.examples.innerVSstaticVSconstructorClass;

public class Example5 {

    public static void main(String[] args) {

        Person person = new Person(1l,"Kamil");

        Person.Employee emp1 = person.new Employee(100l,"Ahmet",34);

        int bdYear = emp1.findBirtYear(2020);

        System.out.println("Birth Year :" + bdYear);

        //ERROR
        //Person.Employee emp = new Person.Employee(100l,"Ahmet",34);

        //ERROR
        //Person.Employee emp = new person.Employee(100l,"Ahmet",34);

        Person.Employee emp2 = new Person(2l,"Can").new Employee(200l,"Can",25);

        int bdYear2 = emp2.findBirtYear(2020);

        System.out.println("Birth Year :" + bdYear2);
    }


}
