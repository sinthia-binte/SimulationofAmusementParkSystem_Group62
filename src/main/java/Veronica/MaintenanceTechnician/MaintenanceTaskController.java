package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaintenanceTaskController {

    @FXML
    private ComboBox<String> TaskCB;

    @FXML
    private TextField TaskDescriptionTF;

    @FXML
    private TextField LocationTF;

    @FXML
    private TextField CurrentStatusTF;

    @FXML
    private TextField WorkDoneTF;

    @FXML
    private TextField PartsUsedTF;

    @FXML
    private TextField CompletionNotesTF;

    @FXML
    private TextField EvidencePathTF;

    @FXML
    private TextField ReviewTF;

    @FXML
    private TextField NotificationTF;


    private MaintenanceTask selectedTask;


    @FXML
    public void initialize() {

        loadTasks();

    }


    private void loadTasks() {

        ArrayList<MaintenanceTask> tasks =
                BinaryFileUtil.readObjects("MaintenanceTask.bin");


        for(MaintenanceTask task : tasks){

            TaskCB.getItems().add(
                    task.getTaskId()
            );

        }

    }


    @FXML
    public void loadTaskDetailsOA(ActionEvent event){

        String id = TaskCB.getValue();


        ArrayList<MaintenanceTask> tasks =
                BinaryFileUtil.readObjects("MaintenanceTask.bin");


        for(MaintenanceTask task : tasks){

            if(task.getTaskId().equals(id)){

                selectedTask = task;

                TaskDescriptionTF.setText(
                        task.getTaskDescription()
                );

                LocationTF.setText(
                        task.getLocation()
                );

                CurrentStatusTF.setText(
                        task.getCurrentStatus()
                );

                break;
            }

        }

    }


    @FXML
    public void reviewCompletionOA(ActionEvent event){

        ReviewTF.setText(
                "Task: " + TaskDescriptionTF.getText()
                        + "\nWork Done: " + WorkDoneTF.getText()
                        + "\nParts Used: " + PartsUsedTF.getText()
                        + "\nNotes: " + CompletionNotesTF.getText()
        );

    }


    @FXML
    public void completeTaskOA(ActionEvent event){

        if(selectedTask == null){

            NotificationTF.setText(
                    "Select a task first"
            );

            return;
        }


        MaintenanceTask task =
                new MaintenanceTask(
                        selectedTask.getTaskId(),
                        selectedTask.getEquipmentId(),
                        selectedTask.getTaskDescription(),
                        selectedTask.getLocation(),
                        "Completed",
                        WorkDoneTF.getText(),
                        PartsUsedTF.getText(),
                        CompletionNotesTF.getText(),
                        EvidencePathTF.getText(),
                        "Maintenance Technician",
                        "Completed",
                        LocalDate.now()
                );


        BinaryFileUtil.appendObject(
                "CompletedMaintenanceTask.bin",
                task
        );


        NotificationTF.setText(
                "Completed Successfully"
        );

    }


    @FXML
    public void uploadEvidenceOA(ActionEvent event){

        EvidencePathTF.setText(
                "evidence.jpg"
        );

    }


    @FXML
    public void clearFormOA(ActionEvent event){

        WorkDoneTF.clear();
        PartsUsedTF.clear();
        CompletionNotesTF.clear();
        EvidencePathTF.clear();
        ReviewTF.clear();
        NotificationTF.clear();

    }

}