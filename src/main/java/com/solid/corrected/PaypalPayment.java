/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Maritza
 */

public class PaypalPayment implements PaymentMethod {

    @Override
    public boolean process(double amount, String paypalData) {
        System.out.println("Procesando pago con PayPal por $" + amount);
        if (!paypalData.contains("@")) return false;
        System.out.println("Pago con PayPal procesado exitosamente");
        return true;
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.025;
    }

    @Override
    public String getPaymentType() {
        return "PAYPAL";
    }
}
