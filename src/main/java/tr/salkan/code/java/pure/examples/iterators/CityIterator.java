package tr.salkan.code.java.pure.examples.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityIterator implements Iterable {

    private List<City> cities = null;

    public CityIterator() {

        cities = new ArrayList<>();

        cities.add(new City("İstanbul",34,17.2));
        cities.add(new City("Ankara",6,8.4));
        cities.add(new City("Konya",42,3.1));
    }


    @Override
    public Iterator<City> iterator() {
        return cities.iterator();
    }
}
