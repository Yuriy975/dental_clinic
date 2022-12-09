package com.example.dental_polyclinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginfield;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Button SendButton;

    //String f, g;

    @FXML
    void SendClick(ActionEvent event) throws IOException {
        String f = loginfield.getText();
        String g = passwordfield.getText();
        SendButton.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        HelloController hellocontroller = fxmlLoader.getController();
        hellocontroller.Stap1(f,g);
        Stage stage = new Stage();
        stage.setTitle("Стоматологічна клініка");
        stage.setScene(scene);
        stage.close();
        stage.show();
    }

    @FXML
    void initialize() {

    }
}
