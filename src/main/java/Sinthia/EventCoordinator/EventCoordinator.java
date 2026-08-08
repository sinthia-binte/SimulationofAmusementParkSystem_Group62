package Sinthia.EventCoordinator;

import java.io.File;

public class EventCoordinator {
    private String coordinatorID;
    private String name;
    private String email;

    public EventCoordinator() {}

    public EventCoordinator(String coordinatorID, String name, String email) {
        this.coordinatorID = coordinatorID;
        this.name = name;
        this.email = email;
    }
    public String getCoordinatorID() { return coordinatorID; }
    public void setCoordinatorID(String coordinatorID) { this.coordinatorID = coordinatorID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean createEvent() { return true; }
    public boolean scheduleEvent() { return true; }
    public boolean assignStaff() { return true; }
    public File generateReport() { return new File("event_report.pdf"); }

    @Override
    public String toString() {
        return "EventCoordinator{" + "coordinatorID='" + coordinatorID + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }
}
