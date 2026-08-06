package Veronica.TourGuide;

import java.io.Serializable;

public class Attraction implements Serializable {

    private int attractionId;
    private String name, location, description, visitingTime;


    public Attraction(int attractionId, String name, String location,
                      String description, String visitingTime) {

        this.attractionId = attractionId;
        this.name = name;
        this.location = location;
        this.description = description;
        this.visitingTime = visitingTime;
    }


    public int getAttractionId() {
        return attractionId;
    }


    public String getName() {
        return name;
    }


    public String getLocation() {
        return location;
    }


    public String getDescription() {
        return description;
    }


    public String getVisitingTime() {
        return visitingTime;
    }

}
