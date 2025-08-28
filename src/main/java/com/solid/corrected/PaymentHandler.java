/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author o12330
 */
public interface PaymentHandler {
    // Operaciones de pago
    boolean processPayment(String orderId, String paymentMethod, String paymentData);

    void processRefund(String orderId, double amount);
}
