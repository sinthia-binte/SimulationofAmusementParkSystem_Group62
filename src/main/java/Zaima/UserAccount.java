package Zaima;

import java.io.Serializable;

public class UserAccount implements Serializable {

    private String userId;
    private String name;
    private String username;
    private String email;
    private String role;
    private String status;
    private String password;

    public UserAccount(String email, String name, String password, String role, String status, String userId, String username) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
        this.status = status;
        this.userId = userId;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return userId + " - " + name + " - " + role + " - " + status;
    }
}

