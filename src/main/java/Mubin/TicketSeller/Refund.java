package Mubin.TicketSeller;

public class Refund {
    private int refundId;
    private String ticketRefId;
    private String reason;
    private int deductionAmt;
    private int netRefund;

    public Refund(int refundId, String ticketRefId, String reason, int deductionAmt, int netRefund) {
        this.refundId = refundId;
        this.ticketRefId = ticketRefId;
        this.reason = reason;
        this.deductionAmt = deductionAmt;
        this.netRefund = netRefund;
    }

    public int getRefundId() { return refundId; }
    public void setRefundId(int refundId) { this.refundId = refundId; }

    public String getTicketRefId() { return ticketRefId; }
    public void setTicketRefId(String ticketRefId) { this.ticketRefId = ticketRefId; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public int getDeductionAmt() { return deductionAmt; }
    public void setDeductionAmt(int deductionAmt) { this.deductionAmt = deductionAmt; }

    public int getNetRefund() { return netRefund; }
    public void setNetRefund(int netRefund) { this.netRefund = netRefund; }

    @Override
    public String toString() {
        return "Refund{" +
                "refundId=" + refundId +
                ", ticketRefId='" + ticketRefId + '\'' +
                ", reason='" + reason + '\'' +
                ", deductionAmt=" + deductionAmt +
                ", netRefund=" + netRefund +
                '}';
    }

    public void verifyEligibility() {}
    public void calculateRefund() {}
    public void processRefund() {}
}