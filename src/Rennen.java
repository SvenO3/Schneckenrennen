import java.util.ArrayList;

public class Rennen {
	
	String name;
	int teilnehmerzahl;
	float l�nge;
	
	ArrayList<Rennschnecke> teilnehmer = new ArrayList<Rennschnecke>();
	
	public Rennen (String name, float l�nge){
		
		this.name = name;
		this.l�nge = l�nge;
		
	}
	
	void addRennschnecke(Rennschnecke neueSchnecke){
		teilnehmer.add(neueSchnecke);
	}
	
	
	
	
	
	void removeRennschnecke(Rennschnecke schnecke){
		for(Rennschnecke schnegge : teilnehmer);
	}
	

}