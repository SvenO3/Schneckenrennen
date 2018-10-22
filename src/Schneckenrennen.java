
public class Schneckenrennen {

	public static void main(String[] args) {
		Rennschnecke s1 = new Rennschnecke("Hans", "Glitscho", 3);
		Rennschnecke s2 = new Rennschnecke("Franz", "Rassanto", 5);
		
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
