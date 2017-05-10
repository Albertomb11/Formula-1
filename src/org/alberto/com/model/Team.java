package org.alberto.com.model;

/**
 * Created by Alberto on 10/05/2017.
 */
public enum Team {
    FERRARI("Ferrari",'1'),
    MCLAREN("Mclaren",'2'),
    MERCEDES("Mercedes",'3');

    private final String team;
    private final char position;
    //Constructor
    Team(String team, char position){
        this.team = team;
        this.position = position;
    }
    //Getter
    public String getTeam(){
        return this.team;
    }
    public char getPosition(){
        return this.position;
    }
}
