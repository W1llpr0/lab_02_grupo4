/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author o12330
 */
public interface NotificationSender {
    // Operaciones de notificación
    void sendOrderConfirmation(String orderId);

    void sendShippingNotification(String orderId);

    void sendDeliveryNotification(String orderId);
}
