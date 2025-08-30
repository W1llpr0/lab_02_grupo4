package com.solid.corrected;

/**
 * SOLUCIÓN LSP: Solo implementa Serviceable, no fuerza métodos de envío
 */
public class ServiceProduct extends Product implements Serviceable {
    private int duration;

    public ServiceProduct(String name, double basePrice) {
        super(name, basePrice);
        this.duration = 8;
    }

    public ServiceProduct(String name, double basePrice, int duration) {
        super(name, basePrice);
        this.duration = duration;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.1;
    }

    @Override
    public void scheduleService() {
        System.out.println("Programando servicio: " + name);
        System.out.println("Duración estimada: " + duration + " horas");
        System.out.println("Servicio programado exitosamente");
    }

    @Override
    public int getServiceDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", duration=" + duration + " hours}");
    }
}
