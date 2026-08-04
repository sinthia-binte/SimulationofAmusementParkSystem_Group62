package Veronica.TourGuide;

import Veronica.User;
import java.time.LocalDate;

public class TourGuide extends User {

    public TourGuide(String name, String phoneNo, String email, String address,
                     String gender, String password, LocalDate dob) {
        super(name, phoneNo, email, address, gender, password, dob);
    }

    @Override
    public String generateId() {
        return "TG" + (int)(Math.random() * 10000);
    }
}
