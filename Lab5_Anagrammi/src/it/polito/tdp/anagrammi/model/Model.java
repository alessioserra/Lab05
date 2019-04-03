package it.polito.tdp.anagrammi.model;
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
		
		
		//
		calcola();
		
		return null;
	}
	
	//da richiamare
	public void calcola() {
		
	}
	
	//Metodo per calcolare fattoriale
	public static int fattoriale(int x) {
        if ( x > 1 ) {
            return ( x * fattoriale( x - 1 ) );
        } else {
            return 1;
        }
    }
}