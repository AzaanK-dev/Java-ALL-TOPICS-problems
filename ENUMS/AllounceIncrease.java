// Create a program for increase in allounce based on qualification using enums.

import java.util.Scanner;

enum Qualification {
    PRIMARY,
    SECONDARY,
    HIGHER_SECONDARY,
    INTERMEDIATE,
    UNDERGRADUATE,
    GRADUATE,
    MASTERS,
    PHD
}

public class AllounceIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your qualification level (1–8): ");
        int choice = sc.nextInt();
        Qualification q;
        String increase = "";
        switch (choice) {
            case 1 -> {
                q = Qualification.PRIMARY;
                increase = "0%";
            }
            case 2 -> {
                q = Qualification.SECONDARY;
                increase = "0%";
            }
            case 3 -> {
                q = Qualification.HIGHER_SECONDARY;
                increase = "10%";
            }
            case 4 -> {
                q = Qualification.INTERMEDIATE;
                increase = "20%";
            }
            case 5 -> {
                q = Qualification.UNDERGRADUATE;
                increase = "30%";
            }
            case 6 -> {
                q = Qualification.GRADUATE;
                increase = "35%";
            }
            case 7 -> {
                q = Qualification.MASTERS;
                increase = "40%";
            }
            case 8 -> {
                q = Qualification.PHD;
                increase = "50%";
            }
            default -> {
                System.out.println("Unqualified!");
                return;
            }
        }
        System.out.println("Your qualification is: " + q);
        System.out.println("Your increase is: " + increase);
    }
}
