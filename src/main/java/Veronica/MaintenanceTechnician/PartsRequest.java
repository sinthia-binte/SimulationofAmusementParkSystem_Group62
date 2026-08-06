package Veronica.MaintenanceTechnician;

import java.io.Serializable;
import java.time.LocalDate;

public class PartsRequest implements Serializable {

    private String requestId, rideId, rideName, partName, specification, requestedBy, status;
    private int quantity;
    private LocalDate requestDate;


    public PartsRequest(String requestId,
                        String rideId,
                        String rideName,
                        String partName,
                        int quantity,
                        String specification,
                        String requestedBy,
                        String status) {

        this.requestId = requestId;
        this.rideId = rideId;
        this.rideName = rideName;
        this.partName = partName;
        this.quantity = quantity;
        this.specification = specification;
        this.requestedBy = requestedBy;
        this.status = status;
        this.requestDate = LocalDate.now();

    }


    public String getRequestId() {
        return requestId;
    }


    public String getRideId() {
        return rideId;
    }


    public String getRideName() {
        return rideName;
    }


    public String getPartName() {
        return partName;
    }


    public int getQuantity() {
        return quantity;
    }


    public String getSpecification() {
        return specification;
    }


    public String getRequestedBy() {
        return requestedBy;
    }


    public String getStatus() {
        return status;
    }


    public LocalDate getRequestDate() {
        return requestDate;
    }


    public String toString() {

        return "Request ID: " + requestId +
                "\nRide: " + rideName +
                "\nPart: " + partName +
                "\nQuantity: " + quantity +
                "\nSpecification: " + specification +
                "\nStatus: " + status +
                "\nDate: " + requestDate;

    }
}