package com.example.dental_polyclinic;

import com.example.dental_polyclinic.collection.CollectionLogOfVisits;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DentistController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label labelCount;
    @FXML
    private TableView<Appointment> tableView;

    @FXML
    private Button Exit;

    @FXML
    private TableColumn<Appointment, String> Date_pr;

    @FXML
    private TableColumn<Appointment, String> Time_pr;

    private CollectionLogOfVisits collectionLogOfVisits = new CollectionLogOfVisits();

    public void addRecord(String dt, String tm){
        collectionLogOfVisits.add(new Appointment(dt, tm));
    }

    @FXML
    void Exitaction(ActionEvent event) throws IOException {
        Exit.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("dental polyclinic");
        stage.setScene(scene);
        stage.close();
        stage.show();
    }

    @FXML
    void initialize() {

        Date_pr.setCellValueFactory(new PropertyValueFactory<>("date"));
        Time_pr.setCellValueFactory(new PropertyValueFactory<>("time"));

        collectionLogOfVisits.getAppointmentList().addListener(new ListChangeListener<Appointment>() {
            @Override
            public void onChanged(Change<? extends Appointment> change) {
                updateList();
            }
        });

        collectionLogOfVisits.fillTestData();
        tableView.setItems(collectionLogOfVisits.getAppointmentList());

    }



    public void updateList(){
        labelCount.setText("Кількість записів " + collectionLogOfVisits.getAppointmentList().size());
    }
}
