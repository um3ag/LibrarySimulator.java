
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
