package com.example.dental_polyclinic;

import com.example.dental_polyclinic.collection.CollectionLogOfVisits;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 712);
        stage.setTitle("dental polyclinic");
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
        stage.setScene(scene);
        stage.show();
        test();
    }


    public void test() {
        CollectionLogOfVisits collectionLogOfVisits = new CollectionLogOfVisits();
        collectionLogOfVisits.fillTestData();
        collectionLogOfVisits.print();
    }



    public static void main(String[] args) {
        launch();
    }
}