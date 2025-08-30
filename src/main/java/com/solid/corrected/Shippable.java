package com.solid.corrected;

/**
 * PRINCIPIO ISP: Separamos responsabilidades específicas
 */
public interface Shippable {

    double calculateShippingCost();
    
    boolean requiresPhysicalDelivery();
}
