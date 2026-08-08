package Sinthia.SecurityInCharge;

public class SafetyCompliance {

    private String inspectionArea;
    private String regulation;
    private String inspectionResult;
    private String violationDetails;
    private String correctiveAction;
    private String complianceScore;

    public SafetyCompliance() {
    }
    public SafetyCompliance(String inspectionArea, String regulation,
                            String inspectionResult, String violationDetails,
                            String correctiveAction, String complianceScore) {
        this.inspectionArea = inspectionArea;
        this.regulation = regulation;
        this.inspectionResult = inspectionResult;
        this.violationDetails = violationDetails;
        this.correctiveAction = correctiveAction;
        this.complianceScore = complianceScore;
    }

    public String getInspectionArea() {
        return inspectionArea;
    }

    public void setInspectionArea(String inspectionArea) {
        this.inspectionArea = inspectionArea;
    }

    public String getRegulation() {
        return regulation;
    }

    public void setRegulation(String regulation) {
        this.regulation = regulation;
    }

    public String getInspectionResult() {
        return inspectionResult;
    }

    public void setInspectionResult(String inspectionResult) {
        this.inspectionResult = inspectionResult;
    }

    public String getViolationDetails() {
        return violationDetails;
    }

    public void setViolationDetails(String violationDetails) {
        this.violationDetails = violationDetails;
    }

    public String getCorrectiveAction() {
        return correctiveAction;
    }

    public void setCorrectiveAction(String correctiveAction) {
        this.correctiveAction = correctiveAction;
    }

    public String getComplianceScore() {
        return complianceScore;
    }

    public void setComplianceScore(String complianceScore) {
        this.complianceScore = complianceScore;
    }

    public void performInspection(String result) {
        this.inspectionResult = result;
    }

    public void recordViolation(String violation) {
        this.violationDetails = violation;
    }

    public void takeCorrectiveAction(String action) {
        this.correctiveAction = action;
    }

    public boolean isCompliant() {
        return inspectionResult != null &&
                inspectionResult.equalsIgnoreCase("Passed");
    }

    @Override
    public String toString() {
        return "SafetyCompliance{" +
                "inspectionArea='" + inspectionArea + '\'' +
                ", regulation='" + regulation + '\'' +
                ", inspectionResult='" + inspectionResult + '\'' +
                ", violationDetails='" + violationDetails + '\'' +
                ", correctiveAction='" + correctiveAction + '\'' +
                ", complianceScore='" + complianceScore + '\'' +
                '}';
    }
}