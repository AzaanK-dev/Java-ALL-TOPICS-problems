// Write a Java program that stores weekly sales data of multiple branches in a 2D array. The user should choose whether to view total sales by Branch ID or by Day number. Use loops, input validation, and proper summation.

import java.util.Scanner;

public class SalesManagementSystem {
    public static void main(String[] args) {
        int[][] sales = {
            { 50, 20, 15, 15 },
            { 61, 90, 48, 42 },
            { 38, 52, 71, 36 }
        };
        int cols = 4, rows = 3, sum = 0, input = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choose 1 or 2: \n 1.By id \n 2.By day");
            input = sc.nextInt();
        } while (input != 1 && input != 2);

        if (input == 1) {
            int choice;
            do {
                System.out.println("Choose any one in following: ");
                for (short i = 1; i <= rows; i++) {
                    System.out.println(i + ". B24" + i);
                }
                choice = sc.nextInt();
            } while (choice!=1 && choice!=2 && choice!=3);

            for (short i = 0; i < cols; i++) {
                sum += sales[choice - 1][i];
            }
            System.out.println("Sales by id B24" + choice + ": " + sum);
        } 
        else {
            int choice;
            do {
                System.out.println("Choose any one in following: ");
                for (short i = 1; i <= cols; i++) {
                    System.out.println(i + ". Day " + i);
                }
                choice = sc.nextInt();
            } while (choice!=1 && choice!=2 && choice!=3 && choice!=4);

            for (short i = 0; i < rows; i++) {
                sum += sales[i][choice - 1];
            }
            System.out.println("Sales on Day " + choice + ": " + sum);
        }
        sc.close();
    }
}
