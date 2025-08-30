/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

import java.util.Map;
import java.util.HashMap;


/**
 *
 * @author Maritza
 */

public class PaymentProcessor {
    private final Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    public void registerPaymentMethod(PaymentMethod method) {
        paymentMethods.put(method.getPaymentType().toUpperCase(), method);
    }

    public boolean processPayment(String type, double amount, String data) {
        PaymentMethod method = paymentMethods.get(type.toUpperCase());
        if (method == null) {
            throw new IllegalArgumentException("Método de pago no soportado: " + type);
        }
        return method.process(amount, data);
    }

    public double calculateProcessingFee(String type, double amount) {
        PaymentMethod method = paymentMethods.get(type.toUpperCase());
        if (method == null) {
            throw new IllegalArgumentException("Método de pago no soportado: " + type);
        }
        return method.calculateProcessingFee(amount);
    }
}