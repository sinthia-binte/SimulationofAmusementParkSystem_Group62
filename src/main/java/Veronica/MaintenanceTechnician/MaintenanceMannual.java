package Veronica.MaintenanceTechnician;

public class MaintenanceMannual {

    private String manualId, equipmentId, equipmentName, manualTitle, repairInstructions, technicalGuidelines, diagramPath, filePath, availabilityStatus;


    public MaintenanceMannual(String manualId, String equipmentId, String equipmentName, String manualTitle, String repairInstructions, String technicalGuidelines, String diagramPath, String filePath, String availabilityStatus) {
        this.manualId = manualId;
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.manualTitle = manualTitle;
        this.repairInstructions = repairInstructions;
        this.technicalGuidelines = technicalGuidelines;
        this.diagramPath = diagramPath;
        this.filePath = filePath;
        this.availabilityStatus = availabilityStatus;
    }


    public String getManualId() {
        return manualId;
    }

    public void setManualId(String manualId) {
        this.manualId = manualId;
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

    public String getManualTitle() {
        return manualTitle;
    }

    public void setManualTitle(String manualTitle) {
        this.manualTitle = manualTitle;
    }

    public String getRepairInstructions() {
        return repairInstructions;
    }

    public void setRepairInstructions(String repairInstructions) {
        this.repairInstructions = repairInstructions;
    }

    public String getTechnicalGuidelines() {
        return technicalGuidelines;
    }

    public void setTechnicalGuidelines(String technicalGuidelines) {
        this.technicalGuidelines = technicalGuidelines;
    }

    public String getDiagramPath() {
        return diagramPath;
    }

    public void setDiagramPath(String diagramPath) {
        this.diagramPath = diagramPath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
