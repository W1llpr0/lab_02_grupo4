/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author o12330
 */
public interface InventoryManager {
   // Operaciones de inventario
    boolean checkProductAvailability(String productId, int quantity);

    void reserveProduct(String productId, int quantity);

    void releaseProductReservation(String productId, int quantity);  
}
