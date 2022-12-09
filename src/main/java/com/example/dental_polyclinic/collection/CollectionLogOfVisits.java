package com.example.dental_polyclinic.collection;

import com.example.dental_polyclinic.Appointment;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CollectionLogOfVisits implements LogOfVisits{

    @Override
    public void add(Appointment appointment) {
        appointmentList.add(appointment);
    }

    @Override
    public void save(Appointment appointment) {
    }

    @Override
    public void update(Appointment appointment) {
    }

    @Override
    public void delete(Appointment appointment) {
    }

    ObservableList<Appointment> appointmentList = FXCollections.observableArrayList();

    public ObservableList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ObservableList<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public void print(){
        int number = 0;
        for(Appointment a: appointmentList) {
            number++;
            System.out.println(number+"date"+a.getDate()+"time"+a.getTime());
        }
    }

    public void fillTestData(){
        appointmentList.add(new Appointment("08.06.2022","9:00"));
        appointmentList.add(new Appointment("28.11.2022","16:00"));
        appointmentList.add(new Appointment("29.11.2022","12:00"));
        appointmentList.add(new Appointment("11.10.2022","10:30"));
        appointmentList.add(new Appointment("01.08.2022","14:00"));
        appointmentList.add(new Appointment("05.16.2022","10:00"));
    }

}
