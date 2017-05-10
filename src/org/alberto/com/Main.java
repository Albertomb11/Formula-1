package org.alberto.com;
import org.alberto.com.model.Name;
import org.alberto.com.model.Number;
import org.alberto.com.model.Nationality;
import org.alberto.com.model.Team;
import org.alberto.com.model.Pilot;
import org.alberto.com.model.PilotType;

/**
 * Created by Alberto on 10/05/2017.
 */
public class Main {
    public static void main(String[] args){
        Pilot alonso = new Pilot(Number.SECOND,Name.FERNANDO, Nationality.SPAIN, Team.FERRARI, PilotType.FIRST);
        
        System.out.println(alonso);
    }
}
