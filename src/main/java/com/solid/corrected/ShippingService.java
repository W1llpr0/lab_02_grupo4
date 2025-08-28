/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author o12330
 */
public interface ShippingService {
     // Operaciones de envío
    void calculateShippingCost(String orderId);

    void scheduleDelivery(String orderId, String deliveryDate);

    void trackShipment(String orderId);
}
