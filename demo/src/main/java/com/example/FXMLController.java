package com.example;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblOut;
    @FXML
    private Label lblCliks;
    private Integer clicks = 0;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
        lblOut.setText("Hello World! " + clicks);
        clicks++;
        lblCliks.setText(clicks.toString());
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
