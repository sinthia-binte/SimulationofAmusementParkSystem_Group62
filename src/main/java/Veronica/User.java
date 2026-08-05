package Veronica;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {

    private final String id;
    private final String name;
    private final String gender;
    private final String password;

    private String phoneNo;
    private String address;
    private final String email;

    private final LocalDate dob;
    private final LocalDate doj;


    public User(String name,
                String gender,
                String password,
                String id,
                LocalDate dob,
                String address,
                String phoneNo,
                String email) {

        this.name = name;
        this.gender = gender;
        this.password = password;
        this.id = id;
        this.dob = dob;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
        this.doj = LocalDate.now();
    }


    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }


    public String getPassword() {
        return password;
    }


    public String getPhoneNo() {
        return phoneNo;
    }


    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }


    public LocalDate getDob() {
        return dob;
    }


    public LocalDate getDoj() {
        return doj;
    }


    @Override
    public String toString() {

        return "ID: " + id +
                "\nName: " + name +
                "\nGender: " + gender +
                "\nPassword: " + password +
                "\nPhone: " + phoneNo +
                "\nEmail: " + email +
                "\nAddress: " + address +
                "\nDOB: " + dob +
                "\nDOJ: " + doj;
    }
}
