package it.epicode.week3day5.models;

import java.time.LocalDate;

public class Libro extends Elemento {
	// Attributes
	private String autore;
	private String genere;

	public Libro(String codIsbn, String titolo, LocalDate pubblicazione, int pagine, String autore, String genere) {
		super(codIsbn, titolo, pubblicazione, pagine);
		this.autore = autore;
		this.genere = genere;
	}

	
	public String getAutore() {
		return autore;
	}


	public String getGenere() {
		return genere;
	}


	@Override
	public String toString() {
		return "- LIBRO   | titolo: " + this.getTitolo() + " | autore: " + autore + " | ISBN: " + this.getCodIsbn() + " | data di pubblicazione: " + this.getPubblicazione() + " | pagine: " + this.getPagine() +" | genere: " + genere + " |";
	}
}
