package Mubin.TicketSeller;

public class TicketSeller {
    private String employeeNo;
    private int counterNo;

    public TicketSeller(String employeeNo, int counterNo) {
        this.employeeNo = employeeNo;
        this.counterNo = counterNo;
    }

    public String getEmployeeNo() { return employeeNo; }
    public void setEmployeeNo(String employeeNo) { this.employeeNo = employeeNo; }

    public int getCounterNo() { return counterNo; }
    public void setCounterNo(int counterNo) { this.counterNo = counterNo; }

    @Override
    public String toString() {
        return "TicketSeller{" +
                "employeeNo='" + employeeNo + '\'' +
                ", counterNo=" + counterNo +
                '}';
    }

}