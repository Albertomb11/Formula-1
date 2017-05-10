package org.alberto.com.model;

/**
 * Created by Alberto on 10/05/2017.
 */
public class Pilot {
    //Atributos
    private Number number;
    private Name name;
    private Nationality nationality;
    private Team team;
    private PilotType pilotType;

    //Constructors
    public Pilot(Number number, Name name, Nationality nationality, Team team, PilotType pilotType) {
        this.number = number;
        this.name = name;
        this.nationality = nationality;
        this.team = team;
        this.pilotType = pilotType;
    }

    //Accesores
    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public PilotType getPilotType() {
        return pilotType;
    }

    public void setPilotType(PilotType pilotType) {
        this.pilotType = pilotType;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "number=" + number.getNumber() +
                ", name='" + name.getName() + '\'' +
                ", nationality='" + nationality.getNationality() + '\'' +
                ", team='" + team.getTeam() + '\'' +
                ", pilotType='" + pilotType.getPilotType() + '\'' +
                '}';
    }
}
