package Veronica.MaintenanceTechnician;

import java.io.Serializable;
import java.time.LocalDate;

public class EquipmentStatus implements Serializable {


    private static final long serialVersionUID = 1L;


    private String equipmentId;
    private String equipmentName;
    private String currentStatus;
    private String newStatus;
    private String lastInspection;
    private String faultHistory;
    private String updatedBy;
    private LocalDate updateDate;



    public EquipmentStatus(String equipmentId,
                           String equipmentName,
                           String currentStatus,
                           String newStatus,
                           String lastInspection,
                           String faultHistory,
                           String updatedBy) {


        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.currentStatus = currentStatus;
        this.newStatus = newStatus;
        this.lastInspection = lastInspection;
        this.faultHistory = faultHistory;
        this.updatedBy = updatedBy;
        this.updateDate = LocalDate.now();

    }



    public String getEquipmentId() {
        return equipmentId;
    }


    public String getEquipmentName() {
        return equipmentName;
    }


    public String getCurrentStatus() {
        return currentStatus;
    }


    public String getNewStatus() {
        return newStatus;
    }


    public String getLastInspection() {
        return lastInspection;
    }


    public String getFaultHistory() {
        return faultHistory;
    }


    public String getUpdatedBy() {
        return updatedBy;
    }


    public LocalDate getUpdateDate() {
        return updateDate;
    }



    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }


    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }


    public void setLastInspection(String lastInspection) {
        this.lastInspection = lastInspection;
    }


    public void setFaultHistory(String faultHistory) {
        this.faultHistory = faultHistory;
    }


    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }


    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }



    @Override
    public String toString() {

        return "Equipment ID: " + equipmentId
                + "\nEquipment Name: " + equipmentName
                + "\nCurrent Status: " + currentStatus
                + "\nNew Status: " + newStatus
                + "\nLast Inspection: " + lastInspection
                + "\nFault History: " + faultHistory
                + "\nUpdated By: " + updatedBy
                + "\nUpdate Date: " + updateDate;

    }

}
