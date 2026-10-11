public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username = "gabriz03";
        int pin = 1234;
        double balance = 6000.0;
        double amount = 400.0;

        if (username.equals("gabriz03")) {
            if (pin == 1234) {
                String tier = "";
                if (balance >= 20000.0) {
                    tier = "Platinum";
                } else if (balance >= 10000.0) {
                    tier = "Gold";
                } else if (balance >= 5000.0) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }

                double limit = 0.0;
                switch (tier) {
                    case "Platinum": limit = 5000.0; break;
                    case "Gold": limit = 2000.0; break;
                    case "Silver": limit = 1000.0; break;
                    default: limit = 300.0; break;
                }

                double feeRate = 0.0;
                switch (tier) {
                    case "Platinum": feeRate = 0.01; break;
                    case "Gold": feeRate = 0.02; break;
                    case "Silver": feeRate = 0.03; break;
                    default: feeRate = 0.05; break;
                }

                double totalNeeded = amount + (amount * feeRate);

                if (amount <= limit) {
                    if (balance >= totalNeeded) {
                        System.out.println("APPROVE: Tier is " + tier);
                    } else {
                        System.out.println("DENIED: Insufficient balance including fee");
                    }
                } else {
                    System.out.println("DENIED: Amount exceeds daily limit");
                }
            } else {
                System.out.println("DENIED: Invalid PIN");
            }
        } else {
            System.out.println("DENIED: Invalid username");
        }
    }
}
