package Veronica.TourGuide;

import java.time.LocalDate;

public class TourSession {
    private String tourguideId,title,description,location,during ,category,meetingtime;
    private LocalDate date,starttime,endtime;
    private float ticketPrice;
    private int maxParticipants;


    public TourSession(String tourguideId, String title, String description, String location, String during, String category, String meetingtime, LocalDate date, LocalDate starttime, LocalDate endtime, float ticketPrice, int maxParticipants) {
        this.tourguideId = tourguideId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.during = during;
        this.category = category;
        this.meetingtime = meetingtime;
        this.date = date;
        this.starttime = starttime;
        this.endtime = endtime;
        this.ticketPrice = ticketPrice;
        this.maxParticipants = maxParticipants;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTourguideId() {
        return tourguideId;
    }

    public void setTourguideId(String tourguideId) {
        this.tourguideId = tourguideId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDuring() {
        return during;
    }

    public void setDuring(String during) {
        this.during = during;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMeetingtime() {
        return meetingtime;
    }

    public void setMeetingtime(String meetingtime) {
        this.meetingtime = meetingtime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDate starttime) {
        this.starttime = starttime;
    }

    public LocalDate getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDate endtime) {
        this.endtime = endtime;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }
}
