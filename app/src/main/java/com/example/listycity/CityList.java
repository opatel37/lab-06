package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not already exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks whether or not the city list contains the given city
     * @param city
     *      This is the city that we are checking for
     * @return
     *      Return true if the city is contained in the list, false otherwise
     */
    public boolean hasCity(City city) {
        List<City> list = cities;
        return list.contains(city);
    }

    /**
     * This deletes the given city from the city list if it exists in the list
     * @param city
     *      This is the city we want to delete
     */
    public void deleteCity(City city) {
        List<City> list = cities;
        if (!list.contains(city)) {
            throw new IllegalArgumentException("City is not in list :(");
        }
        cities.remove(city);
    }

    /**
     * This counts how many cities are stored in the city list
     * @return
     *      Return the number of cities stored in city list
     */
    public int countCities() {
        return cities.size();
    }
}
