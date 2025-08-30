package com.solid.corrected;

public class OrderServiceFactory {
    public static OrderService createOrderService() {
        NotificationService notificationService = new EmailNotificationService();
        Logger logger = new FileLoggerService();
        OrderRepository repository = new DatabaseOrderRepository();
        return new OrderService(notificationService, logger, repository);
    }

    public static OrderService createTestOrderService() {
        NotificationService notificationService = new MockNotificationService();
        Logger logger = new MockLogger();
        OrderRepository repository = new MockRepository();
        return new OrderService(notificationService, logger, repository);
    }
}
