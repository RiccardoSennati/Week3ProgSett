package it.epicode.week3day5.models;

import java.time.LocalDate;

public class Utente {

	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private int numeroTessera;

//	CONSTRUCTORS -----------------------------------------
	public Utente() {

	}

	public Utente(String nome, String cognome, LocalDate dataNascita, int numeroTessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numeroTessera = numeroTessera;
	}

	// GETTERS / SETTERS -----------------------------------------
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public int getNumeroTessera() {
		return numeroTessera;
	}

	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}

}
