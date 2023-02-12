import java.util.Scanner;

public class q3 {
    public static void productList(String products[]) {
        System.out.println("List Of Products:\n");
        for (String x : products) {
            System.out.print(x + "\n");
        }
    }

    public static void productquantities(String products[], int pQuantities[]) {
        System.out.println("Quantities of each Product:\n");
        for (int i = 0; i < 4; i++) {
            System.out.print(products[i] + " : " + pQuantities[i] + "\n");
        }

    }

    public static void productDetails(String specifications[], int price[], int count[]) {
        System.out.println("Product Specifications : PRICE -> COUNT\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(specifications[i] + " : " + price[i] + " -> " + count[i] + "\n");
        }
    }

    public static void editProduct(String specifications[], int price[], int count[]) {
        System.out.println("Select ProductSpecifications to be edited:");
        System.out.println("1.Washing Machines");
        System.out.println("2.Air Conditioners");
        System.out.println("3.Televisions");
        System.out.println("4.Refigerators");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter edit of Specifications");
        String editspecs = sc.nextLine();
        System.out.println("Enter Price to be Edited");
        int cost = sc.nextInt();
        if (p == 1) {
            
                specifications[0] = editspecs;
                price[0] = cost;
          
        }
        if (p == 2) {
           
                specifications[1] = editspecs;
                price[1] = cost;
   
        }
        if (p == 3) {
            
                specifications[2] = editspecs;
                price[2] = cost;
           
        }
        if (p == 4) {
          
                specifications[3] = editspecs;
                price[3] = cost;
     
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(specifications[i] + " " + price[i] + " "+ count[i] + "\n");
        }

    }

    public static void updateInventory(String products[], int pQuantities[], String specifications[], int price[],
            int count[]) {
        System.out.println("Enter product that quantity to be edited");
        Scanner sc = new Scanner(System.in);
        int Q;
        System.out.println("1.Washing Machines");
        System.out.println("2.Air Conditioners");
        System.out.println("3.Televisions");
        System.out.println("4.Refrigerators");
        Q = sc.nextInt();
        if (Q == 1) {
            System.out.println("Enter new quantity to be update");
            pQuantities[0] = sc.nextInt();
        }
        if (Q == 2) {
            System.out.println("Enter new quantity to be updated");
            pQuantities[1] = sc.nextInt();
        }
        if (Q == 2) {
            System.out.println("Enter new quantity to be updated");
            pQuantities[2] = sc.nextInt();
        }
        if (Q == 3) {
            System.out.println("Enter new quantity to be updated");
            pQuantities[3] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(products[i] + " " + pQuantities[i] + " " + specifications[i] + " " + price[i] + " "
                    + count[i] + "\n");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String products[] = { "WashingMachines", "AirConditioners", "Televisions", "Refrigerator" };
        int pQuantities[] = { 25, 20, 30, 35 };
        String specifications[] = { "LG,FrontLoad,8 KG,5 Star,Fully Automatic",
                "Whirlpool,3 Ton,5 Star,SplitSystem,Coppertubes",
                "Samsung,4K LED Display,55-inches,40W DolbyAtmos Speakers",
                "Panasonic,Double Door,500 Liters,inverter,Water Dispenser" };
        int price[] = { 47000, 52000, 56000, 60000 };
        int count[] = { 10, 13, 25, 20 };

        int choice;
        System.out.println("Select choice: \n");
        System.out.println("1.Product List");
        System.out.println("2.Product Count");
        System.out.println("3.View Product Details");
        System.out.println("4.Edit Product ");
        System.out.println("5.Update Inventory");
        choice = sc.nextInt();
        if (choice == 1)
            productList(products);
        if (choice == 2)
            productquantities(products, pQuantities);
        if (choice == 3)
            productDetails(specifications, price, count);
        if (choice == 4)
            editProduct(specifications, price, count);
        if (choice == 5)
            updateInventory(products, pQuantities, specifications, price, count);

    }
}
