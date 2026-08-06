package Veronica.TourGuide;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class IncidentController {
    @javafx.fxml.FXML
    private TextArea ConfirmationTA;
    @javafx.fxml.FXML
    private ComboBox<String> SessionCB;
    @javafx.fxml.FXML
    private TextField GuestNameTF;
    @javafx.fxml.FXML
    private TextArea DescriptionTA;
    @javafx.fxml.FXML
    private TextField TimeTF;
    @javafx.fxml.FXML
    private TextField LocationTF;
    ArrayList<Incident> incidentList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        SessionCB.getItems().addAll("City Tour", "Historical Tour", "Nature Adventure", "Food Tour");
    }

    @javafx.fxml.FXML
    public void submitReportOA(ActionEvent actionEvent) {
        if (SessionCB.getValue() == null || GuestNameTF.getText().isEmpty() || TimeTF.getText().isEmpty()
                || LocationTF.getText().isEmpty() || DescriptionTA.getText().isEmpty()) {
            ConfirmationTA.setText("Please fill in all required fields.");
            return;
        }

        int incidentId = incidentList.size() + 1;

        Incident incident = new Incident(incidentId, SessionCB.getValue(), GuestNameTF.getText(),
                TimeTF.getText(), LocationTF.getText(), DescriptionTA.getText(),"Submitted");

        incidentList.add(incident);

        BinaryFileUtil.saveList("incident.bin", incidentList);

        ConfirmationTA.setText("Incident Report Submitted Successfully.\nIncident ID: "
                + incidentId + "\nStatus: Submitted");
    }


    @javafx.fxml.FXML
    public void reviewReportOA(ActionEvent actionEvent) {
        ConfirmationTA.setText("Tour Session: " + SessionCB.getValue()
                + "\nGuest Name: " + GuestNameTF.getText()
                + "\nTime: " + TimeTF.getText()
                + "\nLocation: " + LocationTF.getText()
                + "\nDescription: " + DescriptionTA.getText());

    }

    @javafx.fxml.FXML
    public void BackToDashboardOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/Veronica/TourGuide/TourGuideDashBoardView.fxml","Tour Guide Dashboard");







    }
}