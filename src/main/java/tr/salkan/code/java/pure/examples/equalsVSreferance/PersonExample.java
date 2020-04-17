package tr.salkan.code.java.pure.examples.equalsVSreferance;

public class PersonExample {

    public static void main(String[] args) {

        Person person1 = new Person("Ali",35);
        Person person2 = new Person("Kemal",18);
        Person person3 = person1;
        Person person4 = new Person("Kemal",18);

        Person person5 = new Person("Canan",20);
        Person woman = new Woman("Canan",20);   // attention line 63

        Man man = new Man("Mustafa",50);
        Person person6 = man;

        Person person7 = new Person("Hamdi",80);
        Person man2 = new Man("Hamdi",80);


        if(person1 == person2)          // referance equavalent
        {
            System.out.println("Person 1 ve Person 2 referance equal");
        }

        if(person1.equals(person2))      //value equavalent
        {
            System.out.println("Person 1 ve Person 2 value equal");
        }

        System.out.println("-------------------");

        if(person1 == person3)          // referance equavalent
        {
            System.out.println("Person 1 ve Person 3 referance equal");
        }

        if(person1.equals(person3))          // referance equavalent
        {
            System.out.println("Person 1 ve Person 3 value equal");
        }

        System.out.println("-------------------");

        if(person2 == person4)          // referance equavalent
        {
            System.out.println("Person 2 ve Person 4 referance equal");
        }

        if(person2.equals(person4))      //value equavalent
        {
            System.out.println("Person 2 ve Person 4 value equal");
        }

        System.out.println("-------------------");

        if(person5 == woman)          // referance equavalent
        {
            System.out.println("Person 5 ve woman referance equal");
        }

        if(person5.equals(woman))      //value equavalent ----- attention Woman equals method
        {
            System.out.println("Person 5 ve woman value equal");
        }

        System.out.println("-------------------");

        if(person6 == man)          // referance equavalent
        {
            System.out.println("Person 6 ve man referance equal");
        }

        if(person6.equals(man))      //value equavalent
        {
            System.out.println("Person 6 ve man value equal");
        }

        System.out.println("-------------------");

        if(person7 == man2)          // referance equavalent
        {
            System.out.println("Person 7 ve man2 referance equal");
        }

        if(person7.equals(man2))      //value equavalent
        {
            System.out.println("Person 7 ve man2 value equal");
        }

        //change person3 value
        person3.setAge(60);

        System.out.println("person3 values :" + person3.getName() + "-" + person3.getAge());

        // is change Person1 age?
        System.out.println("person1 values :" + person1.getName() + "-" + person1.getAge());

    }
}
