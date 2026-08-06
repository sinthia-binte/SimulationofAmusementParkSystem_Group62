package Sinthia.EventCoordinator;

import java.time.LocalDate;

public class Event {
    private String eventID;
    private String name;
    private LocalDate date;
    private String location;
    private Integer budget;

    public Event() {}

    public Event(String eventID, String name, LocalDate date, String location, Integer budget) {
        this.eventID = eventID;
        this.name = name;
        this.date = date;
        this.location = location;
        this.budget = budget;
    }
    public String getEventID() { return eventID; }
    public void setEventID(String eventID) { this.eventID = eventID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Integer getBudget() { return budget; }
    public void setBudget(Integer budget) { this.budget = budget; }

    @Override
    public String toString() {
        return "Event{" + "eventID='" + eventID + '\'' + ", name='" + name + '\'' + ", date=" + date + ", location='" + location + '\'' + ", budget=" + budget + '}';
    }
}
