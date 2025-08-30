/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author Maritza
 */
public interface PaymentMethod {
    public boolean process (double amount, String data );
    public double calculateProcessingFee(double amount);
    public String getPaymentType();
}
