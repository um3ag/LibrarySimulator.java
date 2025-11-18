
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
        this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
        reset(); // session stats start fresh
    }

    private boolean canReturn() {
        return borrowedCount > 0;
    }
