package it.epicode.week3day5.gestioneCatalogo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import it.epicode.week3day5.models.Archivio;
import it.epicode.week3day5.models.Elemento;
import it.epicode.week3day5.models.Libro;
import it.epicode.week3day5.models.Periodicita;
import it.epicode.week3day5.models.Prestito;
import it.epicode.week3day5.models.Rivista;
import it.epicode.week3day5.models.Tipo;
import it.epicode.week3day5.models.Utente;
import model.DAO.ElementoDAO;

public class Main {

	public static void main(String[] args) {
	
		Elemento e1 = new Libro("1234", "Twilight", LocalDate.of(2021, 1, 2), 240, "Stephenie Meyer", "Romantico");
		Elemento e2 = new Libro("5432", "Pinocchio", LocalDate.of(2022, 1, 2), 180, "Carlo Collodi", "Bambini");
		Elemento e3 = new Rivista("4321", "Uomini e Donne", LocalDate.of(2022, 1, 2), 20, Periodicita.SETTIMANALE);
		
		ElementoDAO.saveElement(e1);
		ElementoDAO.saveElement(e2);
		ElementoDAO.saveElement(e3);
		
//		ElementoDAO.deleteByISBN("1234");
		ElementoDAO.getByISBN("5432");
		ElementoDAO.getByAnno(2022);
		ElementoDAO.getByAutore("Carlo Collodi");
		ElementoDAO.getByTitolo("Pi");
		
		Utente u1 = new Utente("Riccardo", "Sennati", LocalDate.of(2002, 1, 4), 123);
		Utente u2 = new Utente("Laura", "Rose", LocalDate.of(2001, 10, 6), 456);
		ElementoDAO.saveElement(u1);
		ElementoDAO.saveElement(u2);
		
		Prestito p1 = new Prestito(u1, e1, LocalDate.of(2023, 1, 25), LocalDate.of(2023, 6, 4));
		Prestito p2 = new Prestito(u2, e2, LocalDate.of(2023, 1, 30), null);
		Prestito p3 = new Prestito(u1, e1, LocalDate.of(2023, 1, 25), LocalDate.of(2023, 6, 4));
		Prestito p4 = new Prestito(u2, e3, LocalDate.of(2022, 1, 30), null);
		ElementoDAO.saveElement(p1);
		ElementoDAO.saveElement(p2);
		ElementoDAO.saveElement(p3);
		ElementoDAO.saveElement(p4);
		ElementoDAO.getElementiPrestati(456);
		ElementoDAO.getPrestitiScaduti();
		
}
}