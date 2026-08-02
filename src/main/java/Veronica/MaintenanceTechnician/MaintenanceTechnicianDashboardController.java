package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


import java.util.ArrayList;

public class MaintenanceTechnicianDashboardController {


    @FXML
    private Label TechnicianNameLabel;

    @FXML
    private Label CompletedTaskLabel;

    @FXML
    private Label ProgressTaskLabel;

    @FXML
    private Label PendingTaskLabel;

    @FXML
    private TextArea AlertTA;


    @FXML
    private TableView<MaintenanceTask> taskTableTV;

    @FXML
    private TableColumn<MaintenanceTask, String> locationTC;

    @FXML
    private TableColumn<MaintenanceTask, String> priorityTC;

    @FXML
    private TableColumn<MaintenanceTask, String> taskIdTC;

    @FXML
    private TableColumn<MaintenanceTask, String> statusTC;



    @FXML
    public void initialize() {
        taskIdTC.setCellValueFactory(new PropertyValueFactory<>("taskId"));
        locationTC.setCellValueFactory(new PropertyValueFactory<>("location"));
        priorityTC.setCellValueFactory(new PropertyValueFactory<>("currentStatus"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        loadTasks();

    }



    public void loadTasks() {
        ArrayList<MaintenanceTask> tasks = BinaryFileUtil.readObjects("MaintenanceTask.bin");
        ObservableList<MaintenanceTask> list = FXCollections.observableArrayList();


        int pending = 0;
        int progress = 0;
        int completed = 0;


        for(MaintenanceTask task : tasks) {
            if(task.getTaskId() != null) {
                list.add(task);
                if(task.getStatus().equals("Pending")) {
                    pending++;

                }

                else if(task.getStatus().equals("In Progress")) {
                    progress++;

                }

                else if(task.getStatus().equals("Completed")) {
                    completed++;

                }

            }

        }
        taskTableTV.setItems(list);


        PendingTaskLabel.setText(String.valueOf(pending));
        ProgressTaskLabel.setText(String.valueOf(progress));
        CompletedTaskLabel.setText(String.valueOf(completed));
        AlertTA.setText("Tasks loaded successfully");

    }
    @FXML
    public void openAssignedTasksOA(ActionEvent actionEvent) {
        loadTasks();
    }
    @FXML
    public void openHistoryOA(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Maintenance History");
        alert.show();

    }
    @FXML
    public void openReportIssueOA(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Report Issue");
        alert.show();

    }
    @FXML
    public void logoutOA(ActionEvent actionEvent) {
        System.out.println("Logged out");

    }

}
