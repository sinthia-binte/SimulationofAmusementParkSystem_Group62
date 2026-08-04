package Veronica.TourGuide;

public class TourSchedule {

    private int tourId;
    private String tourName, date, time, location, description;


    public TourSchedule(int tourId, String tourName, String date,
                        String time, String location, String description) {

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


    public String getTourName() {
        return tourName;
    }


    public String getDate() {
        return date;
    }


    public String getTime() {
        return time;
    }


    public String getLocation() {
        return location;
    }


    public String getDescription() {
        return description;
    }
}
