// GitHub Repository: https://github.com/um3ag/LibrarySimulator.java/tree/main
// Group Members:
// Bilal Bazaraa 446109487
// Abdullah Fatani 446102126
// Badr Alsalim 446107156

import java.util.Scanner;

public class LibrarySimulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // -------- Create Predefined Users --------
        Member m1 = new Member(446109487, "Bilal", 0);
        Member m2 = new Member(446102126, "Abdullah", 0);
        Member m3 = new Member(446107156, "Bader", 0);

        while (true) {

            System.out.println("\n===== Library Simulator =====");
            System.out.println("1. Login as " + m1.name);
            System.out.println("2. Login as " + m2.name);
            System.out.println("3. Login as " + m3.name);
            System.out.println("4. Admin Login");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            // ------------ Member Login ------------
            if (choice >= 1 && choice <= 3) {

                Member current;
                if (choice == 1) current = m1;
                else if (choice == 2) current = m2;
                else current = m3;

                System.out.println("\nWelcome " + current.name + "!");

                current.reset(); // new session starts

                while (true) {
                    System.out.println("\n--- Member Menu ---");
                    System.out.println("1. View borrowed books");
                    System.out.println("2. Borrow a book");
                    System.out.println("3. Return a book");
                    System.out.println("4. View session summary");
                    System.out.println("5. Logout");
                    System.out.print("Choose: ");

                    int userChoice = input.nextInt();

                    if (userChoice == 1)
                        current.viewBorrowedCount();
                    else if (userChoice == 2)
                        current.borrowOne();
                    else if (userChoice == 3)
                        current.returnOne();
                    else if (userChoice == 4)
                        current.displayStatistics();
                    else if (userChoice == 5) {
                        System.out.println("Logging out...");
                        break;
                    } else {
                        System.out.println("Invalid choice.");
                    }
                }
            }

            // ------------ Admin Login ------------
            if (choice == 4) {

                System.out.print("Enter admin password: ");
                int pass = input.nextInt();

                if (pass != 1234) {
                    System.out.println("WRONG PASSWORD! Access denied.");
                    continue;
                }

                while (true) {
                    System.out.println("\n--- Admin Menu ---");
                    System.out.println("1. View Total Revenue");
                    System.out.println("2. View Most Frequent Operation");
                    System.out.println("3. Exit Admin Menu");
                    System.out.print("Choose: ");

                    int adminC = input.nextInt();

                    if (adminC == 1) {
                        System.out.printf("Total Revenue: %.2f SR\n", Member.TotalRevenue);

                    } else if (adminC == 2) {
                        if (Member.TotalBorrows > Member.TotalReturns)
                            System.out.println("Most frequent operation: Borrow (" + Member.TotalBorrows + ")");
                        else if (Member.TotalReturns > Member.TotalBorrows)
                            System.out.println("Most frequent operation: Return (" + Member.TotalReturns + ")");
                        else
                            System.out.println("Both operations used equally.");

                    } else if (adminC == 3) {
                        System.out.println("Returning to main menu...");
                        break;
                    } else {
                        System.out.println("Invalid option.");
                    }
                }
            }
        }

        
    }
}
