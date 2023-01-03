package com.chillinghours.ChillingHours.ChillingHours;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ChillingHoursService {

    @Value("${noaa.api.key}")
    private   String apiKey;
    @Value("${noaa.base.url}")
    private   String baseUrl;

    public ChillingHoursForm getChillingHours(ChillingHoursForm chillingHoursForm){


        return chillingHoursForm;
    }

}
