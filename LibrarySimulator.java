import java.util.Scanner;
//Bilal Bazaraa 446109487
// Abdullah Fatani 446102126
// Badr Alsalim    446107156



public class LibrarySimulator {
    public static void main(string args[]){
        Scanner input = new Scanner(system.in);

        // User predefined accounts
        // Includes: ID, Name, Borrowed books, Total session data and fees
       
        int user1_ID = "446109487";
        String user1_name = "Bilal";
        int user1_borrowed_books = 0;
        double user1_fees = 0;

        
         int user2_ID = "446109487";
        String user2_name = "Bilal";
        int user2_borrowed_books = 0;
        double user2_fees = 0;

         int user3_ID = "446109487";
        String user3_name = "Bilal";
        int user3_borrowed_books = 0;
        double user3_fees = 0;

        //Administrator stats
        double total_revenue = 0; // total money from borrowing
        int total_borrow = 0;
        int total_return = 0;

        // Main menu loop: for the interface
        //while loop
        while(true) {
        

        



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


