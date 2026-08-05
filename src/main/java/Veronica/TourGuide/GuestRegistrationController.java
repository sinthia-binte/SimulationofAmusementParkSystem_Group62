package Veronica.TourGuide;

import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GuestRegistrationController {
    @javafx.fxml.FXML
    private TextArea GuestDetailsTA;
    @javafx.fxml.FXML
    private TextField PaymentTF;
    @javafx.fxml.FXML
    private TextField ContactTF;
    @javafx.fxml.FXML
    private TextArea PreviewTA;
    @javafx.fxml.FXML
    private ComboBox<String> TourSessionCB;
    @javafx.fxml.FXML
    private TextField NumberGuestTF;
    @javafx.fxml.FXML
    private TextField GroupNameTF;
    private int registrationCount = 1;


    @javafx.fxml.FXML
    public void initialize() {
        TourSessionCB.getItems().addAll("CityTour - Morning"," Historical Tour","Nature Adventure ","Food Tour");
    }

    @javafx.fxml.FXML
    public void submitRegistrationOA(ActionEvent actionEvent) {
        if(ContactTF.getText().isBlank() ||
                PaymentTF.getText().isBlank()) {

            PreviewTA.setText("Please enter contact and payment information.");
            return;
        }int guests;
        try {guests = Integer.parseInt(NumberGuestTF.getText());

        } catch(Exception e) {
            PreviewTA.setText("Guest number must be numeric.");
            return;
        }
        if(guests > 50){PreviewTA.setText("Tour capacity exceeded.");
            return;}

        PreviewTA.setText(
                "Registration Successful\n\n" +
                        "Registration ID: " + registrationCount +
                        "\nTour: " + TourSessionCB.getValue() +
                        "\nGroup: " + GroupNameTF.getText() +
                        "\nGuests: " + guests
        );
    }

    @javafx.fxml.FXML
    public void previewRegistrationOA(ActionEvent actionEvent) {
        if(TourSessionCB.getValue() == null || GroupNameTF.getText().isBlank() || NumberGuestTF.getText().isBlank() || GuestDetailsTA.getText().isBlank()) {
            PreviewTA.setText("Please fill all required fields.");
            return;}

        PreviewTA.setText(
                "----- Registration Preview -----\n\n" +
                        "Tour Session: " + TourSessionCB.getValue() + "\n" +
                        "Group Name: " + GroupNameTF.getText() + "\n" +
                        "Number of Guests: " + NumberGuestTF.getText() + "\n" +
                        "Guest Details: " + GuestDetailsTA.getText() + "\n" +
                        "Contact: " + ContactTF.getText() + "\n" +
                        "Payment: " + PaymentTF.getText()
        );
    }

    @javafx.fxml.FXML
    public void BackToDashboardOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/Veronica/TourGuide/TourGuideDashBoardView.fxml", "Tour Guide Dashboard");
    }


    }