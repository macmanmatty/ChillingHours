package com.chillinghours.ChillingHours.Locations;

import org.springframework.stereotype.Service;


@Service
public class LocationService {
    private String locationEndpoint;


    public void getLocations(LocationRequestForm locationRequestForm){
        String locationUrl="stations?datacategoryid=TEMP&limit=1000&offset=";
    }

}
