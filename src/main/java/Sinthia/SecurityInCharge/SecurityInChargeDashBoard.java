package Sinthia.SecurityInCharge;

public class SecurityInChargeDashBoard {

    private String goal1;
    private String goal2;
    private String goal3;
    private String goal4;
    private String goal5;
    private String goal6;
    private String goal7;
    private String goal8;

    public SecurityInChargeDashBoard() {
    }

    public SecurityInChargeDashBoard(
            String goal1,
            String goal2,
            String goal3,
            String goal4,
            String goal5,
            String goal6,
            String goal7,
            String goal8) {

        this.goal1 = goal1;
        this.goal2 = goal2;
        this.goal3 = goal3;
        this.goal4 = goal4;
        this.goal5 = goal5;
        this.goal6 = goal6;
        this.goal7 = goal7;
        this.goal8 = goal8;
    }


    public String getGoal1() {
        return goal1;
    }

    public void setGoal1(String goal1) {
        this.goal1 = goal1;
    }


    public String getGoal2() {
        return goal2;
    }

    public void setGoal2(String goal2) {
        this.goal2 = goal2;
    }


    public String getGoal3() {
        return goal3;
    }

    public void setGoal3(String goal3) {
        this.goal3 = goal3;
    }


    public String getGoal4() {
        return goal4;
    }

    public void setGoal4(String goal4) {
        this.goal4 = goal4;
    }


    public String getGoal5() {
        return goal5;
    }

    public void setGoal5(String goal5) {
        this.goal5 = goal5;
    }


    public String getGoal6() {
        return goal6;
    }

    public void setGoal6(String goal6) {
        this.goal6 = goal6;
    }


    public String getGoal7() {
        return goal7;
    }

    public void setGoal7(String goal7) {
        this.goal7 = goal7;
    }


    public String getGoal8() {
        return goal8;
    }

    public void setGoal8(String goal8) {
        this.goal8 = goal8;
    }

    public void securityMonitoring() {
        System.out.println("Security Monitoring");
    }

    public void securityThreatManagement() {
        System.out.println("Security Threat Management");
    }

    public void emergencyResponse() {
        System.out.println("Emergency Response");
    }

    public void securityReport() {
        System.out.println("Security Report");
    }

    public void safetyCompliance() {
        System.out.println("Safety Compliance");
    }

    public void registration() {
        System.out.println("Registration");
    }

    public void securityStaffTraining() {
        System.out.println("Security Staff Training");
    }

    public void guestSecurityService() {
        System.out.println("Guest Security & Service");
    }


    @Override
    public String toString() {
        return "SecurityInChargeDashBoard{" +
                "goal1='" + goal1 + '\'' +
                ", goal2='" + goal2 + '\'' +
                ", goal3='" + goal3 + '\'' +
                ", goal4='" + goal4 + '\'' +
                ", goal5='" + goal5 + '\'' +
                ", goal6='" + goal6 + '\'' +
                ", goal7='" + goal7 + '\'' +
                ", goal8='" + goal8 + '\'' +
                '}';
    }
}