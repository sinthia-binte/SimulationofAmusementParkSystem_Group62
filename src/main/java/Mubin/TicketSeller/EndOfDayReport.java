package Mubin.TicketSeller;

import java.util.Date;

public class EndOfDayReport {
    private int reportId;
    private Date date;
    private int totalRevenue;
    private int cashTotal;
    private int discrepancy;

    public EndOfDayReport(int reportId, Date date, int totalRevenue, int cashTotal, int discrepancy) {
        this.reportId = reportId;
        this.date = date;
        this.totalRevenue = totalRevenue;
        this.cashTotal = cashTotal;
        this.discrepancy = discrepancy;
    }

    public int getReportId() { return reportId; }
    public void setReportId(int reportId) { this.reportId = reportId; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public int getTotalRevenue() { return totalRevenue; }
    public void setTotalRevenue(int totalRevenue) { this.totalRevenue = totalRevenue; }

    public int getCashTotal() { return cashTotal; }
    public void setCashTotal(int cashTotal) { this.cashTotal = cashTotal; }

    public int getDiscrepancy() { return discrepancy; }
    public void setDiscrepancy(int discrepancy) { this.discrepancy = discrepancy; }

    @Override
    public String toString() {
        return "EndOfDayReport{" +
                "reportId=" + reportId +
                ", date=" + date +
                ", totalRevenue=" + totalRevenue +
                ", cashTotal=" + cashTotal +
                ", discrepancy=" + discrepancy +
                '}';
    }

}