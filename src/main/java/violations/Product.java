/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package violations;

/**
 *
 * @author jacks
 */
public abstract class Product {

    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();

    //public abstract double calculateShippingCost();

    //public abstract boolean requiresPhysicalDelivery();

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
