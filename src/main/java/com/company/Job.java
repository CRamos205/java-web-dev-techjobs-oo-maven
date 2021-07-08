package com.company;

import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public Employer getEmployer() {
        return employer;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if (this.name == ""){
            System.out.println("Data Not Available");
        }
        if (this.employer.equals("")) {
            System.out.println("Data Not Available");
        }
        if (this.location.equals("")) {
            System.out.println("Data Not Available");
        }
        if (this.getPositionType().getValue().equals("")) {
            System.out.println("Data Not Available");
        }
        if (this.coreCompetency.equals("")) {
            System.out.println("Data Not Available");
        }
        return "\n"+
                "ID: " + id + "\n"+
                "Name: " + name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + this.getPositionType().getValue() + "\n" +
                "Core Competency: " + coreCompetency + "\n";
    }
    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.
}
