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

public class ConfirmController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button YesButton;

    @FXML
    private Button NoButton;

    @FXML
    void showDialog(ActionEvent event) {
        YesButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pacient.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Пацієнт");
            stage.setScene(new Scene(root1));
            stage.close();
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    String d2, t2;
    public void extDateTime(String d1, String t1){
        d2=d1;
        t2=t1;
    }

    @FXML
    void showDialog2(ActionEvent event) throws IOException {
            YesButton.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dentist.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            DentistController appointmentList = fxmlLoader.getController();
            appointmentList.addRecord(d2,t2);
            Stage stage = new Stage();
            stage.setTitle("Стоматолог");
            stage.setScene(scene);
            stage.close();
            stage.show();
    }

    @FXML
    void initialize() {

    }
}
