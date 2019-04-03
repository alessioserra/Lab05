package it.polito.tdp.anagrammi.model;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import it.polito.tdp.anagrammi.dao.AnagrammaDAO;

public class Model {

	public boolean isCorrect(String anagramma) {
		AnagrammaDAO dao = new AnagrammaDAO();
		return dao.isCorrect(anagramma);
	}
	
    //ricorsione
	public List<String> calcolaAnagramma(String parola, int livello)
	{	
	    List<String> anagrammi = new LinkedList<String>();
		String parziale = "";
	    calcola(parziale,parola,livello,anagrammi);
		return anagrammi;
	}
	
	//Da richiamare sopra
	public void calcola(String parziale, String parola, int passo,List<String> anagrammi) {
		
		char[] c = parola.toCharArray();
		
		//Condizione di fine ricorsione per ogni anagramma
		if (passo==parola.length()) {
			anagrammi.add(parziale);
			return;
		}
		
		//Algoritmo
		for (int i=0 ; i<parola.length();i++) {
			
			//Filtro
			if( contaCaratteri(parziale,c[i]) < contaCaratteri(parola,c[i]) ){
                //Aggiungo carattere
				parziale = parziale + c[i];
				
				//RICORSIONE 
				calcola(parziale,parola,passo+1,anagrammi);
				
				//Backtracking (tolgo il carattere per passare al successivo)
				parziale=parziale.substring(0, parziale.length()-1);
				
			}
			
		}	
	}
	
	//Conto le lettere uguali contenute in una parola
	/**
	 * metodo per contare quanti caratteri c sono contenuti nella parola s
	 * @param s
	 * @param c
	 * @return
	 */
	public int contaCaratteri(String s, char c) {
		int somma=0;
		for (int i=0 ; i<s.length() ; i++) {
			if (s.charAt(i) == c) somma++;
		}
		return somma;
	}
	
}
