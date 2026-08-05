package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
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
    private TextArea WorkDoneTF;

    @FXML
    private TextArea PartsUsedTF;

    @FXML
    private TextArea CompletionNotesTF;

    @FXML
    private TextArea ReviewTF;

    @FXML
    private TextField NotificationTF;



    private MaintenanceTask selectedTask;



    @FXML
    public void initialize() {

        loadTasks();

    }





    private void loadTasks() {
        ArrayList<MaintenanceTask> tasks = BinaryFileUtil.readObjects(
                        "MaintenanceTask.bin"
                );



        for(MaintenanceTask task : tasks){


            TaskCB.getItems().add(
                    task.getTaskId()
            );

        }

    }





    @FXML
    public void loadTaskDetailsOA(ActionEvent event) {


        String id =
                TaskCB.getValue();



        ArrayList<MaintenanceTask> tasks =
                BinaryFileUtil.readObjects(
                        "MaintenanceTask.bin"
                );



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
    public void reviewCompletionOA(ActionEvent event) {


        ReviewTF.setText(

                "Task: "
                        + TaskDescriptionTF.getText()

                        + "\n\nWork Done: "
                        + WorkDoneTF.getText()

                        + "\n\nParts Used: "
                        + PartsUsedTF.getText()

                        + "\n\nCompletion Notes: "
                        + CompletionNotesTF.getText()

        );

    }





    @FXML
    public void completeTaskOA(ActionEvent event) {


        if(selectedTask == null){


            NotificationTF.setText(
                    "Please select a task first."
            );


            return;

        }



        MaintenanceTask completedTask =
                new MaintenanceTask(

                        selectedTask.getTaskId(),

                        selectedTask.getEquipmentId(),

                        selectedTask.getTaskDescription(),

                        selectedTask.getLocation(),

                        "Completed",

                        WorkDoneTF.getText(),

                        PartsUsedTF.getText(),

                        CompletionNotesTF.getText(),

                        "Maintenance Technician",

                        "Completed",

                        LocalDate.now()

                );



        BinaryFileUtil.appendObject(
                "CompletedMaintenanceTask.bin",
                completedTask
        );



        NotificationTF.setText(
                "Task completed successfully."
        );

    }





    @FXML
    public void clearFormOA(ActionEvent event) {


        WorkDoneTF.clear();

        PartsUsedTF.clear();

        CompletionNotesTF.clear();

        ReviewTF.clear();

        NotificationTF.clear();

    }





    @FXML
    public void BackOA(ActionEvent event) {

        SceneSwitcher.switchScene(event, "/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml", "Maintenance Technician Dashboard");

    }

}
