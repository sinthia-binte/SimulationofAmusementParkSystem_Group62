package Veronica.MaintenanceTechnician;

import java.io.Serializable;

public class MaintenanceManual implements Serializable {

    private String manualId, equipmentId, equipmentName, manualTitle, manualContent;


    public MaintenanceManual(String manualId,
                             String equipmentId,
                             String equipmentName,
                             String manualTitle,
                             String manualContent) {

        this.manualId = manualId;
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.manualTitle = manualTitle;
        this.manualContent = manualContent;

    }


    public String getManualId() {
        return manualId;
    }


    public String getEquipmentId() {
        return equipmentId;
    }


    public String getEquipmentName() {
        return equipmentName;
    }


    public String getManualTitle() {
        return manualTitle;
    }


    public String getManualContent() {
        return manualContent;
    }


    @Override
    public String toString() {

        return "Manual ID: " + manualId +
                "\nEquipment ID: " + equipmentId +
                "\nEquipment Name: " + equipmentName +
                "\nManual Title: " + manualTitle +
                "\nContent: " + manualContent;

    }
}