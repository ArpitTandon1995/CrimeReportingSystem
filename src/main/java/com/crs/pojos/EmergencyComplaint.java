package com.crs.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EmergencyComplaint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotNull
    @NotBlank(message = "Please enter Emergency Complaint")
    @Size(min = 2, message = "Emergency must have a minimum of 2 characters")
    private String complaint;

    @NotNull
    @NotBlank(message = "Please enter Emergency Complaint Status")
    @Size(min = 2, message = "Emergency must have a minimum of 2 characters")
    private String status = "Investigation Pending";

    public String getComplaint() {
        return complaint;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public EmergencyComplaint(long id, String complaint, String status) {
        this.id = id;
        this.complaint = complaint;
        this.status = status;
    }

    public EmergencyComplaint(String complaint, String status) {
        this.complaint = complaint;
        this.status = status;
    }

    public EmergencyComplaint() {
    }

}