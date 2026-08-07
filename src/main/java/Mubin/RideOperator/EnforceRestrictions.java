package Mubin.RideOperator;

public class EnforceRestrictions {
    private int ruleId;
    private String rideId;
    private int heightMin;
    private int weightLimit;
    private int ageLimit;

    public EnforceRestrictions(int ruleId, String rideId, int heightMin, int weightLimit, int ageLimit) {
        this.ruleId = ruleId;
        this.rideId = rideId;
        this.heightMin = heightMin;
        this.weightLimit = weightLimit;
        this.ageLimit = ageLimit;
    }

    public int getRuleId() { return ruleId; }
    public void setRuleId(int ruleId) { this.ruleId = ruleId; }

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public int getHeightMin() { return heightMin; }
    public void setHeightMin(int heightMin) { this.heightMin = heightMin; }

    public int getWeightLimit() { return weightLimit; }
    public void setWeightLimit(int weightLimit) { this.weightLimit = weightLimit; }

    public int getAgeLimit() { return ageLimit; }
    public void setAgeLimit(int ageLimit) { this.ageLimit = ageLimit; }

    @Override
    public String toString() {
        return "EnforceRestrictions{" +
                "ruleId=" + ruleId +
                ", rideId='" + rideId + '\'' +
                ", heightMin=" + heightMin +
                ", weightLimit=" + weightLimit +
                ", ageLimit=" + ageLimit +
                '}';
    }
}