package Veronica.TourGuide;

import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TourGuideDashboardController {

    private TourGuide loggedInGuide;
    @FXML
    private Label welcomeLabel;


    @FXML
    public void initialize() {
    }
    @FXML
    private void createTourSessionOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/TourSessionView.fxml", "Create Tour Session");
    }


    @FXML
    private void registerGuestOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/GuestRegistrationView.fxml", "Guest Registration");
    }


    @FXML
    private void closeTourOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/TourSessionView.fxml", "Tour Session");
    }


    @FXML
    private void reportIncidentOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/IncidentView.fxml", " Incident");
    }


    @FXML
    private void recordAttendanceOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/AttendanceView.fxml", "Guest Attendance");
    }


    @FXML
    private void viewScheduleOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/TourScheduleView.fxml", "Assigned Tour Schedule");
    }


    @FXML
    private void attractionInfoOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/AttractionView.fxml", "Attraction Information");
    }


    @FXML
    private void notificationOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/NotificationView.fxml", "Ride Updates and Notifications");
    }


    @FXML
    private void logoutOA(ActionEvent event) {
        loggedInGuide = null;
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "Login");
    }
}
