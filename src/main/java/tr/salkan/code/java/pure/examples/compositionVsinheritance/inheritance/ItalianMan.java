package tr.salkan.code.java.pure.examples.compositionVsinheritance.inheritance;

public class ItalianMan extends Human {

    @Override
    public void borningInWhere(String location) {
        System.out.println("In general a Italian man born in " + location);
    }

    @Override
    public void eatingSomething(String food) {

        System.out.println("In general a Turkish man eating " + food);
    }

    public void italianManNameExample(String name)
    {
        System.out.println(name);
    }
}
