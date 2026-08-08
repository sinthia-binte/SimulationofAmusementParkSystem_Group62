package Veronica.MaintenanceTechnician;

import java.io.Serializable;

public class EquipmentStatus implements Serializable {

    private String equipmentId, equipmentName, status, newStatus, lastInspectionDate, faultHistory, updatedBy;

    public EquipmentStatus(String equipmentId, String equipmentName, String status, String newStatus, String lastInspectionDate, String faultHistory, String updatedBy) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.status = status;
        this.newStatus = newStatus;
        this.lastInspectionDate = lastInspectionDate;
        this.faultHistory = faultHistory;
        this.updatedBy = updatedBy;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public String getLastInspectionDate() {
        return lastInspectionDate;
    }

    public void setLastInspectionDate(String lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
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

    @Override
    public String toString() {
        return "EquipmentStatus{" +
                "equipmentId='" + equipmentId + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", status='" + status + '\'' +
                ", newStatus='" + newStatus + '\'' +
                ", lastInspectionDate='" + lastInspectionDate + '\'' +
                ", faultHistory='" + faultHistory + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }


}