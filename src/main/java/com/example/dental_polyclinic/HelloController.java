package com.example.dental_polyclinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends Time_dateController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EnterButton;

    @FXML
    private Button RegButton;

    String l1, p1;
    public void Stap1(String log1, String pass1){
        l1=log1;
        p1=pass1;
    }

    @FXML
    void RegClick(ActionEvent event) {
        RegButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reg.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Registration");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void EnterClick(ActionEvent event) throws IOException {
        EnterButton.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("enter.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        EnterController entercontroller = fxmlLoader.getController();
        entercontroller.Stap2(l1,p1);

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