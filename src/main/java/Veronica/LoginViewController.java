package Veronica;

import Veronica.MaintenanceTechnician.MaintenanceTechnician;
import Veronica.TourGuide.TourGuide;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class LoginViewController {

    @FXML
    private TextField userIdTF;

    @FXML
    private PasswordField passwordPF;

    @FXML
    private ComboBox<String> roleCB;

    @FXML
    private Label errorMsgLabel;


    @FXML
    public void initialize() {

        roleCB.getItems().addAll("Tour Guide", "Maintenance Technician");

    }


    @FXML
    public void loginButtonOA(ActionEvent actionEvent) {

        String id = userIdTF.getText();
        String password = passwordPF.getText();


        if (roleCB.getValue() == null) {errorMsgLabel.setText("Please select a role.");
            return;

        }

        if (roleCB.getValue().equals("Tour Guide")) {
            ArrayList<TourGuide> tourGuides = BinaryFileUtil.readObjects("TourGuide.bin");


            for (TourGuide tg : tourGuides) {
                if (tg.getId().equals(id) && tg.getPassword().equals(password)) {


                    SceneSwitcher.switchScene(actionEvent, "/Veronica/TourGuide/TourGuideDashboard.fxml", "Tour Guide Dashboard");

                    return;

                }

            }errorMsgLabel.setText("Invalid ID or Password");


        }


        else if (roleCB.getValue().equals("Maintenance Technician")) {

            ArrayList<MaintenanceTechnician> technicians = BinaryFileUtil.readObjects("MaintenanceTechnician.bin");
            for (MaintenanceTechnician mt : technicians) {
                if (mt.getId().equals(id) && mt.getPassword().equals(password)) {
                    SceneSwitcher.switchScene(actionEvent, "/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml", "Maintenance Technician Dashboard");
                    return;
                }
            }errorMsgLabel.setText("Invalid ID or Password");
        }



    }

}