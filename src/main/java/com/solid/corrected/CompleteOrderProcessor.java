/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solid.corrected;

/**
 *
 * @author o12330
 */
public class CompleteOrderProcessor {
  private final OrderManager orderManager;     
  private final PaymentHandler paymentHandler;    
  private final ShippingService shippingService;   
  private final InventoryManager inventoryManager;  
  private final NotificationSender notificationSender; 
  private final ReportGenerator reportGenerator;   

  

  public CompleteOrderProcessor(OrderManager orderManager,
                 PaymentHandler paymentHandler,
                 ShippingService shippingService,
                 InventoryManager inventoryManager,
                 NotificationSender notificationSender,
                 ReportGenerator reportGenerator) {

    this.orderManager = orderManager;
    this.paymentHandler = paymentHandler;
    this.shippingService = shippingService;
    this.inventoryManager = inventoryManager;
    this.notificationSender = notificationSender;
    this.reportGenerator = reportGenerator;
  }
}
