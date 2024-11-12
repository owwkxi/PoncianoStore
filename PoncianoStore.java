import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class PoncianoStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] models = {
            "iPhone 12",
            "iPhone 13",
            "iPhone 14",
            "iPhone 15"
        };
        
        String[][] colors = {
            {"Black", "White", "Red"},
            {"Pink", "Blue", "Midnight"},
            {"Purple", "Starlight", "Midnight"},
            {"Blue", "Pink", "Yellow"}
        };
        
        String[][] storageOptions = {
            {"64GB", "128GB", "256GB"},
            {"128GB", "256GB", "512GB"},
            {"128GB", "256GB", "512GB"},
            {"128GB", "256GB", "512GB", "1TB"}
        };
        
        double[] basePrices = {
            699.99, 
            799.99, 
            899.99, 
            999.99  
        };
        
        
        double[][] storagePrices = {
            {0, 25.00, 75.00}, 
            {0, 25.00, 75.00}, 
            {0, 25.00, 75.00}, 
            {0, 25.00, 75.00, 125.00} 
        };
        
        System.out.println("Welcome to the Ponciano Store!");
        System.out.println("Please choose a model to view its specifications:");
        
        
        for (int i = 0; i < models.length; i++) {
            System.out.printf("%d. %s - %.2f%n", (i + 1), models[i], basePrices[i]);
        }
        
        int modelChoice = sc.nextInt() - 1;
        
        System.out.println("Available Colors:");
        for (int i = 0; i < colors[modelChoice].length; i++) {
            System.out.println((i + 1) + ". " + colors[modelChoice][i]);
        }
        int colorChoice = sc.nextInt() - 1;
        String chosenColor = colors[modelChoice][colorChoice];
        
        System.out.println("\nStorage Options:");
        for (int i = 0; i < storageOptions[modelChoice].length; i++) {
            System.out.println((i + 1) + ". " + storageOptions[modelChoice][i]);
        }
        int storageChoice = sc.nextInt() - 1;
        String chosenStorage = storageOptions[modelChoice][storageChoice];
        
        double totalCost = basePrices[modelChoice] + storagePrices[modelChoice][storageChoice];
        System.out.printf("\nTotal cost for %s (%s, %s): %.2f%n", models[modelChoice], chosenColor, chosenStorage, totalCost);
        
        System.out.println("\nEnter your details to complete the purchase:");
        sc.nextLine(); 
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Address: ");
        String address = sc.nextLine();
        
        System.out.print("Enter payment amount: ");
        double payment = sc.nextDouble();

        double change = 0.0;
        boolean successfulPurchase = false;

        
        if (payment >= totalCost) {
            change = payment - totalCost;
            successfulPurchase = true;
            System.out.println("\nPurchase Receipt");
            System.out.println("Customer Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
            System.out.println("Product: " + models[modelChoice]);
            System.out.println("Color: " + chosenColor);
            System.out.println("Storage: " + chosenStorage);
            System.out.printf("Total Cost: %.2f%n", totalCost);
            System.out.printf("Payment Received: %.2f%n", payment);
            System.out.printf("Change: %.2f%n", change);
            System.out.println("Thank you for your purchase!");
        } else {
            System.out.printf("Insufficient payment. You need to pay at least %.2f%n", totalCost);
        }

        try{
            FileWriter writer = new FileWriter(name +".txt");
            writer.write("Name: " +  name + "\n" +"Age: " + age + "\n" +"Address: " + address + "\n" +"Model: " + models[modelChoice] + "\n" + "Color: " + chosenColor + "\n" +"Storage: " + chosenStorage + "\n" + "Payment: " + payment + "\n" + "Total: " +  totalCost + "\n");
            
            if (successfulPurchase) {
            writer.write("Change: " + change );
            } else {writer.write("Status: Insufficient payment."); }
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}