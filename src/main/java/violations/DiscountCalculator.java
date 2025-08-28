package violations;

public class DiscountCalculator {
    public double calculateDiscount(User user) {
        String userType = user.getUserType();
        double totalPurchases = user.getTotalPurchases();
        switch (userType) {
            case "PREMIUM":
                return totalPurchases > 1000 ? 0.20 : 0.15;
            case "VIP":
                return totalPurchases > 2000 ? 0.30 : 0.25;
            default:
                return totalPurchases > 500 ? 0.10 : 0.05;
        }
    }
}
