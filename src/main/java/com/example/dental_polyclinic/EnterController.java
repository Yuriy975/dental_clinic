package com.example.dental_polyclinic;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EnterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField logfield;

    @FXML
    private PasswordField passfield;

    @FXML
    private Button modalAction;


    @FXML
    private Button Regbtn;

    String login, password;

    public void Stap2(String log2, String pass2)
    {
        login=log2;
        password=pass2;
        logfield.setText(log2);
        passfield.setText(pass2);
    }

    @FXML
    void showDialog(ActionEvent actionEvent) throws IOException {
        if (login != null && password != null) {
            modalAction.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("confirm.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Як увійти?");
            stage.setScene(scene);
            stage.close();
            stage.show();
        } else {
            logfield.setText("Ви не зареєстровані!");
            System.out.println("Enter was succefull");
            try {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("modal.fxml"));
                stage.setTitle("Як увійти?");
                stage.setResizable(false);
                stage.setScene(new Scene(root));
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
                stage.show();
            } catch(Exception e){
                System.out.println("Error!");
            }

        }
    }


    @FXML
    void Regaction(ActionEvent event) {
        Regbtn.getScene().getWindow().hide();
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
    void initialize() {

    }
}