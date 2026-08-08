package Mubin.RideOperator;


import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;


public class ViewScheduleViewController {

    @FXML
    private ListView<String> scheduleListView;

    @FXML
    public void initialize() {
    }

    @FXML
    public void loadScheduleButtonOA(ActionEvent event) {
    }

    @FXML
    public void backToDashboardbuttonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "RideOperatorDashboardView.fxml", "User Dashboard");
    }

    @FXML
    public void logOutButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }
}