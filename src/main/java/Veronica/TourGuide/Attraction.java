package Veronica.TourGuide;

public class Attraction {

    private int attractionId;
    private String name , location ,description,visitingTime;

    public Attraction(int attractionId, String name, String location, String description, String visitingTime) {
        this.attractionId = attractionId;
        this.name = name;
        this.location = location;
        this.description = description;
        this.visitingTime = visitingTime;
    }

    public int getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(int attractionId) {
        this.attractionId = attractionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(String visitingTime) {
        this.visitingTime = visitingTime;
    }
}
