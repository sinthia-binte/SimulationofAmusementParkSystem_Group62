package Mubin.TicketSeller;

import java.util.Date;

public class PromoCode {
    private int codeId;
    private String code;
    private int discountPct;
    private Date expiryDate;
    private int usageQuota;
    private int usedCount;

    public PromoCode(int codeId, String code, int discountPct, Date expiryDate, int usageQuota, int usedCount) {
        this.codeId = codeId;
        this.code = code;
        this.discountPct = discountPct;
        this.expiryDate = expiryDate;
        this.usageQuota = usageQuota;
        this.usedCount = usedCount;
    }

    public int getCodeId() { return codeId; }
    public void setCodeId(int codeId) { this.codeId = codeId; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public int getDiscountPct() { return discountPct; }
    public void setDiscountPct(int discountPct) { this.discountPct = discountPct; }

    public Date getExpiryDate() { return expiryDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }

    public int getUsageQuota() { return usageQuota; }
    public void setUsageQuota(int usageQuota) { this.usageQuota = usageQuota; }

    public int getUsedCount() { return usedCount; }
    public void setUsedCount(int usedCount) { this.usedCount = usedCount; }

    @Override
    public String toString() {
        return "PromoCode{" +
                "codeId=" + codeId +
                ", code='" + code + '\'' +
                ", discountPct=" + discountPct +
                ", expiryDate=" + expiryDate +
                ", usageQuota=" + usageQuota +
                ", usedCount=" + usedCount +
                '}';
    }

}