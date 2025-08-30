package com.solid.corrected;

/**
 * SOLUCIÓN LSP: Eliminamos métodos que no aplican a todos los tipos de producto
 */
public abstract class Product {
    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();

    // Getters comunes
    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', basePrice=" + basePrice + "}";
    }
}
