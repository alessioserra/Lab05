package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	Model model = new Model();
	
	public void setModel(Model model) {
		this.model = model;
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private Button btnAnagramma;

    @FXML
    private TextArea txtResultCorretto;

    @FXML
    private TextArea txtResultErrato;

    @FXML
    private Button btnReset;

    @FXML
    void doAnagramma(ActionEvent event) {
    	
    	txtResultCorretto.clear();
    	txtResultErrato.clear();
    	
    	//Controllo sulla correttezza della parola
    	if (txtInput.getText().matches("[a-zA-Z]+")) {
    	
    	//Controllo sulla lunghezza della parola
    	if (txtInput.getText().length()>1) {
    	
    	//Applico metodo ricorsivo
    	List<String> stringa = model.calcolaAnagramma(txtInput.getText(), 0);
    	
    	//Stampare i valori
    	for (String s : stringa) {
    		if (model.isCorrect(s)==true) txtResultCorretto.appendText(s+"\n");
    		else txtResultErrato.appendText(s+"\n");
    	}
    	
    	}else  {
    		txtResultCorretto.appendText("Anagramma di una parola inutile\n");
    		txtResultErrato.appendText("Anagramma di una parola inutile\n");  	
    	}
    	
    	}else {
    		txtResultCorretto.appendText("Inserire solo caratteri alfabetici!\n");
    		txtResultErrato.appendText("Inserire solo caratteri alfabetici!\n"); 
    	}
    }

    @FXML
    void doReset(ActionEvent event) {

    	txtInput.clear();
    	txtResultCorretto.clear();
    	txtResultErrato.clear();
    	
    }

    @FXML
    void initialize() {
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnAnagramma != null : "fx:id=\"btnAnagramma\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResultCorretto != null : "fx:id=\"txtResultCorretto\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResultErrato != null : "fx:id=\"txtResultErrato\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}
