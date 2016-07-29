import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		int userInput = 0;
		String choice = "yes";
		System.out.println("Welcome to our java class!");
		// this expression gets it going
		while (choice.equalsIgnoreCase("yes")) {
			try { // try catch statements need to encompass the entire block of
					// code.

				// declare and initiate array

				String[][] studentInfo = { { "Sunny", "Simon", "Madalyn", "Janna" }, // studentInfo[0][userInpt] index
																						// //
																						// [0][userInput] 
						{ "Steak", "Buffalo Wings", "Pad Thai", "Hot and Sour Soup" }, // [1][userInput]
						{ "North Branch, MI", "Detroit, MI", "Scottsdale, AZ", "Flint,MI" } };// [2][userInput]

				System.out.println("Which student would you like to know more about? Enter a number 1-4");
				userInput = scan1.nextInt();
				scan1.nextLine();
				// userInput = userInput-1;

				// while (userInput > 4 || userInput < 1){
				// throw new IndexOutOfBoundsException();

				// try {
				// }
				System.out.println("Student " + userInput + " is " + studentInfo[0][userInput - 1]);
				System.out.println("What would you like to know about " + studentInfo[0][userInput - 1] + "? "
						+ "Enter hometown or favorite food");
				// can't use userInput here as a string, need to make a new
				// variable
				//while(userInput <= 20 && userInput>=1);
				
				String foodOrHometown = "";
				foodOrHometown =scan1.nextLine();

				if (foodOrHometown.equalsIgnoreCase("favorite food")) {
					System.out.println(
							studentInfo[0][userInput - 1] + "'s fave food is " + studentInfo[1][userInput - 1]);
					System.out
							.println("Would you like to know about the hometown of this student? Enter 'yes' or 'no'");
					choice = scan1.nextLine();
					if (choice.equalsIgnoreCase("yes")) {
						System.out.println(studentInfo[0][userInput - 1] + " is from " + studentInfo[2][0]);

						System.out.println("Continue to another student? Enter 'yes' or 'no'");
						choice = scan1.nextLine();
					}

					// else {
					// System.out.println("Continue to another student? Enter
					// 'yes' or 'no'");
					// choice = scan1.nextLine();
				

				else if (foodOrHometown.equalsIgnoreCase("hometown")) {
					System.out.println(studentInfo[0][userInput - 1] + " is from " + studentInfo[2][0]);

					System.out.println("Would you like to know about the favorite food of this student? Enter 'yes' or 'no'");
					choice = scan1.nextLine();
					if (choice.equalsIgnoreCase("yes")) {
					System.out.println(studentInfo[0][userInput - 1] + "'s fave food is " + studentInfo[1][userInput - 1]);

				System.out.println("Continue to another student? Enter 'yes' or 'no'");
				choice = scan1.nextLine();
					
				}
				else {
					System.out.println("You need to enter 'hometown' or 'favorite food'");
					System.out.println("Would you like to check out another student? Enter 'yes' or 'no' ");
					choice = scan1.nextLine();
			}
				}
					}
					
			}
			/*
			 * catch (IllegalArgumentException e) {
			 * 
			 * System.out.
			 * println("You need to enter 'hometown' or 'favorite food'.");
			 * 
			 * }
			 */

			catch (IndexOutOfBoundsException e) {
				System.out.println("Error!! Please enter a number between 1-4.");
			}
		}
	}
}
