package com.example.dental_polyclinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PacientController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private Button cleaning;

    @FXML
    private Button protez;

    @FXML
    private Button delete;

    @FXML
    private Button vurucn;

    @FXML
    private Button obstesh;


    @FXML
    void prot(ActionEvent event) {
        protez.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("time_date.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Date time");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void vidb(ActionEvent event) {
        cleaning.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("time_date.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Date time");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void vurv(ActionEvent event) {
        vurucn.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("time_date.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Date time");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void vudl(ActionEvent event) {
        delete.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("time_date.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Date time");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }


    @FXML
    void osth(ActionEvent event) {
        obstesh.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("time_date.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Date time");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void initialize() {


    }
}

