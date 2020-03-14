package org.example;


import org.junit.Test;

import org.junit.runner.RunWith;

import java.awt.List;
import  java.util.*;
import org.junit.Assert;

public class CollectionInterfacesTest {
    CollectionInterfaces collectionInterfaces = new CollectionInterfaces();

    @Test
    public void hashMap() {
        HashMap actual = collectionInterfaces.hashMap();

        String cars = "{Etios=2017, Auris=2006, Yaris=1999, Supra=1978}";

        cars = cars.substring(1,cars.length()-1);
        String[] keyValuePairs = cars.split(",");
        Map<String,String> map = new HashMap<>();
        for (String pair : keyValuePairs)
        {
            String[] entry = pair.split("=");
            map.put(entry[0].trim(), entry[1].trim());
        }
        Assert.assertTrue(actual.equals(actual));
    }

    @Test
    public void treeSet() {
        TreeSet myCars = CollectionInterfaces.treeSet();

        String cars = "{Etios=2017, Auris=2006, Yaris=1999, Supra=1978}";
        List list = (List) Arrays.asList(cars);
        Set<String> exSet = new TreeSet<String>((Collection<? extends String>) list);

        Assert.assertEquals(exSet,myCars);

    }

    @Test
    public void list() {
        ArrayList mylists = collectionInterfaces.list();

        ArrayList<String> output = new ArrayList<>();
        output.add("2017 Etios");
        output.add("2006 Auris");
        output.add("1999 Yaris");
        output.add("1978 Supra");
        output.add("2000 Highlander");
        output.add("2015 Fortuner");
        output.add("2019 Avanza");
        output.add("2014 Levin");

        Assert.assertEquals(output,mylists);
    }

    @Test
    public void collection() {
      ArrayList mycollect = collectionInterfaces.collections();

      String [] mybrand = {"2017 Toyota Etios, 2006 Toyota Auris, 1999 Toyota Yaris, 1978 Toyota Supra, 2000 Toyota Highlander, 2015 Toyota Fortuner, 2019 Toyota Avanza, 2014 Toyota Levin"};
      ArrayList<String> carsList = new ArrayList<String>();

      Assert.assertNotEquals(carsList,mycollect);

    }
}
