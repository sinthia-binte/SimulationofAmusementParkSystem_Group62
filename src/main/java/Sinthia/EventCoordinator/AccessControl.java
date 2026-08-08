package Sinthia.EventCoordinator;

public class AccessControl {
    private String accessID;
    private String area;
    private String permission;

    public AccessControl() {}

    public AccessControl(String accessID, String area, String permission) {
        this.accessID = accessID;
        this.area = area;
        this.permission = permission;
    }
    public String getAccessID() { return accessID; }
    public void setAccessID(String accessID) { this.accessID = accessID; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public String getPermission() { return permission; }
    public void setPermission(String permission) { this.permission = permission; }

    public boolean verifyAccess() { return true; }
    public boolean updatePermission() { return true; }

    @Override
    public String toString() {
        return "AccessControl{" + "accessID='" + accessID + '\'' + ", area='" + area + '\'' + ", permission='" + permission + '\'' + '}';
    }
}
