package com.solid.corrected;

public class MockRepository implements OrderRepository {
    @Override
    public void saveOrder(String orderData) {
        System.out.println("MockRepository: Guardado " + orderData);
    }

    @Override
    public String getCustomerData(String customerId) {
        return "MockRepository: Datos de " + customerId;
    }
}
