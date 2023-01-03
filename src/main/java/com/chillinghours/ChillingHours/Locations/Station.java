package com.chillinghours.ChillingHours.Locations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    String stationId;
    String state;
    String elevation;
    String elevationUnits;
    String mindate;
    String maxdate;
    String name;
    String datacoverage;
    String latitude;
    String longitude;
    Map<String, Integer> chillingHours= new HashMap<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getElevationUnits() {
        return elevationUnits;
    }

    public void setElevationUnits(String elevationUnits) {
        this.elevationUnits = elevationUnits;
    }

    public String getMindate() {
        return mindate;
    }

    public void setMindate(String mindate) {
        this.mindate = mindate;
    }

    public String getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(String maxdate) {
        this.maxdate = maxdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatacoverage() {
        return datacoverage;
    }

    public void setDatacoverage(String datacoverage) {
        this.datacoverage = datacoverage;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Map<String, Integer> getChillingHours() {
        return chillingHours;
    }

    public void setChillingHours(Map<String, Integer> chillingHours) {
        this.chillingHours = chillingHours;
    }
}
