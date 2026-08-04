package Veronica.TourGuide;

import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TourGuideDashboardController {

    private TourGuide loggedInGuide;

    public void setLoggedInGuide(TourGuide guide) {
        this.loggedInGuide = guide;
    }

    @FXML
    public void initialize() {

    }

    @FXML
    private void createTourSessionOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "TourSessionView.fxml", "Create Tour Session");
    }

    @FXML
    private void registerGuestOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "Registration.fxml", "Guest Registration");
    }

    @FXML
    private void closeTourOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "CloseTour.fxml", "Close Tour");
    }

    @FXML
    private void reportIncidentOA(ActionEvent event) {
        SceneSwitcher.switchScene(
                event,
                "ReportIncident.fxml",
                "Report Incident"
        );
    }

    @FXML
    private void recordAttendanceOA(ActionEvent event) {
        SceneSwitcher.switchScene(
                event,
                "Attendance.fxml",
                "Guest Attendance"
        );
    }

    @FXML
    private void viewScheduleOA(ActionEvent event) {
        SceneSwitcher.switchScene(
                event,
                "TourSchedule.fxml",
                "Assigned Tour Schedule"
        );
    }

    @FXML
    private void attractionInfoOA(ActionEvent event) {
        SceneSwitcher.switchScene(
                event,
                "AttractionView.fxml",
                "Attraction Information"
        );
    }

    @FXML
    private void notificationOA(ActionEvent event) {
        SceneSwitcher.switchScene(
                event,
                "Notification.fxml",
                "Ride Updates and Notifications"
        );
    }

    @FXML
    private void logoutOA(ActionEvent event) {

        loggedInGuide = null;

        SceneSwitcher.switchScene(
                event,
                "Login.fxml",
                "Login"
        );
    }
}
