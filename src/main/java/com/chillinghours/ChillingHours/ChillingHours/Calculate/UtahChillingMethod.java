package com.chillinghours.ChillingHours.ChillingHours.Calculate;

import com.chillinghours.ChillingHours.NoaaData.NoaaStationData;

import java.util.Date;

public class UtahChillingMethod implements  ChillingMethod {
    private Date startDate;
    private Date endDate;
    private String name= "Utah Method";


    public UtahChillingMethod() {
    }


    @Override
    public double calculateChillingHours(NoaaStationData noaaStationData) {
        return 0;
    }

    @Override
    public String getMethodName() {
        return name;
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
