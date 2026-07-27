package Veronica.MaintenanceTechnician;

import java.time.LocalDate;

public class EquipmentStatus {

    private String rideId, equipmentName, currentStatus, newStatus, lastInspection, faultHistory, updatedBy;
    private LocalDate updateDate;

    public EquipmentStatus(String rideId, String equipmentName, String currentStatus, String newStatus, String lastInspection, String faultHistory, String updatedBy, LocalDate updateDate) {
        this.rideId = rideId;
        this.equipmentName = equipmentName;
        this.currentStatus = currentStatus;
        this.newStatus = newStatus;
        this.lastInspection = lastInspection;
        this.faultHistory = faultHistory;
        this.updatedBy = updatedBy;
        this.updateDate = updateDate;


    }


    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public String getLastInspection() {
        return lastInspection;
    }

    public void setLastInspection(String lastInspection) {
        this.lastInspection = lastInspection;
    }

    public String getFaultHistory() {
        return faultHistory;
    }

    public void setFaultHistory(String faultHistory) {
        this.faultHistory = faultHistory;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
