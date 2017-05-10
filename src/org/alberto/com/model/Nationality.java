package org.alberto.com.model;

/**
 * Created by Alberto on 10/05/2017.
 */
public enum Nationality {
    SPAIN("Spain"),
    FRANCE("France"),
    GERMANY("Germany"),
    ITALY("Italy");

    private final String nationality;
    //Constructor
    Nationality(String nationality){
        this.nationality = nationality;
    }
    //Getter
    public String getNationality(){
        return this.nationality;
    }
}
