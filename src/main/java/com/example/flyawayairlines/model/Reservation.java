package com.example.flyawayairlines.model;

        import jakarta.persistence.*;
        import java.util.Date;

        @Entity
        public class Reservation {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;

            @ManyToOne
            @JoinColumn(name = "user_id", nullable = false)
            private User user;

            @ManyToOne
            @JoinColumn(name = "flight_id", nullable = false)
            private Flight flight;

            @Temporal(TemporalType.TIMESTAMP)
            private Date reservationDate;

            private String seatClass; // Par exemple : "Economy", "Business"

            private boolean confirmed;

            public Reservation() {
            }

            // Getters et Setters
            public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public User getUser() {
                return user;
            }

            public void setUser(User user) {
                this.user = user;
            }

            public Flight getFlight() {
                return flight;
            }

            public void setFlight(Flight flight) {
                this.flight = flight;
            }

            public Date getReservationDate() {
                return reservationDate;
            }

            public void setReservationDate(Date reservationDate) {
                this.reservationDate = reservationDate;
            }

            public String getSeatClass() {
                return seatClass;
            }

            public void setSeatClass(String seatClass) {
                this.seatClass = seatClass;
            }

            public boolean isConfirmed() {
                return confirmed;
            }

            public void setConfirmed(boolean confirmed) {
                this.confirmed = confirmed;
            }
        }