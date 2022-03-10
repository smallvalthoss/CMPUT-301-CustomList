package com.example.simpleparadox.tests;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        Assert.assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Jasper", "AB");
        Assert.assertFalse(list.hasCity(city));
        list.addCity(city);
        Assert.assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Calgary", "AB");
        int listSize = list.getCount();
        list.addCity(city);
        list.deleteCity(city);
        Assert.assertFalse(list.hasCity(city));
        Assert.assertEquals(list.getCount(), listSize);
    }
}
