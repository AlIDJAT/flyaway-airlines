package com.example.flyawayairlines.model;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;
    private LocalDateTime reservationDate;

    @ManyToOne
    private User user; // Relation avec l'utilisateur

    // Getters et Setters
}
