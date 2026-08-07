package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;


public class MaintenanceTechnicianDashboardController {


    @FXML
    private TableView<MaintenanceTask> taskTableTV;

    @FXML
    private TableColumn<MaintenanceTask,String> taskIdTC;

    @FXML
    private TableColumn<MaintenanceTask,String> locationTC;

    @FXML
    private TableColumn<MaintenanceTask,String> priorityTC;

    @FXML
    private TableColumn<MaintenanceTask,String> statusTC;


    @FXML
    private TextArea alertTA;


    @FXML
    private Label technicianNameLabel;

    @FXML
    private Label pendingTaskLabel;

    @FXML
    private Label progressTaskLabel;

    @FXML
    private Label completedTaskLabel;



    @FXML
    public void initialize(){

        taskIdTC.setCellValueFactory(new PropertyValueFactory<>("taskId"));
        locationTC.setCellValueFactory(new PropertyValueFactory<>("location"));
        priorityTC.setCellValueFactory(new PropertyValueFactory<>("priority"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));


    }

    @FXML
    public void openAssignedTasksOA(ActionEvent event){

        ArrayList<MaintenanceTask> tasks = BinaryFileUtil.readList("MaintenanceTask.bin");
        ObservableList<MaintenanceTask> list = FXCollections.observableArrayList();

        int pending = 0;
        int progress = 0;
        int completed = 0;

        for(MaintenanceTask task : tasks){
            list.add(task);
            if(task.getStatus().equals("Pending")){
                pending++;

            }
            else if(task.getStatus().equals("In Progress")){
                progress++;

            }

            else if(task.getStatus().equals("Completed")){

                completed++;

            }

        }
        taskTableTV.setItems(list);
        pendingTaskLabel.setText(String.valueOf(pending));
        progressTaskLabel.setText(String.valueOf(progress));
        completedTaskLabel.setText(String.valueOf(completed));
        alertTA.setText("Tasks loaded successfully.");
    }

    @FXML
    public void openRideInspectionOA(ActionEvent event){

        SceneSwitcher.switchScene(event, "RideInspection.fxml", "Ride Inspection");

    }

    @FXML
    public void openMaintenanceRecordOA(ActionEvent event){

        SceneSwitcher.switchScene(event, "MaintenanceRecord.fxml", "Record Maintenance");

    }

    @FXML
    public void openReportFaultOA(ActionEvent event){
        SceneSwitcher.switchScene(event, "ReportFault.fxml", "Report Fault");

    }
    @FXML
    public void openPartsRequestOA(ActionEvent event){
        SceneSwitcher.switchScene(event, "PartsRequest.fxml", "Request Parts");

    }
    @FXML
    public void openUpdateStatusOA(ActionEvent event){

        SceneSwitcher.switchScene(event, "UpdateStatus.fxml", "Update Status");

    }


    @FXML
    public void openManualOA(ActionEvent event){

        SceneSwitcher.switchScene(event, "RepairManual.fxml", "Repair Manuals");

    }
    @FXML
    public void openCompleteTaskOA(ActionEvent event){
        SceneSwitcher.switchScene(event, "CompleteTask.fxml", "Complete Task");

    }

    @FXML
    public void logoutOA(ActionEvent event){

        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml","log out");

    }

}
