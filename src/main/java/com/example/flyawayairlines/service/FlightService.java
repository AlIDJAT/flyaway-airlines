package com.example.flyawayairlines.service;

import com.example.flyawayairlines.model.Flight;
import com.example.flyawayairlines.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    // Méthode pour créer un vol
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    // Méthode pour lister tous les vols
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    // Méthode pour trouver un vol par son ID
    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findById(id);
    }

    // Méthode pour supprimer un vol
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}
