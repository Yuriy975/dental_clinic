package com.example.dental_polyclinic;

import com.example.dental_polyclinic.collection.CollectionLogOfVisits;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Time_dateController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField time_field;

    @FXML
    private Button yes_button;

    @FXML
    private Button no_button;

    @FXML
    private TextField date_field;

    public String date_pacient;
    public String time_pacient;

    private Appointment appointment;

    private CollectionLogOfVisits collectionLogOfVisits = new CollectionLogOfVisits();

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
        date_field.setText(appointment.getDate());
        time_field.setText(appointment.getTime());
    }


    @FXML
    void Date_offer(ActionEvent event) {
    }

    @FXML
    void Time_offer(ActionEvent event) {
    }

    @FXML
    void YesClick(ActionEvent event) throws IOException {
        yes_button.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("confirm.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        ConfirmController appointmentList = fxmlLoader.getController();
        appointmentList.extDateTime(date_pacient,time_pacient);
        Stage stage = new Stage();
        stage.setTitle("Стоматолог");
        stage.setScene(scene);
        stage.close();
        stage.show();
    }


    @FXML
    void NoClick(ActionEvent event) {
        no_button.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("time_date.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("time_date");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void initialize() {

            int d1;
            int d2;
            d1 = 1 + (int) (Math.random()*30);
            d2 = (int) (Math.random()*9);
            String dt1 = Integer.toString(d1);
            String dt2 = Integer.toString(d2);
            date_pacient = new StringBuilder().append(dt1).append(".0").append(dt2).append(".2022").toString();
            date_field.setText(date_pacient);

            int t1;
            int t2;
            t1 = 9 + (int) (Math.random()*14);
            t2 = (int) (Math.random()*60);
            String tm1 = Integer.toString(t1);
            String tm2 = Integer.toString(t2);
            time_pacient = new StringBuilder().append(tm1).append(":").append(tm2).toString();
            time_field.setText(time_pacient);

    }
}
