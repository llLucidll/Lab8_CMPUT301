package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;

    }
    public City MockCity() {
        return new City("Estevan", "SK");
    }
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
    @Test
    public void getCountTest() {
        list = MockCityList();
        assertEquals(list.getCount(), 0);
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), 1);
    }
    @Test
    public void hasCityTest() {
        list = MockCityList();
        assertFalse(list.hasCity(new City("Estevan", "SK")));
    }
    @Test
    public void deleteCityTest() {
        City city = MockCity();
        list = MockCityList();
        list.addCity(city);
        assertEquals(list.getCount(), 1);
        list.deleteCity(city);
        assertEquals(list.getCount(), 0);
    }



}
