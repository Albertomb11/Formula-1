package org.alberto.com.model;

/**
 * Created by Alberto on 10/05/2017.
 */
public enum PilotType {
    FIRST("First pilot"),
    SECOND("Second pilot"),
    TESTER("Tester pilot");

    private final String pilotType;
    //Constructor
    PilotType(String type){
        this.pilotType = type;
    }
    //Getter
    public String getPilotType(){
        return this.pilotType;
    }
}
