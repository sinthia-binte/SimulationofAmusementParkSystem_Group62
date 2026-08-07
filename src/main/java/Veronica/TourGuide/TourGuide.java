package Veronica.TourGuide;

import Veronica.User;
import java.time.LocalDate;

public class TourGuide extends User {


    public TourGuide(String name, String gender, String password, String id, LocalDate dob, String address, String phoneNo, String email) {
        super(name, gender, password, id, dob, address, phoneNo, email);
    }

    @Override
    public String toString() {
        return "TourGuide{}";
    }
}
