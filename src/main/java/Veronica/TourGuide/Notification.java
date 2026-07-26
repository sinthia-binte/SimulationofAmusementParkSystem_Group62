package Veronica.TourGuide;

public class Notification extends Attraction {
    private int notificationId;


    public Notification(int attractionId, String name, String location, String description, String visitingTime, int notificationId) {
        super(attractionId, name, location, description, visitingTime);
        this.notificationId = notificationId;
    }


    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }
}


