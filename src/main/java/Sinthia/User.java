package Sinthia;

import java.io.Serializable;

public abstract class User implements Serializable {
    protected int userId;
    protected String password;
    public static int userCount = 0;

    public User() {
        userCount++;
    }

    public User(int userId, String password) {
        this.userId = userId;
        this.password = password;
        userCount++;
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public static int getUserCount() { return userCount; }

    // Domain Methods
    public boolean login(String email, String password) {
        return this.password != null && this.password.equals(password);
    }

    public boolean logout() {
        return true;
    }

    public boolean updateProfile(String name, String phone) {
        return true;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password != null && this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public abstract boolean performDuty();

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + '}';
    }
}