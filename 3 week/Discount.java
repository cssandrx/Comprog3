public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchaseAmount = 150.0;
        double discountRate = 0.0;
        String discountTier = "0%";

        if (purchaseAmount >= 200.0) {
            discountRate = 0.15;
            discountTier = "15%";
        } else if (purchaseAmount >= 100.0) {
            discountRate = 0.10;
            discountTier = "10%";
        } else if (purchaseAmount >= 50.0) {
            discountRate = 0.05;
            discountTier = "5%";
        } else {
            discountRate = 0.0;
            discountTier = "0%";
        }

        double finalPrice = purchaseAmount * (1 - discountRate);

        System.out.println("Discount Tier: " + discountTier);
        System.out.println("Final Price: " + finalPrice);
    }
}
    
