package Veronica.MaintenanceTechnician;

import java.time.LocalDate;

public class PartsRequest {

    private String requestId, rideId, partName, specification, inventoryStatus, requestedBy, status;
    private int quantity;
    private LocalDate requestDate;


    public PartsRequest(String requestId, String rideId, String partName, String specification, String inventoryStatus, String requestedBy, String status, int quantity, LocalDate requestDate) {
        this.requestId = requestId;
        this.rideId = rideId;
        this.partName = partName;
        this.specification = specification;
        this.inventoryStatus = inventoryStatus;
        this.requestedBy = requestedBy;
        this.status = status;
        this.quantity = quantity;
        this.requestDate = requestDate;
    }


    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }
}
