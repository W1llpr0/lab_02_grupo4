package tests;

import com.solid.corrected.*;

/**
 * Demostración de la solución corregida que cumple con LSP
 * y aplica principios SOLID
 */
public class CorrectedSolutionDemo {
    
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE SOLUCIÓN CORREGIDA ===\n");

        Product[] products = {
            new PhysicalProduct("Laptop Gaming", 1000.0, 2.5),
            new DigitalProduct("Photoshop License", 50.0),
            new ServiceProduct("Consultoría IT", 200.0, 10)
        };
        
        OrderProcessor processor = new OrderProcessor();
        
        System.out.println("=== PROCESAMIENTO CON ESTRATEGIA ESTÁNDAR ===\n");
        processAllOrders(products, processor);
        
        System.out.println("\n=== PROCESAMIENTO CON DESCUENTO 15% ===\n");
        processor.setPricingStrategy(new DiscountPricingStrategy(15.0));
        processAllOrders(products, processor);
        
        System.out.println("\n=== PROCESAMIENTO CON ESTRATEGIA PREMIUM ===\n");
        processor.setPricingStrategy(new PremiumPricingStrategy());
        processAllOrders(products, processor);
        
        System.out.println("\n=== VERIFICACIÓN LSP ===");
        demonstrateLSP(products);
    }
    
    private static void processAllOrders(Product[] products, OrderProcessor processor) {
        for (Product product : products) {
            OrderResult result = processor.processOrder(product);
            printOrderResult(result);
            System.out.println();
        }
    }
    
    private static void printOrderResult(OrderResult result) {
        System.out.println("Producto: " + result.getProduct().getName());
        System.out.println("Precio final: $" + String.format("%.2f", result.getFinalPrice()));
        
        if (result.getShippingCost() > 0) {
            System.out.println("Costo de envío: $" + String.format("%.2f", result.getShippingCost()));
            System.out.println("Requiere entrega física: " + result.isRequiresPhysicalDelivery());
        }
        
        if (result.getDownloadUrl() != null) {
            System.out.println("URL de descarga: " + result.getDownloadUrl());
            System.out.println("Tamaño: " + result.getFileSize());
        }
        
        if (result.getServiceDuration() > 0) {
            System.out.println("Duración del servicio: " + result.getServiceDuration() + " horas");
        }

        System.out.println("Costo total: $" + String.format("%.2f", result.getTotalCost()));

        for (String note : result.getProcessingNotes()) {
            System.out.println(" " + note);
        }
    }
    
    private static void demonstrateLSP(Product[] products) {
        System.out.println("Probando que todos los productos son sustituibles por Product:");
        
        for (Product product : products) {
            try {
                double price = product.calculatePrice();
                String name = product.getName();
                double basePrice = product.getBasePrice();
                
                System.out.println(" " + product.getClass().getSimpleName() + 
                                 " es sustituible por Product");
                System.out.println("   - Precio calculado: $" + String.format("%.2f", price));
                
            } catch (Exception e) {
                System.out.println(" " + product.getClass().getSimpleName() + 
                                 " NO es sustituible: " + e.getMessage());
            }
        }
    }
}
