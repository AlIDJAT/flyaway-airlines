package com.example.flyawayairlines.controller;

import com.example.flyawayairlines.model.Payment;
import com.example.flyawayairlines.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Endpoint pour effectuer un paiement
    @PostMapping
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment) {
        Payment createdPayment = paymentService.createPayment(payment);
        return new ResponseEntity<>(createdPayment, HttpStatus.CREATED);
    }

    // Endpoint pour vérifier si le paiement a été effectué avec succès
    @GetMapping("/{id}")
    public ResponseEntity<String> checkPaymentStatus(@PathVariable Long id) {
        Payment payment = paymentService.createPayment(new Payment());  // Vous pourriez récupérer le paiement à partir de la base de données ici
        if(paymentService.isPaymentSuccessful(payment)) {
            return new ResponseEntity<>("Payment Successful", HttpStatus.OK);
        }
        return new ResponseEntity<>("Payment Failed", HttpStatus.BAD_REQUEST);
    }
}
