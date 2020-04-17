package tr.salkan.code.java.pure.examples.compositionVsinheritance.inheritance;

public class HumanExample {

    public static void main(String[] args) {

        Human turkishMan = new TurkishMan();

        turkishMan.borningInWhere("Turkey"); //overide
        turkishMan.eatingSomething("Kebap");    //override
        turkishMan.getBodyActivities().forEach(System.out::println);  //super method

        ((TurkishMan)turkishMan).turkishManNameExample("Ahmet");  // method in TurkishMan class

        Human italianMan = new ItalianMan();

        turkishMan.borningInWhere("Italy"); //overide
        turkishMan.eatingSomething("Spaghetti"); //overide
        italianMan.getMentalActivities().forEach(System.out::println); //super method

        ((ItalianMan)italianMan).italianManNameExample("Del Pierro");  // method in ItalianMan class


    }
}
