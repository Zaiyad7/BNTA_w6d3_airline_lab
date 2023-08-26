package com.bnta.airline.services;

import com.bnta.airline.models.Flight;
import com.bnta.airline.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public Flight saveFlight(Flight flight){
        flightRepository.save(flight);
        return flight;
    }
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight findFlight(Long id){
        return flightRepository.findById(id).get();
    }
}
