package Mubin.TicketSeller;

import java.util.Date;


public class Transaction {
    private String transactionId;
    private Date transactionDate;
    private double amount;
    private String type;
    private String referenceId;

    public Transaction(String transactionId, Date transactionDate, double amount, String type, String referenceId) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.type = type;
        this.referenceId = referenceId;
    }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public Date getTransactionDate() { return transactionDate; }
    public void setTransactionDate(Date transactionDate) { this.transactionDate = transactionDate; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getReferenceId() { return referenceId; }
    public void setReferenceId(String referenceId) { this.referenceId = referenceId; }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionDate=" + transactionDate +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", referenceId='" + referenceId + '\'' +
                '}';
    }
}