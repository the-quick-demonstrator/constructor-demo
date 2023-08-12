package com.github.curriculeon;

public class MainApplication {
    static { // class level

        // instance variable
        String make;
        String model;
        int year;
        { // constructor
            make = "Honda";
            model = "Civic";
            year = 2023;
        }

        { // method body
            System.out.println(make);
            System.out.println(model);
            System.out.println(year);
        }
    }
}
