package it.polito.tdp.librettovoti.model;


public class Voto {
	
	private String nome;
	private int voto;
	
	/**
	 * Costruttore della classe voto
	 * @param nome
	 * @param voto
	 * @param data
	 */
	public Voto(String nome, int voto) {
		super();
		this.nome = nome;
		this.voto = voto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}


	@Override
	public String toString() {
		return "Esame "+nome+" superato con "+voto;
	}


}
