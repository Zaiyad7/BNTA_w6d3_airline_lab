package com.bnta.airline.services;

import com.bnta.airline.models.Passenger;
import com.bnta.airline.repositories.FlightRepository;
import com.bnta.airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    FlightRepository flightRepository;

    public Passenger savePassenger(Passenger passenger){
        passengerRepository.save(passenger);
        return passenger;
    }
    public List<Passenger> getAllPassengers(){
        return passengerRepository.findAll();
    }

}
