//Create three objects of the Musician class using the constructor
		//print the information about each object to the screen
import java.util.Scanner;
public class MusicianDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Musician dimebagDarrell = new Musician("dimebagDarrell","guitar");
		System.out.println("Name of Musician: " + dimebagDarrell.getName());
		System.out.println("Instrument played: " + dimebagDarrell.getInstruments());
		
		Musician vinniePaul = new Musician("vinniePaul", "drums");
		System.out.println("Name of Musician: " + vinniePaul.getName());
		System.out.println("Instrument played: " + vinniePaul.getInstruments());
		
		Musician philAnselmo = new Musician("philAnselmo", "vocals");
		System.out.println("Name of Musician: " + philAnselmo.getName());
		System.out.println("Instrument played: " + philAnselmo.getInstruments());     
		

	}

}
