package com.oop.simulationofamusementparksystem_group62;


import Veronica.MaintenanceTechnician.MaintenanceTechnician;
import Veronica.TourGuide.TourGuide;
import Veronica.TourGuide.TourGuideDashboardController;

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
import java.time.LocalDate;
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
    private AnchorPane mainPane;



    ArrayList<TourGuide> tourGuideList = new ArrayList<>();

    ArrayList<MaintenanceTechnician> technicianList = new ArrayList<>();


    TourGuide tg1 = new TourGuide(
            "Alice",
            "Female",
            "1234",
            "TG1",
            LocalDate.of(2000,5,15),
            "Dhaka",
            "01711111111",
            "alice@gmail.com"
    );
    TourGuide tg2 = new TourGuide(
            "Bob",
            "Male",
            "5656",
            "TG2",
            LocalDate.of(1999,8,10),
            "Chittagong",
            "01822222222",
            "bob@gmail.com");




    MaintenanceTechnician mt1 = new MaintenanceTechnician(
            "John",
            "Male",
            "3113",
            "MT001",
            LocalDate.of(1998,3,20),
            "Dhaka",
            "01911111111",
            "john@gmail.com"
    );


    MaintenanceTechnician mt2 = new MaintenanceTechnician(
            "Mike",
            "Male",
            "2323",
            "MT005",
            LocalDate.of(2001,7,12),
            "Rajshahi",
            "01922222222",
            "mike@gmail.com"
    );





    @FXML
    public void initialize(){
        roleCB.getItems().addAll(
                "Ticket Seller", "Ride Operator",
                "Tour Guide",
                "Maintenance Technician",
                "Security In-Charge",
                "Event Coordinator",
                "IT Officer",
                "Finance Officer"

        );
        tourGuideList.add(tg1);
        tourGuideList.add(tg2);


        technicianList.add(mt1);
        technicianList.add(mt2);


    }






    @FXML
    public void loginButtonOA(ActionEvent actionEvent) throws IOException {
        if(roleCB.getValue()==null){errorMsgLabel.setText("Please select a role.");
            return;

        }


        if(roleCB.getValue().equals("Tour Guide")){
            for(TourGuide tg : tourGuideList){
                if(userIdTF.getText().equals(tg.getId()) &&
                        passwordPF.getText().equals(tg.getPassword())){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Veronica/TourGuideTourGuideDashBoardView.fxml"));
                    Node node = loader.load();
                    TourGuideDashboardController controller = loader.getController();
                    controller.setLoggedInGuide(tg);
                    mainPane.getChildren().setAll(node);
                    return;

                }

            }

        }

        else if(roleCB.getValue().equals("Maintenance Technician")){
            for(MaintenanceTechnician mt : technicianList){
                if(userIdTF.getText().equals(mt.getId()) &&passwordPF.getText().equals(mt.getPassword())){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml"));
                    Node node = loader.load();
                    mainPane.getChildren().setAll(node);
                    return;

                }

            }

        }


        else if(roleCB.getValue().equals("Ticket Seller")){
            if(userIdTF.getText().equals("TS1") && passwordPF.getText().equals("1111")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/TicketSeller/TicketSellerDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;

            }

        }


        else if(roleCB.getValue().equals("Ride Operator")){
            if(userIdTF.getText().equals("RO1") && passwordPF.getText().equals("2222")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/RideOperator/RideOperatorDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;

            }

        }

        else if(roleCB.getValue().equals("Security In-Charge")){
            if(userIdTF.getText().equals("SC001") && passwordPF.getText().equals("3333")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Security/SecurityDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;
            }
        }
        else if(roleCB.getValue().equals("Event Coordinator")){
            if(userIdTF.getText().equals("EC001") && passwordPF.getText().equals("4444")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/EventCoordinator/EventCoordinatorDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;

            }

        }
        else if(roleCB.getValue().equals("IT Officer")){
            if(userIdTF.getText().equals("IT001") && passwordPF.getText().equals("5555")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/ITOfficer/ITOfficerDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;

            }

        }




        else if(roleCB.getValue().equals("Finance Officer")){
            if(userIdTF.getText().equals("FO001") && passwordPF.getText().equals("6666")){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/FinanceOfficer/FinanceOfficerDashboard.fxml"));
                Node node = loader.load();
                mainPane.getChildren().setAll(node);
                return;

            }

        }
        errorMsgLabel.setText("User ID and Password don't match.");

    }


}
