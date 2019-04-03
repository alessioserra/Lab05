package it.polito.tdp.anagrammi.controller;

import java.net.URL;
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
