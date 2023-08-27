package com.bnta.airline.services;

import com.bnta.airline.models.Flight;
import com.bnta.airline.models.FlightDTO;
import com.bnta.airline.models.Passenger;
import com.bnta.airline.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public Flight saveFlight(FlightDTO flightDTO){
        Flight flight = new Flight(flightDTO.getDestination(),flightDTO.getCapacity(),flightDTO.getDepartureDate(),
                flightDTO.getDepartureTime());
        return flightRepository.save(flight);
    }
    public List<Flight> findAllFlights() {
        return flightRepository.findAll();
    }

    public Flight findFlight(Long id){
        return flightRepository.findById(id).get();
    }
}
