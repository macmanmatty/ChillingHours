package com.chillinghours.ChillingHours.ChillingHours.Calculate;

import com.chillinghours.ChillingHours.NoaaData.NoaaStationData;

import java.util.Date;

public interface ChillingMethod {

    public  double calculateChillingHours(NoaaStationData noaaStationData);
    public String getMethodName();
    public Date getStartDate();
    public void setStartDate(Date startDate);
    public Date getEndDate();
    public void setEndDate(Date endDate);

}
