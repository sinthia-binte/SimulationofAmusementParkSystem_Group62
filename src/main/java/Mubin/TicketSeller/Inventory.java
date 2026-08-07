package Mubin.TicketSeller;

public class Inventory {
    private String inventoryId;
    private String ticketType;
    private int totalQty;
    private int soldQty;
    private int remainingQty;

    public Inventory(String inventoryId, String ticketType, int totalQty, int soldQty, int remainingQty) {
        this.inventoryId = inventoryId;
        this.ticketType = ticketType;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.remainingQty = remainingQty;
    }

    public String getInventoryId() { return inventoryId; }
    public void setInventoryId(String inventoryId) { this.inventoryId = inventoryId; }

    public String getTicketType() { return ticketType; }
    public void setTicketType(String ticketType) { this.ticketType = ticketType; }

    public int getTotalQty() { return totalQty; }
    public void setTotalQty(int totalQty) { this.totalQty = totalQty; }

    public int getSoldQty() { return soldQty; }
    public void setSoldQty(int soldQty) { this.soldQty = soldQty; }

    public int getRemainingQty() { return remainingQty; }
    public void setRemainingQty(int remainingQty) { this.remainingQty = remainingQty; }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId='" + inventoryId + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", totalQty=" + totalQty +
                ", soldQty=" + soldQty +
                ", remainingQty=" + remainingQty +
                '}';
    }
}