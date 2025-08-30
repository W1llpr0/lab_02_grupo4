package com.solid.corrected;

import java.util.ArrayList;
import java.util.List;

/**
 * Procesador de órdenes que usa composición en lugar de herencia forzada
 */
public class OrderProcessor {
    private PricingStrategy pricingStrategy;
    
    public OrderProcessor() {
        this.pricingStrategy = new StandardPricingStrategy();
    }
    
    public OrderProcessor(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
    
    /**
     * Procesa una orden para un producto específico
     */
    public OrderResult processOrder(Product product) {
        OrderResult result = new OrderResult();
        result.setProduct(product);
        
        // Precio usando strategy
        double price = pricingStrategy.calculatePrice(product.getBasePrice(), product);
        result.setFinalPrice(price);
        
        // Procesar comportamientos específicos usando polimorfismo
        if (product instanceof Shippable) {
            processShippableProduct((Shippable) product, result);
        }
        
        if (product instanceof Downloadable) {
            processDownloadableProduct((Downloadable) product, result);
        }
        
        if (product instanceof Serviceable) {
            processServiceableProduct((Serviceable) product, result);
        }
        
        return result;
    }
    
    private void processShippableProduct(Shippable shippable, OrderResult result) {
        double shippingCost = shippable.calculateShippingCost();
        result.setShippingCost(shippingCost);
        result.setRequiresPhysicalDelivery(shippable.requiresPhysicalDelivery());
        result.addProcessingNote("Producto preparado para envío físico");
    }
    
    private void processDownloadableProduct(Downloadable downloadable, OrderResult result) {
        result.setDownloadUrl(downloadable.getDownloadUrl());
        result.setFileSize(downloadable.getFormattedFileSize());
        result.addProcessingNote("Enlace de descarga generado");
    }
    
    private void processServiceableProduct(Serviceable serviceable, OrderResult result) {
        serviceable.scheduleService();
        result.setServiceDuration(serviceable.getServiceDuration());
        result.addProcessingNote("Servicio programado");
    }
    
    public void setPricingStrategy(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
    }
}

/**
 * Resultado del procesamiento de una orden
 */
class OrderResult {
    private Product product;
    private double finalPrice;
    private double shippingCost = 0.0;
    private boolean requiresPhysicalDelivery = false;
    private String downloadUrl;
    private String fileSize;
    private int serviceDuration = 0;
    private List<String> processingNotes = new ArrayList<>();
    
    // Getters y setters
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    
    public double getFinalPrice() { return finalPrice; }
    public void setFinalPrice(double finalPrice) { this.finalPrice = finalPrice; }
    
    public double getShippingCost() { return shippingCost; }
    public void setShippingCost(double shippingCost) { this.shippingCost = shippingCost; }
    
    public boolean isRequiresPhysicalDelivery() { return requiresPhysicalDelivery; }
    public void setRequiresPhysicalDelivery(boolean requiresPhysicalDelivery) { 
        this.requiresPhysicalDelivery = requiresPhysicalDelivery; 
    }
    
    public String getDownloadUrl() { return downloadUrl; }
    public void setDownloadUrl(String downloadUrl) { this.downloadUrl = downloadUrl; }
    
    public String getFileSize() { return fileSize; }
    public void setFileSize(String fileSize) { this.fileSize = fileSize; }
    
    public int getServiceDuration() { return serviceDuration; }
    public void setServiceDuration(int serviceDuration) { this.serviceDuration = serviceDuration; }
    
    public List<String> getProcessingNotes() { return processingNotes; }
    public void addProcessingNote(String note) { this.processingNotes.add(note); }
    
    public double getTotalCost() {
        return finalPrice + shippingCost;
    }
}
