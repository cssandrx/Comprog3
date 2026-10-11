public class ShopCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String storeName = "SuperMart";
        int quantity = 3;
        double unitPrice = 19.99;
        
        double totalCost = quantity * unitPrice;
        
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);
    }
    
}
