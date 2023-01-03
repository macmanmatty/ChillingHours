package com.chillinghours.ChillingHours.ChillingHours;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChillingHourRequestDTO {
    private Date startDate;
    private Date endDate;
    private String location;
    private List<String> methods= new ArrayList<>();
    private String noaaStationId;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public String getNoaaStationId() {
        return noaaStationId;
    }

    public void setNoaaStationId(String noaaStationId) {
        this.noaaStationId = noaaStationId;
    }
}
