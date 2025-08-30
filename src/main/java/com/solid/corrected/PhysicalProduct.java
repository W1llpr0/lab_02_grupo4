package com.solid.corrected;

/**
 * SOLUCIÓN LSP: Solo implementa Shippable porque realmente se puede enviar
 */
public class PhysicalProduct extends Product implements Shippable {
    private double weight;

    public PhysicalProduct(String name, double basePrice, double weight) {
        super(name, basePrice);
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return basePrice + (weight * 1.15);
    }

    @Override
    public double calculateShippingCost() {
        return weight * 2.5;
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return true;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", weight=" + weight + "}");
    }
}
