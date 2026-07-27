package Veronica.MaintenanceTechnician;

import java.time.LocalDate;

public class MaintenanceTask {

    private String taskId, equipmentId, taskDescription, location,
            currentStatus, workDone, partsUsed,
            completionNotes, evidencePath, completedBy, status;
    private LocalDate completionDate;


    public MaintenanceTask(String taskId, String equipmentId, String taskDescription,
                           String location, String currentStatus, String workDone,
                           String partsUsed, String completionNotes,
                           String evidencePath, String completedBy,
                           String status, LocalDate completionDate) {

        this.taskId = taskId;
        this.equipmentId = equipmentId;
        this.taskDescription = taskDescription;
        this.location = location;
        this.currentStatus = currentStatus;
        this.workDone = workDone;
        this.partsUsed = partsUsed;
        this.completionNotes = completionNotes;
        this.evidencePath = evidencePath;
        this.completedBy = completedBy;
        this.status = status;
        this.completionDate = completionDate;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getWorkDone() {
        return workDone;
    }

    public void setWorkDone(String workDone) {
        this.workDone = workDone;
    }

    public String getPartsUsed() {
        return partsUsed;
    }

    public void setPartsUsed(String partsUsed) {
        this.partsUsed = partsUsed;
    }

    public String getCompletionNotes() {
        return completionNotes;
    }

    public void setCompletionNotes(String completionNotes) {
        this.completionNotes = completionNotes;
    }

    public String getEvidencePath() {
        return evidencePath;
    }

    public void setEvidencePath(String evidencePath) {
        this.evidencePath = evidencePath;
    }

    public String getCompletedBy() {
        return completedBy;
    }

    public void setCompletedBy(String completedBy) {
        this.completedBy = completedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    @Override
    public String toString() {
        return "MaintenanceTask{" +
                "taskId='" + taskId + '\'' +
                ", equipmentId='" + equipmentId + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", status='" + status + '\'' +
                ", completionDate=" + completionDate +
                '}';
    }
}
