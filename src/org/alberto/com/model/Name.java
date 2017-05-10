package org.alberto.com.model;

/**
 * Created by Alberto on 10/05/2017.
 */
public enum Name {
    FERNANDO("Fernando Alonso"),
    HAMILTON("Lewis Hamilton"),
    VETTEL("Sebastian Vettel"),
    HULKENBERG("Nico Hulkenberg");

    private final String name;
    //Constructor
    Name(String name){
        this.name = name;
    }
    //Getter
    public String getName(){
        return this.name;
    }
}
