package Veronica.MaintenanceTechnician;

import Veronica.User;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class MaintenanceTechnician extends User implements Serializable {

    private ArrayList<MaintenanceTask> assignedTasks;


    public MaintenanceTechnician(String name,
                                 String gender,
                                 String password,
                                 String id,
                                 LocalDate dob,
                                 String address,
                                 String phoneNo,
                                 String email) {


        super(name,
                gender,
                password,
                id,
                dob,
                address,
                phoneNo,
                email);


        this.assignedTasks = new ArrayList<>();

    }



    public ArrayList<MaintenanceTask> getAssignedTasks() {

        return assignedTasks;

    }



    public void setAssignedTasks(ArrayList<MaintenanceTask> assignedTasks) {

        this.assignedTasks = assignedTasks;

    }



    public void addTask(MaintenanceTask task) {

        assignedTasks.add(task);

    }



    public void removeTask(MaintenanceTask task) {

        assignedTasks.remove(task);

    }



    @Override
    public String toString() {

        return "Maintenance Technician\n" +
                super.toString() +
                "\nAssigned Tasks: " + assignedTasks.size();

    }

}
