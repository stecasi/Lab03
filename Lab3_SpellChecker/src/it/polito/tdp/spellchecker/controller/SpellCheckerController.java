package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SpellCheckerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> cmbLanguage;

    @FXML
    private TextArea txtAreaInsert;

    @FXML
    private Button btnCheck;

    @FXML
    private TextArea txtAreaWrong;

    @FXML
    private Label lblError;

    @FXML
    private Button btnClear;

    @FXML
    private Label lblTime;

    @FXML
    void doClearText(ActionEvent event) {
    	txtAreaInsert.clear();
    	txtAreaWrong.clear();
    	lblError.setText("");
    	lblTime.setText("");
    	
    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert cmbLanguage != null : "fx:id=\"cmbLanguage\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtAreaInsert != null : "fx:id=\"txtAreaInsert\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnCheck != null : "fx:id=\"btnCheck\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtAreaWrong != null : "fx:id=\"txtAreaWrong\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert lblError != null : "fx:id=\"lblError\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert lblTime != null : "fx:id=\"lblTime\" was not injected: check your FXML file 'SpellChecker.fxml'.";

        cmbLanguage.getItems().addAll("English","Italian");
        if (cmbLanguage.getItems().size()>0)
            cmbLanguage.setValue(cmbLanguage.getItems().get(0));
    }
    
}
