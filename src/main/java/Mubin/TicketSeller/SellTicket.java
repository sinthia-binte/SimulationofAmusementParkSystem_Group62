package Mubin.TicketSeller;

import java.util.Date;

public class SellTicket {
    private final String ticketId;
    private String ticketType;
    private int price;
    private String qrCode;
    private String status;
    private Date purchaseDate;
    private Date visitDate;

    public SellTicket(String ticketId, String ticketType, int price, String qrCode, String status, Date purchaseDate, Date visitDate) {
        this.ticketId = ticketId;
        this.ticketType = ticketType;
        this.price = price;
        this.qrCode = qrCode;
        this.status = status;
        this.purchaseDate = purchaseDate;
        this.visitDate = visitDate;
    }

    public String getTicketId() { return ticketId; }

    public String getTicketType() { return ticketType; }
    public void setTicketType(String ticketType) { this.ticketType = ticketType; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getQrCode() { return qrCode; }
    public void setQrCode(String qrCode) { this.qrCode = qrCode; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }

    public Date getVisitDate() { return visitDate; }
    public void setVisitDate(Date visitDate) { this.visitDate = visitDate; }

    @Override
    public String toString() {
        return "SellTicket{" +
                "ticketId='" + ticketId + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", price=" + price +
                ", qrCode='" + qrCode + '\'' +
                ", status='" + status + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", visitDate=" + visitDate +
                '}';
    }
}