package Veronica.TourGuide;

import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TourCompletionController {

    @FXML
    private TextField GuestCountTF;

    @FXML
    private ComboBox<TourCompletion> TourSessionCB;

    @FXML
    private TextField AttendanceTF;

    @FXML
    private TextField DurationTF;

    @FXML
    private Label ConfirmationLabel;

    @FXML
    private Label ReviewLabel;

    @FXML
    private TextArea SummaryTA;


    @FXML
    public void initialize() {

        TourSessionCB.getItems().addAll(new TourCompletion(1, 20, "Morning Tour", "18 Present", "2 Hours", "", "Active"),
                new TourCompletion(2, 15, "City Tour",
                        "15 Present", "3 Hours",
                        "", "Active"));
    }


    @FXML
    public void selectTourOA(ActionEvent actionEvent) {
        TourCompletion selectedTour = TourSessionCB.getValue();
        if (selectedTour != null) {
            GuestCountTF.setText(String.valueOf(selectedTour.getGuestCount()));
            AttendanceTF.setText(selectedTour.getAttendance());
            DurationTF.setText(selectedTour.getDuration());

        }
    }


    @FXML
    public void reviewCompletionOA(ActionEvent actionEvent) {

        TourCompletion selectedTour = TourSessionCB.getValue();

        if (selectedTour == null) {
            ReviewLabel.setText("Please select a tour session.");
            return;
        }

        if (SummaryTA.getText().isBlank()) {
            ReviewLabel.setText("Please enter completion summary.");
            return;
        }


        ReviewLabel.setText(
                "Tour Session: " + selectedTour.getTourSession() +
                        "\nGuest Count: " + selectedTour.getGuestCount() +
                        "\nAttendance: " + selectedTour.getAttendance() +
                        "\nDuration: " + selectedTour.getDuration() +
                        "\nSummary: " + SummaryTA.getText()
        );
    }


    @FXML
    public void submitCompletionOA(ActionEvent actionEvent) {

        TourCompletion selectedTour = TourSessionCB.getValue();

        if (selectedTour == null) {
            ConfirmationLabel.setText("Please select a tour session.");
            return;
        }

        if (SummaryTA.getText().isBlank()) {
            ConfirmationLabel.setText("Summary cannot be empty.");
            return;
        }


        selectedTour.setSummary(SummaryTA.getText());
        selectedTour.setStatus("Completed");


        ConfirmationLabel.setText(
                "Tour closed successfully.\n" +
                        "Tour Status: " + selectedTour.getStatus()
        );
    }


    @FXML
    public void BackToDashboardOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(actionEvent, "/Veronica/TourGuide/TourGuideDashBoardView.fxml", "Tour Guide Dashboard");
    }



}

