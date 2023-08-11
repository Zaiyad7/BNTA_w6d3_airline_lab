package com.bnta.airline.components;

import com.bnta.airline.models.Passenger;
import com.bnta.airline.repositories.FlightRepository;
import com.bnta.airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    FlightRepository flightRepository;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args){
        Passenger passenger = new Passenger("Zaiyad",)

    }
}
