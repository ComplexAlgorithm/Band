	//instance variables
	//store the name of the musician
	//store the name of the instruments he or she plays
	
	//constructor that has a newName and newInstruments parameter
	//and the values of the instance variables are set to the values
	//stored in the parameters
	
	//non-static methods
	//setName
	//getName
	
	//setInstruments
	//getInstruments
public class Musician {
private String nameOfMusician;
private String nameOfInstruments;

public Musician(String newName, String newInstruments) {
	nameOfMusician = newName;
	nameOfInstruments = newInstruments;
}
public void setName(String newName) {
	nameOfMusician = newName;
}
public String getName() {
	return nameOfMusician;
}
public void setInstruments(String newInstruments) {
	nameOfInstruments = newInstruments;
}
public String getInstruments() {
	return nameOfInstruments;
}
}
