package com.example.flyawayairlines.repository;

import com.example.flyawayairlines.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    // JpaRepository fournit déjà des méthodes de base comme save(), findById(), deleteById(), etc.
}
