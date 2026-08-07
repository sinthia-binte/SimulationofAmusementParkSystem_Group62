package Veronica.TourGuide;

import java.io.Serializable;

public class Guest implements Serializable {

    private String guestName,contact,email,address;


    public Guest(String guestName, String contact, String email, String address) {
        this.guestName = guestName;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }


    public String getGuestName() {
        return guestName;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Guest Name: " + guestName +
                "\nContact: " + contact +
                "\nEmail: " + email +
                "\nAddress: " + address;
    }
}
