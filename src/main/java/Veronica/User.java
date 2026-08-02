package Veronica;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {

    private String id,name,phoneNo,email,address, password;
    private final String gender;
    private final LocalDate dob,doj;

    public User(String name, String phoneNo, String email,
                String address, String gender,
                String password, LocalDate dob) {

        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.dob = dob;
        this.doj = LocalDate.now();
        this.id = generateId();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Id = " + id +
                "\nName = " + name +
                "\nPassword = " + password +
                "\nPhone No = " + phoneNo +
                "\nEmail = " + email +
                "\nAddress = " + address +
                "\nGender = " + gender +
                "\nDate of Birth = " + dob +
                "\nDate of Joining = " + doj;
    }

    public abstract String generateId();
}