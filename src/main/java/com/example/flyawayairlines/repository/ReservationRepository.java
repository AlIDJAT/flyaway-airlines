package com.example.flyawayairlines.repository;

import com.example.flyawayairlines.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
