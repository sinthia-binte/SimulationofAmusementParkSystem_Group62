package Veronica.TourGuide;

import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TourGuideDashboardController {

    private TourGuide loggedInGuide;
    @FXML
    private Label welcomeLabel;


    public void setLoggedInGuide(TourGuide guide) {
        this.loggedInGuide = guide;
        if (guide != null) {
            welcomeLabel.setText("Welcome, " + guide.getName());}
    }
    @FXML
    public void initialize() {
    }
    @FXML
    private void createTourSessionOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/TourSessionView.fxml", "Create Tour Session");
    }


    @FXML
    private void registerGuestOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/Registration.fxml", "Guest Registration");
    }


    @FXML
    private void closeTourOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/CloseTour.fxml", "Close Tour");
    }


    @FXML
    private void reportIncidentOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/ReportIncident.fxml", "Report Incident");
    }


    @FXML
    private void recordAttendanceOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/Attendance.fxml", "Guest Attendance");
    }


    @FXML
    private void viewScheduleOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/TourSchedule.fxml", "Assigned Tour Schedule");
    }


    @FXML
    private void attractionInfoOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/AttractionView.fxml", "Attraction Information");
    }


    @FXML
    private void notificationOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/Notification.fxml", "Ride Updates and Notifications");
    }


    @FXML
    private void logoutOA(ActionEvent event) {
        loggedInGuide = null;
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Login.fxml", "Login");
    }
}
