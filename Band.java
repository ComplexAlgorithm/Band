
public class Band {
//instance variables
	private String name;
	private Musician musician1;  //reference to a musician object
	private Musician musician2;	 //reference to a musician object
	private Musician musician3;	 //reference to a musician object
	
	//default constructor
	public Band() {
		name = "";
		musician1 = null; //refers to no object
		musician2 = null;
		musician3 = null;
	}
	
	//non-static methods
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	public void setMusician1(Musician newMusician1) {
		musician1 = newMusician1;
	}
	public Musician getMusician1() {
		return musician1;
	}
	public void setMusician2(Musician newMusician2) {
		musician2 = newMusician2;
	}
	public Musician getMusician2() {
		return musician2;
	}
	public void setMusician3(Musician newMusician3) {
		musician3 = newMusician3;
	}
	public Musician getMusician3() {
		return musician3;
	}

	}


