package Veronica.TourGuide;


public class Attendance {


    private String guestName;
    private String tourSession;
    private String status;


    public Attendance(String guestName,
                      String tourSession,
                      String status) {


        this.guestName = guestName;
        this.tourSession = tourSession;
        this.status = status;

    }



    public String getGuestName() {

        return guestName;

    }


    public String getTourSession() {

        return tourSession;

    }


    public String getStatus() {

        return status;

    }



    public void setStatus(String status) {

        this.status = status;

    }



    @Override
    public String toString(){

        return guestName + " - " + status;

    }




}