package violations;

public class UserReportGenerator {
    private DiscountCalculator discountCalculator = new DiscountCalculator();

    public String generateUserReport(User user) {
        double discount = discountCalculator.calculateDiscount(user);
        return 
                "Nombre: " + user.getName() + "\n"
                + "Email: " + user.getEmail() + "\n"
                + "Tipo: " + user.getUserType() + "\n"
                + "Total Compras: $" + user.getTotalPurchases() + "\n"
                + "Descuento Aplicable: " + (discount * 100) + "%\n"
                + "=========================";
    }
}
