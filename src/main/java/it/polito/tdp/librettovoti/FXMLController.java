package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Libretto model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Integer> cmbPunti;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtVoti;

    @FXML
    private Label txtStatus;
    
    @FXML
    void handleNuovoVoto(ActionEvent event) {
    	

    	String nome = txtNome.getText();
    	Integer punti = cmbPunti.getValue();
    	
    	if(nome.equals("") || punti==null) {
    		//ERRORE
    		txtStatus.setText("ERRORE: occore inserire nome e voto\n");
    		return;
    	}
    		
    		
    	
    	model.add(new Voto(nome, punti, LocalDate.now()));
    	
    	String contenutoLibretto = model.toString();
    	txtVoti.setText(contenutoLibretto);
    	
    	txtNome.clear();
    	cmbPunti.setValue(null);
    	txtStatus.setText("");
    }
    
    public void setModel(Libretto model) {
    	this.model=model;
    }

    @FXML
    void initialize() {
        assert cmbPunti != null : "fx:id=\"cmbPunti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoti != null : "fx:id=\"txtVoti\" was not injected: check your FXML file 'Scene.fxml'.";

        cmbPunti.getItems().clear();
        for (int p=18; p<=30; p++)
        	cmbPunti.getItems().add(p);     
    }

}
