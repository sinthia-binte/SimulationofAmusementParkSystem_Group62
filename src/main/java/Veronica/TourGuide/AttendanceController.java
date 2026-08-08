package Veronica.TourGuide;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class AttendanceController {

    @FXML
    private ComboBox<String> SessionCB;

    @FXML
    private ComboBox<String> GuestCB;

    @FXML
    private ComboBox<String> StatusCB;

    @FXML
    private Label ConfirmationLabel;

    @FXML
    private Label ReviewLabel;


    private ObservableList<Attendance> attendanceList = FXCollections.observableArrayList();



    @FXML
    public void initialize() {

        SessionCB.getItems().addAll("City Tour", "Historical Tour", "Nature Adventure");
        StatusCB.getItems().addAll("Present", "Absent", "Late");
    }



    @FXML
    public void loadGuestListOA(ActionEvent event) {
        GuestCB.getItems().clear();
        GuestCB.getItems().addAll("John", "David", "Sarah");
    }

    @FXML
    public void markAttendanceOA(ActionEvent event) {

        if (SessionCB.getValue() == null
                || GuestCB.getValue() == null
                || StatusCB.getValue() == null) {
            ConfirmationLabel.setText("Please select all fields.");
            return;
        }
        Attendance attendance = new Attendance(GuestCB.getValue(), SessionCB.getValue(), StatusCB.getValue());
        attendanceList.add(attendance);
        ConfirmationLabel.setText("Attendance marked successfully.");
    }



    @FXML
    public void reviewAttendanceOA(ActionEvent event) {

        StringBuilder data = new StringBuilder();
        for (Attendance a : attendanceList) {
            data.append("Guest: ").append(a.getGuestName())
                    .append("\nSession: ")
                    .append(a.getTourSession())
                    .append("\nStatus: ")
                    .append(a.getStatus())
                    .append("\n\n");}

        if (data.length() == 0) {
            ReviewLabel.setText("No attendance records.");
        } else {ReviewLabel.setText(data.toString());
        }
    }

    @FXML
    public void saveAttendanceOA(ActionEvent event) {
        ArrayList<Attendance> list = new ArrayList<>(attendanceList);
        BinaryFileUtil.saveList("TourGuide.bin", list);ConfirmationLabel.setText("Attendance saved successfully.");
    }



    @FXML
    public void BackToDashboardOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/TourGuide/TourGuideDashBoardView.fxml", "Tour Guide Dashboard");
    }
}
