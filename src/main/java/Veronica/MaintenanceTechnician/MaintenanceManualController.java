package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class MaintenanceManualController {

    @FXML
    private TextField SelectedEquipmentTF;

    @FXML
    private TextField EquipmentSearchTF;

    @FXML
    private TextField NotificationTF;

    @FXML
    private TextField ManualContentTF;
    ArrayList<MaintenanceManual> manuals = BinaryFileUtil.readObjects("MaintenanceManual.bin");

    private MaintenanceManual selectedManual;


    @FXML
    public void initialize() {

    }


    @FXML
    public void searchManualOA(ActionEvent actionEvent) {
        String search = EquipmentSearchTF.getText();

        for(MaintenanceManual m : manuals) {
            if(m.getEquipmentId().equals(search) || m.getEquipmentName().equalsIgnoreCase(search)) {
                selectedManual = m;
                SelectedEquipmentTF.setText(m.getEquipmentName());
                NotificationTF.setText("Manual Found");
                return;
            }

            NotificationTF.setText("Manual Not Found");
            }
    }



    @FXML
    public void openManualOA(ActionEvent actionEvent) {
        if(selectedManual == null) {
            NotificationTF.setText("Search equipment first");
            return;

        }
        if(selectedManual.getManualContent().isEmpty()) {
            NotificationTF.setText("Manual file unavailable");
            return;

        }ManualContentTF.setText(selectedManual.getManualContent());
        NotificationTF.setText("Manual Opened");

    }



    @FXML
    public void closeManualOA(ActionEvent actionEvent) {
        ManualContentTF.clear();
        SelectedEquipmentTF.clear();
        NotificationTF.setText("Manual Closed");


    }

    @FXML
    public void BackToDashBoardOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml", "Maintenance Technician Dashboard");
    }
}