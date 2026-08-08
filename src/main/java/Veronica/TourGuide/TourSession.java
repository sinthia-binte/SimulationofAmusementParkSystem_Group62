package Veronica.TourGuide;

import java.io.Serializable;
import java.time.LocalDate;

public class TourSession implements Serializable {

    private String tourguideId, title,description,location,duration,category,meetingtime,starttime, endtime;
    private LocalDate date;
    private float ticketPrice;
    private int maxParticipants;


    public TourSession(String tourguideId, String title, String description, String location, String duration, String category, String meetingtime, String starttime, String endtime, LocalDate date, float ticketPrice, int maxParticipants) {
        this.tourguideId = tourguideId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.duration = duration;
        this.category = category;
        this.meetingtime = meetingtime;
        this.starttime = starttime;
        this.endtime = endtime;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
        return "TourSession{" +
                "tourguideId='" + tourguideId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", duration='" + duration + '\'' +
                ", category='" + category + '\'' +
                ", meetingtime='" + meetingtime + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", date=" + date +
                ", ticketPrice=" + ticketPrice +
                ", maxParticipants=" + maxParticipants +
                '}';
    }
}
