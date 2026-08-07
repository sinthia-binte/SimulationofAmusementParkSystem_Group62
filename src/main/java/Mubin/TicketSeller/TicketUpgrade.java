package Mubin.TicketSeller;

public class TicketUpgrade {
    private int upgradeId;
    private String origTicketId;
    private String newTicketType;
    private int priceDiff;

    public TicketUpgrade(int upgradeId, String origTicketId, String newTicketType, int priceDiff) {
        this.upgradeId = upgradeId;
        this.origTicketId = origTicketId;
        this.newTicketType = newTicketType;
        this.priceDiff = priceDiff;
    }

    public int getUpgradeId() { return upgradeId; }
    public void setUpgradeId(int upgradeId) { this.upgradeId = upgradeId; }

    public String getOrigTicketId() { return origTicketId; }
    public void setOrigTicketId(String origTicketId) { this.origTicketId = origTicketId; }

    public String getNewTicketType() { return newTicketType; }
    public void setNewTicketType(String newTicketType) { this.newTicketType = newTicketType; }

    public int getPriceDiff() { return priceDiff; }
    public void setPriceDiff(int priceDiff) { this.priceDiff = priceDiff; }

    @Override
    public String toString() {
        return "TicketUpgrade{" +
                "upgradeId=" + upgradeId +
                ", origTicketId='" + origTicketId + '\'' +
                ", newTicketType='" + newTicketType + '\'' +
                ", priceDiff=" + priceDiff +
                '}';
    }

    public void verifyEligibility() {}
    public void processUpgrade() {}
}