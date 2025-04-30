/*package com.example.flyawayairlines.service;

import com.example.flyawayairlines.model.FlightReservation;
import com.example.flyawayairlines.repository.FlightReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightReservationService {

    @Autowired
    private FlightReservationRepository flightReservationRepository;

    public FlightReservation createReservation(FlightReservation flightReservation) {
        return flightReservationRepository.save(flightReservation);
    }

    public List<FlightReservation> getAllReservations() {
        return flightReservationRepository.findAll();
    }

    public FlightReservation getReservationById(Long id) {
        return flightReservationRepository.findById(id).orElse(null);
    }

    public void deleteReservation(Long id) {
        flightReservationRepository.deleteById(id);
    }
}*/
