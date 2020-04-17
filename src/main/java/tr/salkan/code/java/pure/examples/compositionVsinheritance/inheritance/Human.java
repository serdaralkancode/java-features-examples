package tr.salkan.code.java.pure.examples.compositionVsinheritance.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Human {

    public void borningInWhere(String location){

        System.out.println("Human borning somewhere");
    }

    public void eatingSomething(String food)
    {
        System.out.println("Human eating something");
    }

    List<String> getBodyActivities()
    {
        List<String> bodyActivities = new ArrayList<>();

        bodyActivities.add("Running");
        bodyActivities.add("Walking");
        bodyActivities.add("Jumping");

        return bodyActivities;
    }

    List<String> getMentalActivities() {

        List<String> mentalActivities = new ArrayList<>();

        mentalActivities.add("Thinking");
        mentalActivities.add("Estimating");
        mentalActivities.add("Imaging");

        return mentalActivities;
    }

}
