/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Maritza
 */
public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean process(double amount, String cardData) {
        System.out.println("Procesando pago con tarjeta de crédito por $" + amount);
        if (cardData.length() < 16) return false;
        System.out.println("Pago con tarjeta procesado exitosamente");
        return true;
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.03;
    }

    @Override
    public String getPaymentType() {
        return "CREDIT_CARD";
    }
}

