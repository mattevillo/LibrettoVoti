package it.polito.tdp.librettovoti.model;



public class TestLibretto {

	public static void main(String[] args) {
		Libretto libretto = new Libretto();

		Voto voto1 = new Voto("Analisi 1", 30);

		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1", 28));
		libretto.add(new Voto("Informatica", 24));
		libretto.add(new Voto("Chimica", 25));
		
		System.out.println(libretto);
		
	}

}
