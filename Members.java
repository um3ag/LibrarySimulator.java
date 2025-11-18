
// github repo: https://github.com/um3ag/LibrarySimulator.java/tree/main
//Bilal Bazaraa 446109487
// Abdullah Fatani 446102126
// Badr Alsalim    446107156
public class Member {

    // -------- Instance Attributes --------
    private int id;
    private String name;
    private int borrowedCount;

    private int numViewBorrowed;
    private int numBorrows;
    private int numReturns;
    private double sessionFees;

    // -------- Static (shared) Attributes --------
    public static double TotalRevenue = 0;
    public static int TotalViewBorrowed = 0;
    public static int TotalBorrows = 0;
    public static int TotalReturns = 0;
      private boolean canBorrow() {
        return borrowedCount < 5;
    }
     public Member(int id, String name, int borrowedCount) {

    // -------- Constructor --------
    public Member(int id, String name, int borrowedCount) {
        this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
        reset(); // session stats start fresh
    }

    private boolean canReturn() {
        return borrowedCount > 0;
    }
    // -------- Private Helpers --------
    private boolean canBorrow() {
        return borrowedCount < 5;
    }

    private boolean canReturn() {
        return borrowedCount > 0;
    }

    // -------- Public Methods --------
    public void viewBorrowedCount() {
        System.out.println("Currently borrowed books: " + borrowedCount);
        numViewBorrowed++;
        TotalViewBorrowed++;
    }

    public boolean borrowOne() {
        if (!canBorrow()) {
            System.out.println("You cannot borrow more than 5 books.");
            return false;
        }

        borrowedCount++;
        numBorrows++;
        TotalBorrows++;
        sessionFees += 0.50;
        TotalRevenue += 0.50;

        System.out.println("Book borrowed successfully. Fee: 0.50 SR");
        return true;
    }

    public boolean returnOne() {
        if (!canReturn()) {
            System.out.println("You have no books to return.");
            return false;
        }

        borrowedCount--;
        numReturns++;
        TotalReturns++;

        System.out.println("Book returned successfully.");
        return true;
    }

    public void displayStatistics() {
        System.out.println("\n--- Session Summary for " + name + " ---");
        System.out.println("Times viewed count: " + numViewBorrowed);
        System.out.println("Books borrowed: " + numBorrows);
        System.out.println("Books returned: " + numReturns);
        System.out.printf("Session fees: %.2f SR\n", sessionFees);
    }

    public void reset() {
        numViewBorrowed = 0;
        numBorrows = 0;
        numReturns = 0;
        sessionFees = 0;
    }

    // Getters if needed
    public int getBorrowedCount() { return borrowedCount; }
}
