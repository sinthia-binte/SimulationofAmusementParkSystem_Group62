package Sinthia.SecurityInCharge;

public class SecurityInCharge {
    public String userId;
    public String name;
    public String role;

    public SecurityInCharge(String userId, String name, String role) {
        this.userId = userId;
        this.name = name;
        this.role = role;
    }

    public boolean  monitorSecurity(){
        return false;
    }

    public boolean  recordIncident(){
        return false;
    }
    public boolean  verifyAccess(){
        return false;
    }
    public boolean  generateReport(){
        return false;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SecurityInCharge{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
