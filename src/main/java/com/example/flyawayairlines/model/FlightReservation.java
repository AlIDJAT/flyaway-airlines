/*package com.example.flyawayairlines.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class FlightReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;  // Le vol réservé

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // L'utilisateur qui a réservé

    private int numberOfSeats;  // Nombre de places réservées

    @Temporal(TemporalType.TIMESTAMP)
    private Date reservationDate;  // Date de réservation

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}*/