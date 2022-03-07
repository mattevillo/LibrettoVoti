package it.polito.tdp.librettovoti.model;
import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>();
	}
	

	public void add(Voto voto1) {
		voti.add(voto1);		
	}


	public String toString() {
		String s ="";
		for(Voto v: this.voti) {
			s= s+ v.toString()+"\n";
		}
		return s;
	}
		
	
	public Libretto votiUguali(int punteggio){
		Libretto risultato = new Libretto();
		for (Voto v: this.voti) {
			if (v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato = null;
		for (Voto v: this.voti) {
			if (v.getNome().equals(nomeCorso)) {
				risultato=v;
				break;
		}
	}
		return risultato;
	}
	

}
