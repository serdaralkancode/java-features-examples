package tr.salkan.code.java.pure.examples.sorting.comparableVsComparator.comparator;

import java.util.Comparator;

public class CityComparator implements Comparator<City> {

    @Override
    public int compare(City c1, City c2) {

        // return c1.getPopulation().compareTo(c2.getPopulation())   -> less population -> more
        return c2.getPopulation().compareTo(c1.getPopulation());     // more population -> less
    }
}
