package Veronica.TourGuide;

public class TourSchedule {

    private int tourId;
    private String tourName,date,time,location,description;


    public TourSchedule(int tourId, String tourName, String date, String time, String location, String description) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.date = date;
        this.time = time;
        this.location = location;
        this.description = description;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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


}
