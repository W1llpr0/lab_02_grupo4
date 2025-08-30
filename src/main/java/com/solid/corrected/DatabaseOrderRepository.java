package com.solid.corrected;

public class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(String orderData) {
        System.out.println("Order guardado en DB: " + orderData);
    }

    @Override
    public String getCustomerData(String customerId) {
        return "Datos de cliente " + customerId;
    }
}
