package it.polito.tdp.anagrammi.model;

import java.util.*;

public class Parola {
	
	private String parola;
	private List<String> anagrammi;
	
	public Parola(String parola) {
		
		this.parola = parola;
		this.anagrammi = new LinkedList<String>();
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public List<String> getAnagrammi() {
		return anagrammi;
	}

	public void setAnagrammi(List<String> anagrammi) {
		this.anagrammi = anagrammi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parola == null) ? 0 : parola.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (parola == null) {
			if (other.parola != null)
				return false;
		} else if (!parola.equals(other.parola))
			return false;
		return true;
	}
	
	
	

}
