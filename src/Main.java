
public class Main {

	public static void main(String[] args) {
		Rennschnecke s1 = new Rennschnecke("Hans", "Glitscho", 3);
		Rennschnecke s2 = new Rennschnecke("Franz", "Rassanto", 5);
		
		Rennen r1 = new Rennen("Bilster Berg", 12);
		
		r1.addRennschnecke(s1);
		r1.addRennschnecke(s2);
		
		s1.krieche();
		System.out.println(s1);
		s1.krieche();
		System.out.println(s1);
		
		System.out.println(" ");
		
		s2.krieche();
		System.out.println(s2);
		s2.krieche();
		System.out.println(s2);



	}

}
