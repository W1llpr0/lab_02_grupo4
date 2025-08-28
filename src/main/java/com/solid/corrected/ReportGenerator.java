/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author o12330
 */
public interface ReportGenerator {
    // Operaciones de reportes
    String generateOrderReport(String orderId);

    String generateDailyReport(String date);

    String generateCustomerReport(String customerId);
}
