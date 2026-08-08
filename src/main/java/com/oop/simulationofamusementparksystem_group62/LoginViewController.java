package com.oop.simulationofamusementparksystem_group62;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

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
    private AnchorPane mainPane;


    @FXML
    public void initialize() {

        roleCB.getItems().addAll(
                "Ticket Seller",
                "Ride Operator",
                "Tour Guide",
                "Maintenance Technician",
                "Security In-Charge",
                "Event Coordinator",
                "IT Officer",
                "Finance Officer"
        );

    }


    @FXML
    public void loginButtonOA(ActionEvent actionEvent) throws IOException {

        if(roleCB.getValue() == null){
            errorMsgLabel.setText("Please select a role.");
            return;
        }


        else if(roleCB.getValue().equals("Tour Guide")){
            if(userIdTF.getText().equals("TG1") && passwordPF.getText().equals("1234")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/TourGuideDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }


        else if(roleCB.getValue().equals("Maintenance Technician")){
            if(userIdTF.getText().equals("MT") && passwordPF.getText().equals("5678")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/oop/simulationofamusementparksystem_group62/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }


        else if(roleCB.getValue().equals("Ticket Seller")){
            if(userIdTF.getText().equals("TS") && passwordPF.getText().equals("1111")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/oop/simulationofamusementparksystem_group62/Mubin/TicketSeller/TicketSellerDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }


        else if(roleCB.getValue().equals("Ride Operator")){
            if(userIdTF.getText().equals("RO") && passwordPF.getText().equals("2222")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/oop/simulationofamusementparksystem_group62/Mubin/RideOperator/RideOperatorDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }


        else if(roleCB.getValue().equals("Security In-Charge")){
            if(userIdTF.getText().equals("SC1") && passwordPF.getText().equals("3333")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/oop/simulationofamusementparksystem_group62/Sinthia/Security/SecurityDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }
        else if(roleCB.getValue().equals("Event Coordinator")){
            if(userIdTF.getText().equals("EC") && passwordPF.getText().equals("4444")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/oop/simulationofamusementparksystem_group62/Sinthia/EventCoordinator/EventCoordinatorDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }


        else if(roleCB.getValue().equals("IT Officer")){
            if(userIdTF.getText().equals("IT") && passwordPF.getText().equals("5555")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/oop/simulationofamusementparksystem_group62/Zaima/ITOfficer/ITOfficerDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }


        else if(roleCB.getValue().equals("Finance Officer")){
            if(userIdTF.getText().equals("FO") && passwordPF.getText().equals("6666")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/oop/simulationofamusementparksystem_group62/Zaima/FinanceOfficer/FinanceOfficerDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }


        errorMsgLabel.setText("User ID and Password don't match.");

    }
}
