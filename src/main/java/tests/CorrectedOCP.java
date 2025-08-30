/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tests;

import com.solid.corrected.*;

/**
 *
 * @author Maritza
 */
public class CorrectedOCP {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.registerPaymentMethod(new CreditCardPayment());
        processor.registerPaymentMethod(new PaypalPayment());
        processor.registerPaymentMethod(new BankTransferPayment());
        processor.registerPaymentMethod(new ApplePayPayment());

        processor.processPayment("CREDIT_CARD", 100.0, "1234567890123456");
        System.out.println("Fee: $" + processor.calculateProcessingFee("CREDIT_CARD", 100.0));

        processor.processPayment("APPLE_PAY", 50.0, "APPLE-VALID");
    }
}

