/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author o12330
 */
public interface OrderManager {
    // Operaciones básicas de pedido

    void createOrder(String customerId, String[] productIds);

    void cancelOrder(String orderId);

    void updateOrderStatus(String orderId, String status);
}
