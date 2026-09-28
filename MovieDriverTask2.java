// CMSC203 Lab 1 - Task 2
// Name: Gabriela Million
// Description: this program asks for the movie title number of tickets sold and the rating

import java.util.Scanner;

public class MovieDriverTask2 {

	public static void main(String[] args) {

		// make a Scanner so we can read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// this starts as "y" so the loop runs at least one time
		String again = "y";

		// keep looping while the user types y
		while (again.equals("y")) {

			// make a new movie object (we don't need to save the old ones)
			Movie movie = new Movie();

			// ask for the title and set it
			System.out.println("Enter the title of a movie");
			String title = keyboard.nextLine();
			movie.setTitle(title);

			// ask for the rating and set it
			System.out.println("Enter the movie's rating");
			String rating = keyboard.nextLine();
			movie.setRating(rating);

			// ask for the tickets sold and set it
			System.out.println("Enter the number of tickets sold at an unnamed theater");
			int tickets = keyboard.nextInt();
			movie.setSoldTickets(tickets);

			// nextInt leaves the enter key behind, so this line reads and throws it away
			keyboard.nextLine();

			// print the movie info using toString
			System.out.println(movie.toString());

			// ask if they want to go again
			System.out.println("Do you want to enter another movie? (y/n)");
			again = keyboard.nextLine();
		}
	}
}
