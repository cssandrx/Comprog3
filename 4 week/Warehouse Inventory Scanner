import java.util.Scanner;
public class Warehouse {

    /**
     * @param args the command line arguments
     */
       private static int[][] warehouse = {
        {15, 4, -1, 20},
        {8, -1, 12, 5},
        {3, 25, 10, -1}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Display Warehouse Map");
            System.out.println("2. Total Inventory (Skip Damaged Shelves using 'continue')");
            System.out.println("3. Find First Critically Low Shelf (Using 'break', count < 5)");
            System.out.println("4. Restock a Shelf (Using 'while' loop + 'return' + validation)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayWarehouse();
                    break;
                case 2:
                    calculateTotalInventory();
                    break;
                case 3:
                    findFirstCriticalShelf();
                    break;
                case 4:
                    restockShelfPrompt(scanner);
                    break;
                case 5:
                    System.out.println("Exiting Warehouse Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void displayWarehouse() {
        System.out.println("\n--- Warehouse Status (-1 = Damaged Shelf) ---");
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                System.out.print(warehouse[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void calculateTotalInventory() {
        int total = 0;
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] == -1) {
                    continue; 
                }
                total += warehouse[i][j];
            }
        }
        System.out.println("\nTotal valid inventory items in the warehouse (excluding damaged shelves): " + total);
    }

    private static void findFirstCriticalShelf() {
        boolean found = false;
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] != -1 && warehouse[i][j] < 5) {
                    System.out.println("\nCritical shelf found at Row " + i + ", Column " + j + " with only " + warehouse[i][j] + " items!");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("\nNo critically low shelves found.");
        }
    }

    private static void restockShelfPrompt(Scanner scanner) {
        System.out.print("\nEnter row index (0 to " + (warehouse.length - 1) + "): ");
        int row = scanner.nextInt();
        System.out.print("Enter column index (0 to " + (warehouse[0].length - 1) + "): ");
        int col = scanner.nextInt();

        if (row < 0 || row >= warehouse.length || col < 0 || col >= warehouse[row].length) {
            System.out.println("Error: Invalid shelf coordinates!");
            return;
        }

        if (warehouse[row][col] == -1) {
            System.out.println("Error: Cannot restock a damaged shelf (-1)!");
            return;
        }

        System.out.println("Current items on shelf [" + row + "][" + col + "]: " + warehouse[row][col]);
        System.out.print("Enter number of items to add (must be positive): ");
        
        int addAmount = scanner.nextInt();

        while (addAmount <= 0) {
            System.out.print("Invalid amount. Please enter a positive number of items to add: ");
            addAmount = scanner.nextInt();
        }

        warehouse[row][col] += addAmount;
        System.out.println("Restock successful! New count on shelf [" + row + "][" + col + "]: " + warehouse[row][col]);
    }
}
