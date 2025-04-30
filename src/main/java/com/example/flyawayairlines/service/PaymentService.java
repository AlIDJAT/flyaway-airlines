package com.example.flyawayairlines.service;

import com.example.flyawayairlines.model.Payment;
import com.example.flyawayairlines.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Créer un paiement
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Vérifier le statut du paiement (par exemple, pour confirmer si la réservation est payée)
    public boolean isPaymentSuccessful(Payment payment) {
        return "Complété".equalsIgnoreCase(payment.getPaymentStatus());
    }
}
