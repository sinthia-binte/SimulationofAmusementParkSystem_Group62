package Sinthia.EventCoordinator;

import java.time.LocalDate;

public class Training {
    private String trainingID;
    private String topic;
    private LocalDate date;

    public Training() {}

    public Training(String trainingID, String topic, LocalDate date) {
        this.trainingID = trainingID;
        this.topic = topic;
        this.date = date;
    }
    public String getTrainingID() { return trainingID; }
    public void setTrainingID(String trainingID) { this.trainingID = trainingID; }

    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public boolean scheduleTraining() { return true; }
    public boolean evaluateStaff() { return true; }

    @Override
    public String toString() {
        return "Training{" + "trainingID='" + trainingID + '\'' + ", topic='" + topic + '\'' + ", date=" + date + '}';
    }
}
