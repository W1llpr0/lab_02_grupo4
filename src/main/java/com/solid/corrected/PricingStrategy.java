package com.solid.corrected;

/**
 * PATRÓN STRATEGY: Permite cambiar algoritmos de pricing dinámicamente
 */
public interface PricingStrategy {
    double calculatePrice(double basePrice, Product product);
}


class StandardPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice, Product product) {
        return basePrice;
    }
}

class DiscountPricingStrategy implements PricingStrategy {
    private double discountPercentage;
    
    public DiscountPricingStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    
    @Override
    public double calculatePrice(double basePrice, Product product) {
        return basePrice * (1 - discountPercentage / 100);
    }
}

class PremiumPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice, Product product) {
        if (product instanceof PhysicalProduct) {
            PhysicalProduct physical = (PhysicalProduct) product;
            return basePrice + (physical.getWeight() * 1.15) + (basePrice * 0.15); // +15% premium
        }
        return basePrice * 1.15;
    }
}
