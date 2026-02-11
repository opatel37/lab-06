package com.example.listycity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This has test cases for the methods of CityList
 */
public class CityListTest {

    /**
     * This creates a pretend city list for testing purposes
     * @return
     *      Returns mock city list
     */
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    /**
     * This creates a pretend city object for testing purposes
     * @return
     *      Returns mock city object
     */
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    /**
     * This test the addCity method in CityList
     */
    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.getCities().size());  // Assert we only have 1 city

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);

        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    /**
     * This test if the addCity method correctly throws an exception if the method fails to add the city
     */
    @Test
    void testAddException() {
       CityList cityList = mockCityList();

       City city = new City("Calgary", "Alberta");
       cityList.add(city);

       assertThrows(IllegalArgumentException.class, () -> {
           cityList.add(city);
       });
    }

    /**
     * This tests the getCities method
     */
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();

        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    /**
     * This tests the hasCity method
     */
    @Test
    void testHasCity() {
        CityList cityList = mockCityList();

        City city = new City("Test", "Subject");
        cityList.add(city);

        assertTrue(cityList.hasCity(city));
    }

    /**
     * This test the deleteCity method
     */
    @Test
    void testDeleteCity() {
        CityList cityList = mockCityList();

        City city = new City("Test", "Subject");
        cityList.add(city);

        cityList.deleteCity(city);
        assertFalse(cityList.getCities().contains(city));
    }

    /**
     * This tests if the deleteCity method correctly throws an exception if it fails to delete the city
     */
    @Test
    void testDeleteCityException() {
        CityList cityList = mockCityList();
        City city = new City("Test", "Subject");

        // This asserts that the exception is thrown when deleting a non-existent city
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(city);
        });
    }

    /**
     * This tests the countCities method
     */
    @Test
    void testCountCities() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        City city = new City("Test", "Subject");
        cityList.add(city);

        assertEquals(2, cityList.countCities());
    }
}
