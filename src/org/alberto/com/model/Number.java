package org.alberto.com.model;

/**
 * Created by Alberto on 10/05/2017.
 */
public enum Number {
    FIRST('1'),
    SECOND('2'),
    THIRD('3'),
    FOURTH('4');

    private final char number;
    //Constructor
    Number(char number){
        this.number = number;
    }
    //Getter
    public char getNumber(){
        return number;
    }
}
