package com.example.flyawayairlines.service;

import com.example.flyawayairlines.model.Reservation;
import com.example.flyawayairlines.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation createReservation(Reservation reservation) {
        // Ajouter une logique pour vérifier la disponibilité des places, etc.
        return reservationRepository.save(reservation);
    }

    public void cancelReservation(Long reservationId) {
        // Ajouter la logique pour annuler une réservation
        reservationRepository.deleteById(reservationId);
    }
}
