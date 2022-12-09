package com.example.dental_polyclinic;

import javafx.beans.property.SimpleStringProperty;

public class Appointment {

    private SimpleStringProperty date = new SimpleStringProperty("");
    private SimpleStringProperty time = new SimpleStringProperty("");

    public Appointment() {
    }

    public Appointment(String date, String time) {
        this.date = new SimpleStringProperty(date);
        this.time = new SimpleStringProperty(time);
    }

    public String getDate() {return date.get();}

    public void setDate(String date) {this.date.set(date);}

    public String getTime() {
        return time.get();
    }
    public void setTime(String time) {
        this.time.set(time);
    }

    public SimpleStringProperty dateProperty() {return date;}

    public SimpleStringProperty timeProperty() {return time;}
}
