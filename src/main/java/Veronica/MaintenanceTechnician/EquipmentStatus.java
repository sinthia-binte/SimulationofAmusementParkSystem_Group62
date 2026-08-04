package Veronica.MaintenanceTechnician;

import java.io.Serializable;
import java.time.LocalDate;

public class EquipmentStatus implements Serializable {

    private String equipmentId, equipmentName, currentStatus, newStatus, lastInspection, faultHistory, updatedBy;
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


    @Override
    public String toString() {

        return "Equipment ID: " + equipmentId +
                "\nEquipment Name: " + equipmentName +
                "\nCurrent Status: " + currentStatus +
                "\nNew Status: " + newStatus +
                "\nLast Inspection: " + lastInspection +
                "\nFault History: " + faultHistory +
                "\nUpdated By: " + updatedBy +
                "\nUpdate Date: " + updateDate;

    }
}