package com.example.flyawayairlines.repository;

import com.example.flyawayairlines.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Vous pouvez ajouter des méthodes pour rechercher les paiements par statut, par utilisateur, etc.
}
