package com.chillinghours.ChillingHours.ChillingHours;

import com.chillinghours.ChillingHours.Properties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
@RestController
public class NOAAChillingHoursController {
   private final Properties properties= new Properties();

    public NOAAChillingHoursController( ) {

    }

    @PostMapping(value="/chillingHours", produces = MediaType.APPLICATION_JSON_VALUE, consumes =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ChillingHoursForm> getChillingHours(@RequestBody ChillingHoursForm chillingHoursForm
    ){
        return new ResponseEntity<>(chillingHoursForm, HttpStatus.OK) ;
    }





}
