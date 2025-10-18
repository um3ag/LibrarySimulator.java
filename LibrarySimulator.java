import java.util.Scanner;
//Bilal Bazaraa 446109487
// Abdullah Fatani 446102126
// Badr Alsalim    446107156



public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        // User predefined accounts
        // Includes: ID, Name, Borrowed books, Total session data and fees
       
        int user1_ID = 446109487;
        String user1_name = "Bilal";
        int user1_borrowed_books = 0;
        double user1_fees = 0;

        
         int user2_ID = 446102126;
        String user2_name = "Abdullah";
        int user2_borrowed_books = 0;
        double user2_fees = 0;

         int user3_ID = 446107156;
        String user3_name = "Bader";
        int user3_borrowed_books = 0;
        double user3_fees = 0; // using double because of the 0.50 credit fee

        //Administrator stats
        double total_revenue = 0; // total money from borrowing
        int total_borrow = 0;
        int total_return = 0;

        // Main menu loop: for the interface
        // we use a whilw loop so that the expression when using the interface is always true. Asking the user to select the option then reedirecting it into its designated user
        System.out.println("Hello! Welcome to Library Simulator, please choose an option.(1-5) ");
        while(true) {
        System.out.println(" 1. Login as " + user1_ID + " , ID: " + user1_name);
        System.out.println(" 2. Login as " + user2_ID + " , ID: " + user2_name);
        System.out.println(" 3. Login as " + user3_ID + " , ID: " + user3_name);
        System.out.println(" 4. Admin Login");
        System.out.println(" 5.Exit");
        
         int choice = input.nextInt();
         // User interface choices
         
         if (choice> 5) {
             System.out.println("Invalid Input! Please choose an option. (1-5)");
         }

           

         if (choice == 5) {
                System.out.println("Thank you for using Library Simulator. Have a nice day!");
                break; // exits the while loop, ends program
            }
        }




/* Note (Rules and Constraints) :
- You must use only concepts covered in the course.
- Do not use arrays.
- Do not use multiple classes (this version must be implemented in a single Java class).
- Format outputs using printf, \t, or substring to ensure:

Two decimal places for monetary values

Appropriate and readable output
- The program must not allow borrowing more than 5 books or returning books if none are borrowed.
- If the user attempts an invalid operation (e.g., borrowing the 6th book), show an appropriate error message.
Submission Rules:

Submit your solution as LibrarySimulator.java on LMS

The submitted Java file must include the names and ID numbers of all group members at the top as a comment

Only one student of each group needs to submit the project on behalf of the whole group

Code must compile and run with javac LibrarySimulator.java and java LibrarySimulator

Code style:
- Use clear variable names
- Indent properly
- Add short comments for key parts*/







