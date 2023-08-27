package com.bnta.airline.controllers;

import com.bnta.airline.models.Passenger;
import com.bnta.airline.models.PassengerDTO;
import com.bnta.airline.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/passengers")
public class PassengerController {
    @Autowired
    PassengerService passengerService;

    @GetMapping
    public ResponseEntity<List<Passenger>> getAllPassengers(){
        List<Passenger> passengers;
        passengers = passengerService.findAllPassengers();
        return new ResponseEntity<>(passengers, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable Long id){
        Passenger foundPassenger = passengerService.findPassenger(id);
        return new ResponseEntity(foundPassenger, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<List<Passenger>> postPassenger(@RequestBody PassengerDTO passengerDTO){
        passengerService.savePassenger(passengerDTO);
        return new ResponseEntity<>(passengerService.findAllPassengers(), HttpStatus.CREATED);

    }


}
