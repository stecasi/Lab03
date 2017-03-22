package it.polito.tdp.spellchecker.model;
import java.io.*;
import java.util.*;

public class Dictionary {
	
	private List <String> dizionarioItaliano = new LinkedList <String>();
	private List <String> dizionarioInglese = new LinkedList <String>();

	
	/*Metodo che permette di caricare in memoria il dizionario della lingua desiderata. A questo
	proposito, utilizzare i file Italian.txt e English.txt nella cartella rsc. I file contentengono una
	parola per riga. Salvare le parole del dizionario in una struttura dati appropriata. Di seguito
	viene riportato un esempio della sequenza di operazioni necessarie per leggere le parole dal
	file:
	*/
	
	public void loadDictionary(String language){
		if (language.toLowerCase().equals("english")){
			try {
				FileReader fr = new FileReader("rsc/English.txt");
				BufferedReader br = new BufferedReader(fr);
				String word;
				while ((word = br.readLine()) != null) {
				// Aggiungere parola alla struttura dati
					dizionarioItaliano.add(word);
				}
				br.close();
				} catch (IOException e){
				System.out.println("Errore nella lettura del file");
				}
		}
		else if (language.toLowerCase().equals("italian")){
			try {
				FileReader fr = new FileReader("rsc/Italian.txt");
				BufferedReader br = new BufferedReader(fr);
				String word;
				while ((word = br.readLine()) != null) {
				// Aggiungere parola alla struttura dati
					dizionarioInglese.add(word);
				}
				br.close();
				} catch (IOException e){
				System.out.println("Errore nella lettura del file");
				}
		}
	}

	
	
	public List<RichWord> spellCheckText(List<String> inputTextList) {
	return null;	
	}
}

