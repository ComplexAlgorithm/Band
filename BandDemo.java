import java.util.Scanner;
public class BandDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Band myFavoriteBand = new Band();
		int option;
		
		do {
			System.out.println("Press 0 to change the name of the band.");
			System.out.println("Press 1 to change the first musician.");
			System.out.println("Press 2 to change the second musician.");
			System.out.println("Press 3 to change the third musician.");
			System.out.println("Press 4 to view all the information about the band.");
			System.out.println("Press 5 to end the program.");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next Line
			
			if(option == 0) {
				System.out.println("What is the new name of the band?");
				String newName = keyboard.nextLine();
				myFavoriteBand.setName(newName);
			}
			else if(option == 1) {
				System.out.println("Whats the name of the first musician?");
				String newName = keyboard.nextLine();
				
				System.out.println("What instruments does the first musician play?");
				String newInstruments = keyboard.nextLine();
				
				Musician newMusician1 = new Musician(newName,newInstruments); //creates the first musician object
				myFavoriteBand.setMusician1(newMusician1); //adds the first musician to the band
			}
			else if(option == 2) {
				System.out.println("Whats the name of the second musician?");
				String newName = keyboard.nextLine();
				
				System.out.println("What instruments does the second musician play?");
				String newInstruments = keyboard.nextLine();
				
				Musician newMusician2 = new Musician(newName,newInstruments); //creates second music object
				myFavoriteBand.setMusician2(newMusician2); //adds the second musician to the band
			}
			else if(option == 3) {
				System.out.println("Whats the name of the third musician?");
				String newName = keyboard.nextLine();
				
				System.out.println("What instruments does the third musician play?");
				String newInstruments = keyboard.nextLine();
				
				Musician newMusician3 = new Musician(newName,newInstruments); //creates third musician object
				myFavoriteBand.setMusician3(newMusician3); //adds the third musician to the band
			}
			else if(option == 4) {
				System.out.println("Name: " + myFavoriteBand.getName());
				
				Musician m1 = myFavoriteBand.getMusician1();
				System.out.println("Name: " + m1.getName());
				System.out.println("Instruments: " + m1.getInstruments());
				
				Musician m2 = myFavoriteBand.getMusician2();
				System.out.println("Name: " + m2.getName());
				System.out.println("Instruments: " + m2.getInstruments());
				
				Musician m3 = myFavoriteBand.getMusician3();
				System.out.println("Name: " + m3.getName());
				System.out.println("Instruments: " + m3.getInstruments());
			}
			else if (option == 5) {
				System.out.println("Goodbye!");
			}
			else if(option < 0 || option > 5) {
				System.out.println("Error!");
			}
		}while(option != 5);
	}
}
