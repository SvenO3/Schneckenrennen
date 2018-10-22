import java.util.ArrayList;

public class Rennen {
	
	String name;
	int teilnehmerzahl;
	float länge;
	
	ArrayList<Rennschnecke> teilnehmer = new ArrayList<Rennschnecke>();
	
	public Rennen (String name, float länge){
		
		this.name = name;
		this.länge = länge;
		
	}
	
	void addRennschnecke(Rennschnecke neueSchnecke){
		teilnehmer.add(neueSchnecke);
	}
	
	
	
	
	
	void removeRennschnecke(Rennschnecke schnecke){
		for(Rennschnecke schnegge : teilnehmer);
	}
	

}