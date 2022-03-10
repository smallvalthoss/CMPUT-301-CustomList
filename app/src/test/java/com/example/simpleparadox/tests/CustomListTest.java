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
        list.add(new City("Halifax", "NS"));
        Assert.assertEquals(list.getCount(), listSize+1);
    }

}
