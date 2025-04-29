package com.example.flyawayairlines.repository;

import com.example.flyawayairlines.model.Reservation;
import com.example.flyawayairlines.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByUser(User user);
}
