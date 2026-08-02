package Veronica.MaintenanceTechnician;

import Veronica.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaintenanceTechnician extends User {

    private ArrayList<MaintenanceTask> assignedTasks;


    public MaintenanceTechnician(String name, String phoneNo, String email, String address, String gender, String password, LocalDate dob, ArrayList<MaintenanceTask> assignedTasks) {
        super(name, phoneNo, email, address, gender, password, dob);
        this.assignedTasks = assignedTasks;
    }

    @Override
    public String generateId() {

        return "MT" + System.currentTimeMillis();

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