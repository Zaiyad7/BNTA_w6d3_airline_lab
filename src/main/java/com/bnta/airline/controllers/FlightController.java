package com.bnta.airline.controllers;

import com.bnta.airline.models.Flight;
import com.bnta.airline.models.FlightDTO;
import com.bnta.airline.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/flights")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights(){
        List<Flight> flights = flightService.findAllFlights();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long id){
        Flight foundFlight = flightService.findFlight(id);
        return new ResponseEntity(foundFlight, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<List<Flight>> postFlight(@RequestBody FlightDTO flightDTO){
        flightService.saveFlight(flightDTO);
        return new ResponseEntity<>(flightService.findAllFlights(), HttpStatus.CREATED);
    }




    // Testing comment
    // New comment
    // Adding more comments
}
