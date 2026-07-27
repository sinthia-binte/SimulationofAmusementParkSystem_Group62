package Veronica.MaintenanceTechnician;


public class Maintenancet {


    private int technicianID;
    private String technicianName;
    private int pendingTasks;
    private int inProgressTasks;
    private int completedTasks;
    private String alerts;



    public Maintenancet(int technicianID,
                                 String technicianName,
                                 int pendingTasks,
                                 int inProgressTasks,
                                 int completedTasks,
                                 String alerts) {


        this.technicianID = technicianID;
        this.technicianName = technicianName;
        this.pendingTasks = pendingTasks;
        this.inProgressTasks = inProgressTasks;
        this.completedTasks = completedTasks;
        this.alerts = alerts;

    }




    public int getTechnicianID() {

        return technicianID;

    }



    public String getTechnicianName() {

        return technicianName;

    }



    public int getPendingTasks() {

        return pendingTasks;

    }



    public int getInProgressTasks() {

        return inProgressTasks;

    }



    public int getCompletedTasks() {

        return completedTasks;

    }



    public String getAlerts() {

        return alerts;

    }





    public void setPendingTasks(int pendingTasks) {

        this.pendingTasks = pendingTasks;

    }



    public void setInProgressTasks(int inProgressTasks) {

        this.inProgressTasks = inProgressTasks;

    }



    public void setCompletedTasks(int completedTasks) {

        this.completedTasks = completedTasks;

    }



    public void setAlerts(String alerts) {

        this.alerts = alerts;

    }




    @Override
    public String toString() {

        return technicianName;

    }


}