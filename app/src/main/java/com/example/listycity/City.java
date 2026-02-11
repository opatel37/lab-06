package com.example.listycity;

/**
 * This is a class that defines a City
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This constructs an instance of the City class
     * @param city
     *      City name
     * @param province
     *      Province in which city resides in
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This gets city name
     * @return
     *      Returns city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * This gets province name
     * @return
     *      Returns province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * This compares two cities
     * @param o
     *      City object
     * @return
     *      Returns if the cities match
     */
    @Override
    public  int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }


    // The next two methods are written by Gemini 3, Google DeepMind
    // I fed it the requirements for the lab exercise along with the code for the classes
    // 26/02/10, 23:03
    /**
     * This overrides the default equals method to compare city data
     * @param o
     * The object to compare with
     * @return
     * True if the city name and province match, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }

    /**
     * This overrides the default hashCode method
     * @return
     * The hash code of the city
     */
    @Override
    public int hashCode() {
        return java.util.Objects.hash(city, province);
    }
}
