package Mubin.RideOperator;

import java.time.LocalTime;

public class ViewSchedule {
    private int scheduleId;
    private String operatorId;
    private LocalTime shiftStart;
    private LocalTime shiftEnd;
    private String assignedRide;

    public ViewSchedule(int scheduleId, String operatorId, LocalTime shiftStart, LocalTime shiftEnd, String assignedRide) {
        this.scheduleId = scheduleId;
        this.operatorId = operatorId;
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
        this.assignedRide = assignedRide;
    }

    public int getScheduleId() { return scheduleId; }
    public void setScheduleId(int scheduleId) { this.scheduleId = scheduleId; }

    public String getOperatorId() { return operatorId; }
    public void setOperatorId(String operatorId) { this.operatorId = operatorId; }

    public LocalTime getShiftStart() { return shiftStart; }
    public void setShiftStart(LocalTime shiftStart) { this.shiftStart = shiftStart; }

    public LocalTime getShiftEnd() { return shiftEnd; }
    public void setShiftEnd(LocalTime shiftEnd) { this.shiftEnd = shiftEnd; }

    public String getAssignedRide() { return assignedRide; }
    public void setAssignedRide(String assignedRide) { this.assignedRide = assignedRide; }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", operatorId='" + operatorId + '\'' +
                ", shiftStart=" + shiftStart +
                ", shiftEnd=" + shiftEnd +
                ", assignedRide='" + assignedRide + '\'' +
                '}';
    }
}