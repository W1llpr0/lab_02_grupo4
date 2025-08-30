/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Maritza
 */


public class ApplePayPayment implements PaymentMethod {

    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando pago con ApplePay por $" + amount);
        return data.startsWith("APPLE");
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public String getPaymentType() {
        return "APPLE_PAY";
    }
}

