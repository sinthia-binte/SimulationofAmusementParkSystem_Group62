package Veronica.TourGuide;

public class Notification extends Attraction {

    private int notificationId;
    private String title, status;


    public Notification(int attractionId, String name, String location,
                        String description, String visitingTime,
                        int notificationId, String title, String status) {

        super(attractionId, name, location, description, visitingTime);

        this.notificationId = notificationId;
        this.title = title;
        this.status = status;
    }


    public int getNotificationId() {
        return notificationId;
    }


    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return title;
    }
}
