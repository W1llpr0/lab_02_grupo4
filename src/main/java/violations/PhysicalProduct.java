/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package violations;

/**
 *
 * @author jacks
 */
public class PhysicalProduct extends Product implements Shippable {

    private double weight;

    public PhysicalProduct(String name, double basePrice, double weight) {
        super(name, basePrice);
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return basePrice + weight * 1.15; // Incluye impuestos
    }

    @Override
    public double calculateShippingCost() {
        return weight * 2.5; // $2.5 por kg
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return true;
    }
}
