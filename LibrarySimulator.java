import java.util.Scanner;
//Bilal Bazaraa 446109487
// Abdullah Fatani 446102126
// Badr Alsalim    446107156



public class Main {
	public static void main(String [] args) {
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
			// User Login
			if (choice >= 1 && choice <= 3) {
				int Borrowed_session = 0;
				int Returned_session = 0;
				double Session_fees = 0.0;
				int total_borrowed = 0;
				int numberbooksborrow = 0;
				String current_User = "";
				// If selected these are what will show
				if (choice == 1) {
					total_borrowed = user1_borrowed_books;
					current_User = user1_name;
					System.out.println("Welcome Bilal ! ");

				} else if (choice ==2) {
					total_borrowed = user2_borrowed_books;
					current_User = user2_name;
					System.out.println("Welcome Abdullah !");
				} else if (choice == 3) {
					total_borrowed = user3_borrowed_books;
					current_User = user3_name;
					System.out.println("Welcome Bader !");
					//ADMIN LOGIN
				}



				//User Operations menu

				while(true) {
					System.out.println("Select between (1-5): ");
					System.out.println(" 1. View borrowed books count");
					System.out.println(" 2. Borrow Book ");
					System.out.println(" 3. Return Book ");
					System.out.println(" 4. View session summary ");
					System.out.println(" 5. Exit to Main Menu ");

					int UserChoice = input.nextInt();

					if (UserChoice == 1) {
						System.out.println("Currently borrowed books: " + total_borrowed);
						// Books Borrowed
					} else if (UserChoice ==2) {
						if (total_borrowed >= 5) {
							System.out.println("You cannot borrow more books! Select another option.");
							//Incriments for borrow
						} else {//Incriments for borrow
							Borrowed_session++;
							total_borrowed++;
							Session_fees += 0.50;
							total_revenue +=0.50;
							total_borrow++;
							numberbooksborrow++;
							System.out.printf("You borrowed a book. Fee: %.2f SR\n", 0.50);
							System.out.println("You now have "+ numberbooksborrow + " borrowed");

						}
						// Books Returned
					} else if (UserChoice == 3) {
						if (total_borrowed <= 0) {
							System.out.print("You don't have any books to return!");
						} else { // Decrements and increments for return
							Borrowed_session--;
							Returned_session++;
							total_return++;
							numberbooksborrow--;
							System.out.println("You have returned a book");
							System.out.println("You now have "+ numberbooksborrow + " borrowed");
						}

						//Number 4 shows session summary
					} else if (UserChoice == 4) {
						System.out.println("\n Session Summary: ");
						System.out.println("Books Borrowed: " + Borrowed_session);
						System.out.println("Books Returned: " + Returned_session);
						System.out.println("Total fees:" + Session_fees);
					} else if (UserChoice == 5) {
						System.out.println("Returning to Main Menu. ");
						//resets
						if (choice == 1) user1_borrowed_books = Borrowed_session;
						else if (choice == 2) user2_borrowed_books = Borrowed_session;
						else user3_borrowed_books = Borrowed_session;
						break;



					} else {
						System.out.println("Invalid Input. Select another option");
					}












				}
			}


		}




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








