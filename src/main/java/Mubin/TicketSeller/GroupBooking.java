package Mubin.TicketSeller;

import java.util.Date;

public class GroupBooking {
    private int bookingId;
    private String groupName;
    private String contactPerson;
    private int memberCount;
    private Date visitDate;
    private int depositAmt;

    public GroupBooking(int bookingId, String groupName, String contactPerson, int memberCount, Date visitDate, int depositAmt) {
        this.bookingId = bookingId;
        this.groupName = groupName;
        this.contactPerson = contactPerson;
        this.memberCount = memberCount;
        this.visitDate = visitDate;
        this.depositAmt = depositAmt;
    }

    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public String getGroupName() { return groupName; }
    public void setGroupName(String groupName) { this.groupName = groupName; }

    public String getContactPerson() { return contactPerson; }
    public void setContactPerson(String contactPerson) { this.contactPerson = contactPerson; }

    public int getMemberCount() { return memberCount; }
    public void setMemberCount(int memberCount) { this.memberCount = memberCount; }

    public Date getVisitDate() { return visitDate; }
    public void setVisitDate(Date visitDate) { this.visitDate = visitDate; }

    public int getDepositAmt() { return depositAmt; }
    public void setDepositAmt(int depositAmt) { this.depositAmt = depositAmt; }

    @Override
    public String toString() {
        return "GroupBooking{" +
                "bookingId=" + bookingId +
                ", groupName='" + groupName + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", memberCount=" + memberCount +
                ", visitDate=" + visitDate +
                ", depositAmt=" + depositAmt +
                '}';
    }

    public void validateDetails() {}
    public void verifyCapacity() {}
    public void calcPricing() {}
    public void confirmBooking() {}
}