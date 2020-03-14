package org.example;

import java.util.HashMap;

public class Student {
    public  String studentNo(){
        String studnum = "216995131";
        return studnum;

    }

    public int age(){
        HashMap<String,Integer> sAge = new HashMap<>();
        sAge.put("211676323", 18);
        sAge.put("216597849", 23);
        sAge.put("214556323", 26);

        int studAge = sAge.get(2);
        return studAge;
    }
}
