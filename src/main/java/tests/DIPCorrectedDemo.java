package tests;

import com.solid.corrected.*;

public class DIPCorrectedDemo {
    public static void main(String[] args) {
    OrderService orderService = DependencyInjector.createOrderService();
    String[] productos1 = {"productoA", "productoB"};
    orderService.processOrder("cliente1", productos1, "email");
    orderService.cancelOrder("orden1");

    System.out.println("--- Test con mocks ---");
    OrderService testOrderService = DependencyInjector.createTestOrderService();
    String[] productos2 = {"productoC"};
    testOrderService.processOrder("cliente2", productos2, "sms");
    testOrderService.cancelOrder("orden2");
    }
}
