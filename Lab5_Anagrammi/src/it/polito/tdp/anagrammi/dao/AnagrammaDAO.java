package it.polito.tdp.anagrammi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class AnagrammaDAO {
	
	/**
	 * Metodo per verificare la correttezza dell'anagramma
	 * @param anagramma
	 * @return TRUE se anagramma presente nel database, FALSE altrimenti
	 */
	public boolean isCorrect(String anagramma) {
		
		final String sql = "SELECT * FROM parola p WHERE p.nome=?";
		int flag=0;
		
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			
			//Setto la variabile
			st.setString(1, anagramma);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				//Se la query trova un risultato la parola e' contenuta, quindi return true
				flag=1;
			}
            //Chiudo connessione
			conn.close();
			
			if (flag==1) return true;	
			else return false;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}

}
