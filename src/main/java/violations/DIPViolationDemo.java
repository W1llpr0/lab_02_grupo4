package violations;

// Ejemplo de violación al DIP: depende de implementaciones concretas
public class DIPViolationDemo {
    private final EmailNotifier notifier = new EmailNotifier(); // dependencia concreta
    private final FileLogger logger = new FileLogger(); // dependencia concreta
    private final DatabaseRepository repository = new DatabaseRepository(); // dependencia concreta

    public void procesarPedido(String cliente, String[] productos) {
        repository.getCustomerData(cliente);
        repository.saveOrder("Pedido para " + cliente);
        notifier.sendEmail(cliente, "Pedido procesado");
        logger.log("Pedido procesado para " + cliente);
    }

    public void cancelarPedido(String pedidoId) {
        logger.log("Pedido cancelado: " + pedidoId);
    }
}

// Implementaciones concretas (no abstracciones)
class EmailNotifier {
    public void sendEmail(String destinatario, String mensaje) {
        System.out.println("Email enviado a " + destinatario + ": " + mensaje);
    }
}

class FileLogger {
    public void log(String mensaje) {
        System.out.println("FileLogger: " + mensaje);
    }
}

class DatabaseRepository {
    public void saveOrder(String datosPedido) {
        System.out.println("Pedido guardado en DB: " + datosPedido);
    }
    public String getCustomerData(String clienteId) {
        return "Datos de cliente " + clienteId;
    }
}
