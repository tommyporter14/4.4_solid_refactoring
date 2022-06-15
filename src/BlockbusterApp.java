import java.util.ArrayList;
import java.util.Scanner;

public class BlockbusterApp {

	public static void main(String[] args) {
		
		//scanner
		Scanner scnr = new Scanner(System.in);
		
		//array lists for movies and scenes
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		
		ArrayList<String> movieScenes2 = new ArrayList<>();
		movieScenes2.add("At the school");
		movieScenes2.add("Trip to Nepal");
		movieScenes2.add("Meeting Sallah in Egypt");
		movieScenes2.add("Opening of the Ark");
		
		ArrayList<String> movieScenes3 = new ArrayList<>();
		movieScenes3.add("The Shire");
		movieScenes3.add("Leaving for  Rivendell");
		movieScenes3.add("Fellowship meeting");
		movieScenes3.add("Frodo leaving for Mordor");
		
		ArrayList<String> movieScenes4 = new ArrayList<>();
		movieScenes4.add("Baby Harry");
		movieScenes4.add("You're a wizard");
		movieScenes4.add("Hogwarts");
		movieScenes4.add("Fight with Quirrell/Voldemort");
		
		ArrayList<String> movieScenes5 = new ArrayList<>();
		movieScenes5.add("Stark Industries");
		movieScenes5.add("Arc Reactor");
		movieScenes5.add("Fight with Stane");
		movieScenes5.add("S.H.I.E.L.D");
		
		ArrayList<String> movieScenes6 = new ArrayList<>();
		movieScenes6.add("Dewey kicked out of band");
		movieScenes6.add("Taking Ned's persona");
		movieScenes6.add("Teaching rock to kids");
		movieScenes6.add("Battle of the bands");
		
		ArrayList<Object> movies = new ArrayList <>();
		movies.add(new VHS("Star Wars: A New Hope", 121, movieScenes1));
		movies.add(new VHS("Indiana Jones: Raiders Of The Lost Ark", 105, movieScenes2));
		movies.add(new VHS("The Lord of the Rings: The Fellowship of the Ring", 178, movieScenes3));
		movies.add(new DVD("Harry Potter and the Sorcerer's Stone", 153, movieScenes4));
		movies.add(new DVD("Iron Man", 126, movieScenes5));
		movies.add(new DVD("School of Rock", 109, movieScenes6));
		
		
		//prompt and print movies
		printMenu();
		
		//get user choice
		int movieChoice = scnr.nextInt();
		
		//play movie
		boolean cont = false;
		scnr.nextLine();
		while(!cont) {	
			if(movieChoice == 1) {
				((VHS) movies.get(movieChoice - 1)).play(movieScenes1);	
			} else if (movieChoice == 2) {
				((VHS) movies.get(movieChoice - 1)).play(movieScenes2);
			} else if (movieChoice == 3) {
				((VHS) movies.get(movieChoice - 1)).play(movieScenes3);
			} else if (movieChoice == 4) {
				((DVD) movies.get(movieChoice - 1)).play(movieScenes4);
			} else if (movieChoice == 5) {
				((DVD) movies.get(movieChoice - 1)).play(movieScenes5);
			} else if (movieChoice == 6) {
				((DVD) movies.get(movieChoice - 1)).play(movieScenes6);
			}
			
			System.out.println("Would you like to continue? When reprompted with menu you can select a new movie or if "
					+ "\nyou wish to continue a VHS reselect it and the next scene will play. (y/n):");
			String choice = scnr.nextLine();
			if(choice.equals("y")) {
				cont = false;
			} else {
				cont = true;
			}
		}
		System.out.println("Goodbye!");
		scnr.close();
	}
	
	public static void printMenu() {
		System.out.println("Welcome to my Blockbuster App");
		System.out.println("Here is our list of movies:");
		System.out.println("1. Star Wars: A New Hope");
		System.out.println("2. Indiana Jones: Raiders Of The Lost Ark");
		System.out.println("3. The Lord of the Rings: The Fellowship of the Ring");
		System.out.println("4. Harry Potter and the Sorcerer's Stone");
		System.out.println("5. Iron Man");
		System.out.println("6. School of Rock");
		System.out.println("Which movie would you like to watch from the list above (enter 1-6)?:");
	}

}
