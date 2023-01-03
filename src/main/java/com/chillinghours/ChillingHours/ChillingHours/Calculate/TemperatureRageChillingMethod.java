package com.chillinghours.ChillingHours.ChillingHours.Calculate;

import com.chillinghours.ChillingHours.NoaaData.NoaaStationData;

import java.util.Date;

public class TemperatureRageChillingMethod implements  ChillingMethod {
    private double maxTemp;
    private double minTemp;
    private Date startDate;
    private Date endDate;

    public TemperatureRageChillingMethod() {
    }

    public TemperatureRageChillingMethod(double maxTemp, double minTemp) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    @Override
    public double calculateChillingHours(NoaaStationData noaaStationData) {
        return 0;
    }

    @Override
    public String getMethodName() {
        return "Total Hours Above "+minTemp+" and below "+maxTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

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
}
