// A simple console-based Admin Inventory System where the admin logs in with a password, adds multiple items, 
// purchases items, restocks items, and views all items using a menu-driven interface.

import java.util.Scanner;
class Item {
    String name;
    int qty;
    public Item(String name, int qty){
        this.name = name;
        this.qty = qty;
    }
    public void purchase(){
        if(qty >= 1){
            qty--;
            System.out.println("Item Purchased!");
        } else {
            System.out.println("Out of Stock!");
        }
    }
    public void reStock(int amount){
        qty += amount;
        System.out.println("Item Restocked!");
    }
}

public class ItemsStockManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ------------ ADMIN LOGIN ------------
        System.out.println("----- ADMIN LOGIN -----");
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(!pass.equals("admin123")){
            System.out.println("Wrong Password! Access Denied.");
            return;
        }

        Item[] items = new Item[50];  // max 50 items
        int count = 0;

        System.out.println("\nLOGIN SUCCESSFUL!");

        while(true){
            System.out.println("\n--------- ADMIN MENU ---------");
            System.out.println("1. Add New Item");
            System.out.println("2. Purchase Item");
            System.out.println("3. Restock Item");
            System.out.println("4. View All Items");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine(); 
            
            if(ch == 1){            // ------------ ADD NEW ITEM ------------
                System.out.print("Enter Item Name: ");
                String n = sc.nextLine();

                System.out.print("Enter Quantity: ");
                int q = sc.nextInt();

                items[count] = new Item(n, q);
                count++;

                System.out.println("Item Added Successfully!");
            }
            else if(ch == 2){       // ------------ PURCHASE ------------
                System.out.print("Enter Item Name to Purchase: ");
                String n = sc.nextLine();
                boolean found = false;
                for(int i = 0; i < count; i++){
                    if(items[i].name.equalsIgnoreCase(n)){
                        items[i].purchase();
                        found = true;
                        break;
                    }
                }
                if(!found) System.out.println("Item Not Found!");
            }
            else if(ch == 3){           // ------------ RESTOCK ------------
                System.out.print("Enter Item Name to Restock: ");
                String n = sc.nextLine();

                boolean found = false;

                for(int i = 0; i < count; i++){
                    if(items[i].name.equalsIgnoreCase(n)){
                        System.out.print("Enter Restock Amount: ");
                        int amt = sc.nextInt();
                        items[i].reStock(amt);
                        found = true;
                        break;
                    }
                }
                if(!found) System.out.println("Item Not Found!");
            }
            else if(ch == 4){           // ------------ VIEW ITEMS ------------
                System.out.println("\n----- ITEM LIST -----");
                for(int i = 0; i < count; i++){
                    System.out.println((i+1) + ". " + items[i].name + " | Qty: " + items[i].qty);
                }
                if(count == 0) System.out.println("No Items Added Yet!");
            }
            else if(ch == 5){       // ------------ EXIT ------------
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid Option!");
            }
        }
        sc.close();
    }
}
