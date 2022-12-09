package com.example.dental_polyclinic;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ModalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Bzero;

    @FXML
    void Closewindow(ActionEvent event) {
        Bzero.getScene().getWindow().hide();
        Stage stage = new Stage();
        stage.close();
    }




    @FXML
    void initialize() {

    }
}
