/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Maritza
 */

public class BankTransferPayment implements PaymentMethod {

    @Override
    public boolean process(double amount, String bankData) {
        System.out.println("Procesando transferencia bancaria por $" + amount);
        if (bankData.length() < 10) return false;
        System.out.println("Transferencia bancaria procesada exitosamente");
        return true;
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return 5.0;
    }

    @Override
    public String getPaymentType() {
        return "BANK_TRANSFER";
    }
}
