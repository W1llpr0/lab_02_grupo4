package com.solid.corrected;

/**
 * PRINCIPIO ISP: Responsabilidades específicas para servicios
 */
public interface Serviceable {

    void scheduleService();
    
    int getServiceDuration();

    default String getServiceInfo() {
        return "Servicio de " + getServiceDuration() + " horas";
    }
}
