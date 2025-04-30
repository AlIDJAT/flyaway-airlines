/*package com.example.flyawayairlines.controller;

import com.example.flyawayairlines.model.FlightReservation;
import com.example.flyawayairlines.service.FlightReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flight-reservations")
public class FlightReservationController {

    @Autowired
    private FlightReservationService flightReservationService;

    @PostMapping
    public ResponseEntity<FlightReservation> createReservation(@RequestBody FlightReservation flightReservation) {
        FlightReservation createdReservation = flightReservationService.createReservation(flightReservation);
        return new ResponseEntity<>(createdReservation, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<FlightReservation>> getAllReservations() {
        List<FlightReservation> reservations = flightReservationService.getAllReservations();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlightReservation> getReservationById(@PathVariable Long id) {
        FlightReservation reservation = flightReservationService.getReservationById(id);
        return reservation != null ? new ResponseEntity<>(reservation, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable Long id) {
        flightReservationService.deleteReservation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}*/
