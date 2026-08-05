package Veronica.MaintenanceTechnician;

public interface Equipment {
    String getEquipmentId();

    String getEquipmentName();

    String getStatus();

    char[] getLastInspectionDate();

    String getFaultHistory();
}
