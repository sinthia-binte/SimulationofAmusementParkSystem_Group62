package Veronica.MaintenanceTechnician;

import java.io.Serializable;
import java.time.LocalDate;

public class MaintenanceTask implements Serializable {

    private String taskId, equipmentId, taskDescription, location,
            currentStatus, workDone, partsUsed,
            completionNotes, evidencePath,
            completedBy, status;

    private LocalDate completionDate;


    public MaintenanceTask(String taskId,
                           String equipmentId,
                           String taskDescription,
                           String location,
                           String currentStatus,
                           String workDone,
                           String partsUsed,
                           String completionNotes,
                           String evidencePath,
                           String completedBy,
                           LocalDate completionDate) {

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


    public String getEquipmentId() {
        return equipmentId;
    }


    public String getTaskDescription() {
        return taskDescription;
    }


    public String getLocation() {
        return location;
    }


    public String getCurrentStatus() {
        return currentStatus;
    }


    public String getWorkDone() {
        return workDone;
    }


    public String getPartsUsed() {
        return partsUsed;
    }


    public String getCompletionNotes() {
        return completionNotes;
    }


    public String getEvidencePath() {
        return evidencePath;
    }


    public String getCompletedBy() {
        return completedBy;
    }


    public String getStatus() {
        return status;
    }


    public LocalDate getCompletionDate() {
        return completionDate;
    }


    public void setWorkDone(String workDone) {
        this.workDone = workDone;
    }


    public void setPartsUsed(String partsUsed) {
        this.partsUsed = partsUsed;
    }


    public void setCompletionNotes(String completionNotes) {
        this.completionNotes = completionNotes;
    }


    public void setEvidencePath(String evidencePath) {
        this.evidencePath = evidencePath;
    }


    public void setCompletedBy(String completedBy) {
        this.completedBy = completedBy;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }


    @Override
    public String toString() {

        return "Task ID: " + taskId +
                "\nEquipment ID: " + equipmentId +
                "\nDescription: " + taskDescription +
                "\nLocation: " + location +
                "\nStatus: " + status +
                "\nWork Done: " + workDone +
                "\nParts Used: " + partsUsed +
                "\nCompleted By: " + completedBy +
                "\nCompletion Date: " + completionDate;

    }
}