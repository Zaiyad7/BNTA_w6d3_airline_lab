package com.bnta.airline.components;

import com.bnta.airline.models.Flight;
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
        Passenger passenger1 = new Passenger("Zaiyad", "1234");
        passengerRepository.save(passenger1);

        Passenger passenger2 = new Passenger("Naruto", "5239");
        passengerRepository.save(passenger2);

        Flight flight1 = new Flight("Mumbai",10,"5th of May","15:00");
        flightRepository.save(flight1);

        Flight flight2 = new Flight("Bangladesh",10,"2nd of April","12:00");
        flightRepository.save(flight2);

    }
}
