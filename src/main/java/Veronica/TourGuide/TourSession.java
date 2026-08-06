package Veronica.TourGuide;

import java.io.Serializable;
import java.time.LocalDate;

public class TourSession implements Serializable {

    private String tourguideId;
    private String title;
    private String description;
    private String location;
    private String duration;
    private String category;
    private String meetingtime;

    private LocalDate date;
    private String starttime;
    private String endtime;

    private float ticketPrice;
    private int maxParticipants;


    public TourSession(String tourguideId,
                       String title,
                       String description,
                       String location,
                       String duration,
                       String category,
                       String meetingtime,
                       LocalDate date,
                       String starttime,
                       String endtime,
                       float ticketPrice,
                       int maxParticipants) {

        this.tourguideId = tourguideId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.duration = duration;
        this.category = category;
        this.meetingtime = meetingtime;
        this.date = date;
        this.starttime = starttime;
        this.endtime = endtime;
        this.ticketPrice = ticketPrice;
        this.maxParticipants = maxParticipants;
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


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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


    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }


    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
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


    @Override
    public String toString() {
        return title;
    }
}
