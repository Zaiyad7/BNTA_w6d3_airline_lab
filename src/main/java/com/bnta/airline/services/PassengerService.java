package com.bnta.airline.services;

import com.bnta.airline.models.Flight;
import com.bnta.airline.models.Passenger;
import com.bnta.airline.models.PassengerDTO;
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

    public Passenger savePassenger(PassengerDTO passengerDTO){
        Passenger passenger = new Passenger(passengerDTO.getName(),passengerDTO.getPhoneNumber());
        return passengerRepository.save(passenger);
    }
    public List<Passenger> findAllPassengers(){
        return passengerRepository.findAll();
    }

    public Passenger findPassenger(Long id) {
        return passengerRepository.findById(id).get();
    }
}
