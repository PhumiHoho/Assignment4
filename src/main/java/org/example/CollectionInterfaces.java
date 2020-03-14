package org.example;

import java.util.*;

public class CollectionInterfaces {
    ArrayList<String> toyota = new ArrayList<String>();

    //HashMap Method
    public HashMap hashMap(){

        HashMap<String,Integer> year = new HashMap<>();
        year.put("Etios", 2017);
        year.put("Auris", 2006);
        year.put("Yaris", 1999);
        year.put("Supra", 1978);
        return year;
    }

    //Set
    public static TreeSet treeSet(){
        String mytoyota[] = {"Etios","Auris","Yaris","Supra"};
        Set<String> set = new HashSet<String>();
        set.add(mytoyota[0]);
        set.add(mytoyota[1]);
        set.add(mytoyota[2]);
        set.add(mytoyota[3]);
        set.add(mytoyota[4]);
        set.add(mytoyota[5]);

        TreeSet sortSet = new TreeSet<String>();

        return sortSet;

    }

    //List
    public ArrayList list() {
       toyota.add("2017 Etios");
       toyota.add("2006 Auris");
       toyota.add("1999 Yaris");
       toyota.add("1978 Supra");
       toyota.add("2000 Highlander");
       toyota.add("2015 Fortuner");
       toyota.add("2019 Avanza");
       toyota.add("2014 Levin");

       return toyota;
    }

    //Collection
    public ArrayList collections() {
        toyota.add("2017 Toyota Etios");
        toyota.add("2006 Toyota Auris");
        toyota.add("1999 Toyota Yaris");
        toyota.add("1978 Toyota Supra");
        toyota.add("2000 Toyota Highlander");
        toyota.add("2015 Toyota Fortuner");
        toyota.add("2019 Toyota Avanza");
        toyota.add("2014 Toyota Levin");
        Collections.sort(toyota);

        return toyota;
    }

}
