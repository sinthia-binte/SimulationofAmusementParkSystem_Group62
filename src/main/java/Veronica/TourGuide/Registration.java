package Veronica.TourGuide;

import java.util.ArrayList;

public class Registration {

    private String registrationId;
    private String tourSession;
    private ArrayList<Guest> guests;


    public Registration(String registrationId,
                        String tourSession,
                        ArrayList<Guest> guests) {

        this.registrationId = registrationId;
        this.tourSession = tourSession;
        this.guests = guests;
    }


    public String getRegistrationId() {
        return registrationId;
    }


    public String getTourSession() {
        return tourSession;
    }


    public ArrayList<Guest> getGuests() {
        return guests;
    }
}
