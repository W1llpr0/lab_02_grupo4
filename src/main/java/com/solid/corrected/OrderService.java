package com.solid.corrected;

public class OrderService {
    private final NotificationService notificationService;
    private final Logger logger;
    private final OrderRepository repository;

    public OrderService(NotificationService notificationService, Logger logger, OrderRepository repository) {
        this.notificationService = notificationService;
        this.logger = logger;
        this.repository = repository;
    }

    public void processOrder(String customerId, String[] productIds, String notificationType) {
        repository.saveOrder("Pedido para " + customerId);
        notificationService.sendNotification(notificationType, customerId, "Pedido procesado");
        logger.log("Pedido procesado para " + customerId);
    }

    public void cancelOrder(String orderId) {
        logger.log("Pedido cancelado: " + orderId);
    }
}
