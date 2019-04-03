package it.polito.tdp.anagrammi.model;
import it.polito.tdp.anagrammi.dao.AnagrammaDAO;

public class Model {

	public boolean isCorrect(String anagramma) {
		AnagrammaDAO dao = new AnagrammaDAO();
		return dao.isCorrect(anagramma);
	}
	
}
