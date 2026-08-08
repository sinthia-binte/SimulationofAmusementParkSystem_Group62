package Sinthia.SecurityInCharge;

import java.time.LocalDate;

public class SecurityStaffTraining {

    private String trainingTopic;
    private LocalDate trainingDate;
    private String staffMember;
    private String trainingType;
    private String assessment;
    private String feedback;
    private String additionalTraining;

    public SecurityStaffTraining() {
    }

    public SecurityStaffTraining(String trainingTopic, LocalDate trainingDate,
                                 String staffMember, String trainingType,
                                 String assessment, String feedback,
                                 String additionalTraining) {
        this.trainingTopic = trainingTopic;
        this.trainingDate = trainingDate;
        this.staffMember = staffMember;
        this.trainingType = trainingType;
        this.assessment = assessment;
        this.feedback = feedback;
        this.additionalTraining = additionalTraining;
    }


    public String getTrainingTopic() {
        return trainingTopic;
    }

    public void setTrainingTopic(String trainingTopic) {
        this.trainingTopic = trainingTopic;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public String getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(String staffMember) {
        this.staffMember = staffMember;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getAdditionalTraining() {
        return additionalTraining;
    }

    public void setAdditionalTraining(String additionalTraining) {
        this.additionalTraining = additionalTraining;
    }

    public void scheduleTraining(LocalDate date) {
        this.trainingDate = date;
    }

    public void assessStaff(String result) {
        this.assessment = result;
    }

    public void provideFeedback(String feedback) {
        this.feedback = feedback;
    }

    public boolean needsAdditionalTraining() {
        return additionalTraining != null &&
                !additionalTraining.isEmpty();
    }

    @Override
    public String toString() {
        return "SecurityTraining{" +
                "trainingTopic='" + trainingTopic + '\'' +
                ", trainingDate=" + trainingDate +
                ", staffMember='" + staffMember + '\'' +
                ", trainingType='" + trainingType + '\'' +
                ", assessment='" + assessment + '\'' +
                ", feedback='" + feedback + '\'' +
                ", additionalTraining='" + additionalTraining + '\'' +
                '}';
    }
}