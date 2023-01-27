package it.epicode.week3day5.models;

import java.time.LocalDate;

public class Prestito {

	private Utente utente;
	private Elemento elementoPrestato;
	private LocalDate inizioPrestito;
	private LocalDate dataRestituzionePrevista;
	private LocalDate restituzioneEffettiva;
}
